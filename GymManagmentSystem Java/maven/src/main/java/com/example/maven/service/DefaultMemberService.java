package com.example.maven.service;

import com.example.maven.pojo.Member.CreateMemberInput;
import com.example.maven.pojo.Member.Member;
import com.example.maven.pojo.Member.MemberRepository;
import com.example.maven.pojo.Trainer.Trainer;
import com.example.maven.repository.MmemberRepository;
import com.example.maven.repository.TtrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DefaultMemberService implements MemberService {

    @Autowired
    private MmemberRepository mmemberRepository;
    @Autowired
    private TtrainerRepository ttrainerRepository;

    @Override
    public Member create( Integer trainerId,CreateMemberInput input) {
        Trainer trainer=ttrainerRepository.findTrainerById(trainerId);
        Member member=new Member();
        member.setId(input.getId());
        member.setName(input.getName());
        member.setPhone(input.getPhone());
        member.setTrainer(trainer);

        return mmemberRepository.save(member);
    }


//    @Autowired
//    private TtrainerRepository ttrainerRepository;
//
//    @Override
//    public ArrayList<Member> findAll() {
//        return (ArrayList<Member>) memberRepository.findAll();
//    }
//
//    @Override
//    public Member findOneById(Integer id) {
//        return memberRepository.findById(id);
//    }
//
//    @Override
//    public ArrayList<Member> findAllByTrainer() {
//        return null;
//    }
//
//    @Override
//    public Member create(Integer id, String name, Integer phone, Integer trainerId) {
//       Trainer trainer=ttrainerRepository.findTrainerById(trainerId);
//
//       Member member=new Member();
//       member.setId(id);
//       member.setName(name);
//       member.setPhone(phone);
//       member.setTrainer(trainer);
//        return memberRepository.save(member);
//    }
//
//    @Override
//    public Member edit(Integer id, String name) {
//        return null;
//    }
//
//    @Override
//    public void delete(Integer id) {
//
//    }
//}
//    @Override
//    public ArrayList<Member> findAll() {
//        return memberRepository.findAll();
//    }
//
//    @Override
//    public Member findOneById(Integer id) {
//        return memberRepository.findOneById(id);
//    }
//
//    @Override
//    public ArrayList<Member> findAllByTrainer() {
//        return null;
//    }
//
//    @Override
//    public Member create(Integer id, String name, Integer phone,Trainer trainer) {
//        Member member=new Member(id,name,phone,trainer);
//        return memberRepository.save(member);
//    }
//
//    @Override
//    public Member edit(Integer id, String name) {
//        return memberRepository.edit(id,name);
//    }
//
//    @Override
//    public void delete(Integer id) {
//        memberRepository.delete(id);
    }

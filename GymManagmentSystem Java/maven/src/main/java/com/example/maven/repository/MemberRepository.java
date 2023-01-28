//package com.example.maven.repository;
//
//import com.example.maven.pojo.Member.Member;
//import org.springframework.stereotype.Repository;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class MemberRepository {
//
//    public ArrayList<Member> findAll(){
//        return readFromFile();
//    }
//    public Member findOneById(Integer id){
//        for (Member member: readFromFile()){
//            if(member.getId().equals(id)){
//                return member;
//            }
//        }
//        return null;
//    }
//    public Member save(Member member) {
//        try {
//            FileWriter writer = new FileWriter("members.csv", true);
//            writer.write(member.toCsvString());
//            writer.write("\n");
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }
////        postsInDB.add(post);
//        return member;
//    }
//    public Member edit(Integer id, String name) {
//        ArrayList<Member> allMembers= readFromFile();
//        for (Member member: allMembers) {
//            if (member.getId().equals(id)) {
//                member.setName(name);
//                recreateCsvFile(allMembers);
//                return member;
//            }
//        }
//
//        return null;
//    }
//    public void delete(Integer id){
//        ArrayList<Member>allMembers=readFromFile();
//        for(Member member: allMembers){
//            if(member.getId().equals(id)){
//                allMembers.remove(member);
//                recreateCsvFile(allMembers);
//            }
//        }
//    }
//    private void recreateCsvFile(ArrayList<Member> allMembers) {
//        try {
//            FileWriter writer = new FileWriter("members.csv");
//            for (Member member: allMembers) {
//                writer.write(member.toCsvString());
//                writer.write("\n");
//            }
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }
//    }
//    private static ArrayList<Member> readFromFile() {
//        ArrayList<Member> members = new ArrayList<>();
//        try {
//            File file = new File("members.csv");
//            Scanner reader = new Scanner(file);
//
//            while (reader.hasNext()) {
//                String row = reader.nextLine();
//                String[] memberData = row.split(",");
//                Member member = new Member
//                        (Integer.valueOf(memberData[0]),
//                                memberData[1],
//                                Integer.valueOf(memberData[2]));
//
//                members.add(member);
//            }
//
//            reader.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException();
//        }
//
//        return members;
//    }
//
//
//}

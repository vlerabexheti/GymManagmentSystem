package com.example.maven;

import com.example.maven.pojo.Equipments.Equipments;
import com.example.maven.pojo.Trainer.Trainer;
import com.example.maven.repository.EquipmentsRepository;
import com.example.maven.repository.TtrainerRepository;
import com.example.maven.service.DefaultTrainerService;
import com.example.maven.service.EquipmentsService;
import com.example.maven.service.TrainerService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class MavenApplicationTests {


	@Autowired
	private TtrainerRepository ttrainerRepository;

	@Autowired
	private EquipmentsRepository equipmentsRepository;


	Trainer trainer;

	Equipments equipments;

	@BeforeEach
	void setUp(){
		trainer=new Trainer();
		equipments=new Equipments();
	}
	@Test
	public void ShouldSaveTrainers() {
		Trainer trainer=new Trainer(null,"John1",21);
		Trainer savedTrainer=ttrainerRepository.save(trainer);
		assertThat(savedTrainer).usingRecursiveComparison().ignoringFields("id").isEqualTo(trainer);

	}
	@Test
	public void ShouldSaveEquipments(){
		Equipments equipments1=new Equipments(null,"bycicle",300,3);
		Equipments savedEquipments=equipmentsRepository.save(equipments1);
		assertThat(savedEquipments).usingRecursiveComparison().ignoringFields("id").isEqualTo(equipments1);
	}
	@Test
	public void testFindTrainerById(){
		Trainer trainer1=new Trainer();
		trainer1.setId(90);
		trainer1.setName("Ana");
		trainer1.setAge(30);

		Trainer foundTrainer=ttrainerRepository.findTrainerById(90);

		Assertions.assertNotEquals(89,foundTrainer);

	}
	@Test
	public void DeleteEquipment(){
		Equipments equipments1=new Equipments();
		equipments1.setId(13);
		equipments1.setName("Treadmil");
		equipments1.setPrice(500);
		equipments1.setQuantity(3);

		Equipments savedEquipment=equipmentsRepository.save(equipments1);

		equipmentsRepository.deleteById(equipments1.getId());
	}
}

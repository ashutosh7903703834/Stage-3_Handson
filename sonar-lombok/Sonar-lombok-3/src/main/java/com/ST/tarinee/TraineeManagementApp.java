package com.ST.tarinee;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ST.trainee.model.Trainee;
import com.ST.trainee.service.TraineeService;

@SpringBootApplication
public class TraineeManagementApp {
	final static org.jboss.logging.Logger LOGGER = LoggerFactory.logger(TraineeManagementApp.class);
	private static TraineeService traineeService;
	public static void main(String args[]) {
		ApplicationContext context = SpringApplication.run(TraineeManagementApp.class, args);
		SpringApplication.run(TraineeManagementApp.class, args);
		LOGGER.info("Inside Main");
		context.getBean(Trainee.class);
		testRegisterTrainee();
		testRemoveTrainee();
		testFindByName();
		testFindAll();

	}
	private static void testFindAll() {
		// TODO Auto-generated method stub
		LOGGER.info("Start find all");
		traineeService.findAll();
		LOGGER.info("End find all");
	}
	private static void testFindByName() {
		// TODO Auto-generated method stub
		LOGGER.info("Start find by name");
		traineeService.findByName("shashwat");
		LOGGER.info("End find by name");
	}
	private static void testRemoveTrainee() {
		// TODO Auto-generated method stub
		LOGGER.info("Start remove trainee");
		traineeService.removeTrainee(871438);
		LOGGER.info("End remove trainee");
		
	}
	private static void testRegisterTrainee() {
		// TODO Auto-generated method stub
		LOGGER.info("Start register trainee");
		Trainee t = new Trainee();
		t.setCohortCode("AAA890A5");
		t.setEmail("shashwattiwari8@gmail.com");
		t.setEmpID(111890);
		t.setName("Shashwat Tiwari");
		traineeService.registerTrainee(t);
		LOGGER.info("End register trainee");
	}

}

package com.ST.patient;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ST.patient.model.ClinicCalender;
import com.ST.patient.model.PatientAppointment;
import com.ST.patient.service.PatientService;

@SpringBootApplication
public class PatientManagementApp {
	final static org.jboss.logging.Logger LOGGER = LoggerFactory.logger(PatientManagementApp.class);
	private static PatientService patientService;

	public static void main(String args[]) throws ParseException {
		ApplicationContext context = SpringApplication.run(PatientManagementApp.class, args);
		SpringApplication.run(PatientManagementApp.class, args);
		LOGGER.info("Inside Main");
		// Get the bean class
		context.getBean(PatientAppointment.class);
		context.getBean(ClinicCalender.class);
		testAddAppointment();
		testviewAppointment();
	}

	private static void testAddAppointment() throws ParseException {
		// TODO Auto-generated method stub
		LOGGER.info("Start -> Start Add Appointment");
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
		PatientAppointment p = new PatientAppointment();
		p.setName("shashwat");
		p.setAppointmentDate(sdformat.parse("2021-05-17"));
		ClinicCalender c= new ClinicCalender();
		patientService.addAppointment(c, p);
		LOGGER.info("Start -> End Add Appointment");
		
	}

	private static void testviewAppointment() {
		// TODO Auto-generated method stub
		LOGGER.info("Start -> Start View Appointment");
		ClinicCalender c= new ClinicCalender();
		patientService.viewAllAppointment(c);
		LOGGER.info("Start -> End View Appointment");
		
		

	}

}

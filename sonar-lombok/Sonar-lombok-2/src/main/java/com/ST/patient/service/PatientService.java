package com.ST.patient.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ST.patient.model.ClinicCalender;
import com.ST.patient.model.PatientAppointment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PatientService {
	final static org.jboss.logging.Logger LOGGER = LoggerFactory.logger(PatientService.class);
	PatientAppointment f = new PatientAppointment();
	public static List<PatientAppointment> patientlist = new ArrayList<>();

	public boolean addAppointment(ClinicCalender c, PatientAppointment p) {
		if (c != null) {
			List<PatientAppointment> li = c.getPatientAppointment();
			for (PatientAppointment pa : li) {
				if (pa.appointmentDate.compareTo(p.getAppointmentDate()) == 0) {
					LOGGER.info("Time not available!");
					return false;
				}
			}
			patientlist.add(p);
			c.setPatientAppointment(patientlist);
			return true;
		}
		return false;
	}

	public void viewAllAppointment(ClinicCalender c) {
		for (int i = 0; i < c.getPatientAppointment().size(); i++) {
			LOGGER.info(patientlist.get(i));
		}
	}
}

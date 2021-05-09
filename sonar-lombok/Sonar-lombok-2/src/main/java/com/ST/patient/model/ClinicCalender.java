package com.ST.patient.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ClinicCalender {

	private List<PatientAppointment> patientAppointment;
	public ClinicCalender() {
		// TODO Auto-generated constructor stub
	}

}

package com.ST.patient.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class PatientAppointment {
	public String name;
	public Date appointmentDate;

	public PatientAppointment() {
		// TODO Auto-generated constructor stub
	}

}
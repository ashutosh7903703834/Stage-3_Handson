package com.ST.trainee.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Trainee {
	public String name;
	public String email;
	public int empID;
	public String cohortCode;

	public Trainee() {
		// TODO Auto-generated constructor stub
		}
	
}
package com.ST.flight.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Flight {
	public String id;
	public String FlightType;
	public List<Passenger> passengers;

	public Flight() {
		// TODO Auto-generated constructor stub
		}
	
}
package com.ST.flight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ST.flight.model.Flight;
import com.ST.flight.model.Passenger;

@Service
public class FlightService {
	Flight f = new Flight();
	public static List<Flight> flightlist = new ArrayList<>();
//	flightlist.add(new Flight(1001,"economy",new Passenger()));
	public boolean addPassenger(Passenger p) {
		if (p != null) {
			if (f.getFlightType().equalsIgnoreCase("economy")) {
				return false;
			} else {
				if (p.isVip()) {
					f.setPassengers((List<Passenger>) p);
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public boolean removePassenger(Passenger p) {
		int i = 0;
		for (Passenger obj : f.passengers) {
			if (obj.getName().equals(p.getName())) {
				if (!p.isVip()) {
					f.passengers.remove(i);
					return true;
				} else {
					return false;
				}
			}
			i++;
		}
		return false;
	}
	public boolean addFlight(Flight f)
	{
		if(f!=null)
		{
			flightlist.add(f);
			return true;
		}
		return false;
		
	}
	
}

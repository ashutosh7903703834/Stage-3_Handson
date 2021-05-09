package com.ST.flight;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ST.flight.model.Flight;
import com.ST.flight.model.Passenger;
import com.ST.flight.service.FlightService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class FlightManagementApp {
	final static org.jboss.logging.Logger LOGGER = LoggerFactory.logger(FlightManagementApp.class);
	private static FlightService flightService;

	public static void main(String args[]) {
		ApplicationContext context = SpringApplication.run(FlightManagementApp.class, args);
		LOGGER.info("Inside Main");
		// Get the bean class
		context.getBean(Flight.class);
		context.getBean(Passenger.class);
		testAddPassenger();
		testRemovePassenger();
	}

	public static void testAddPassenger() {
		LOGGER.info("Start -> Add Passenger");
		Passenger p = new Passenger();
		p.setName("Shashwat");
		p.setVip(true);
		flightService.addPassenger(p);
		LOGGER.info("End -> Add Passenger");
	}

	public static void testRemovePassenger() {
		LOGGER.info("Start -> Remove Passenger");
		Passenger p = new Passenger();
		flightService.removePassenger(p);
		LOGGER.info("End -> Remove Passenger");

	}

}

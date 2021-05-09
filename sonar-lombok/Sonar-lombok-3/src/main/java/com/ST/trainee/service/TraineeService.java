package com.ST.trainee.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ST.tarinee.TraineeManagementApp;
import com.ST.trainee.model.Trainee;

@Service
public class TraineeService {
	final static org.jboss.logging.Logger LOGGER = LoggerFactory.logger(TraineeManagementApp.class);
	Trainee ts = new Trainee();
	public static List<Trainee> traineelist = new ArrayList<>();
	public void findAll()
	{
		for(Trainee t : traineelist)
		{
			LOGGER.info(t);
		}
	}
	public List<Trainee> findByName(String name)
	{
		List<Trainee> li = new ArrayList<>();
		for(Trainee t : traineelist)
		{
			if(t.getName().equalsIgnoreCase(name))
			{
				LOGGER.info("Employee Found");
				li.add(t);
			}
		}
		return li;
	}
	public boolean registerTrainee(Trainee t) {
		if (t != null) {
			traineelist.add(t);
			return true;
		}
		return false;
	}

	public boolean removeTrainee(int empID) {
		int i = 0;
		for (Trainee obj : traineelist) {
			if (obj.getEmpID()==(empID))
			{
					traineelist.remove(i);
					return true;
			} 
			i++;
		}
		LOGGER.info("Employee not found!");
		return false;
	}
}

package com.cognizant.ormlearn.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.ormlearn.OrmLearnApplication;
import com.cognizant.ormlearn.model.Country;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Service
public class DepartmentService {
	@Autowired
	com.cognizant.ormlearn.repository.DepartmentRepository departmentRepository;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	public DepartmentService() {
		// TODO Auto-generated constructor stub
	}
	@Transactional
	public Employee get(int id) {
	LOGGER.info("Start");
	return employeeRepository.findById(id).get();
	}
	
	@Transactional
	public void save(Employee employee) {
	LOGGER.info("Start");
	employeeRepository.save(employee);
	LOGGER.info("End");
	}

}

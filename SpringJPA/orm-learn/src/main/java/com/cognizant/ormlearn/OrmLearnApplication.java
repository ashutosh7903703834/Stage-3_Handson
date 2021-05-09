package com.cognizant.ormlearn;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class);
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);
		skillService = context.getBean(SkillService.class);
		LOGGER.info("Inside main");
		testGetAllCountries();
		testFindCountryLike();
		testFindCountryLikeasc();
		testFindCountryLikealp();
		testGetEmployee();
	}
	
	private static void testGetEmployee() {

		LOGGER.info("Start");

		Employee employee = employeeService.get(1);

		LOGGER.debug("Employee:{}", employee);

		LOGGER.debug("Department:{}", employee.getDepartment());

		LOGGER.info("End");

		}
	
	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries = countryService.getAllCountries();

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

		}
//	Hands On 1.1
	private static void testFindCountryLike() {

		LOGGER.info("Start");

		List<Country> countries = countryService.findCountryLike("ou");

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

		}

//	Hands On 1.2
	private static void testFindCountryLikeasc() {

		LOGGER.info("Start");

		List<Country> countries = countryService.findCountryLikeasc("ou");

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

		}

//	Hands On 1.3
	private static void testFindCountryLikealp() {

		LOGGER.info("Start");

		List<Country> countries = countryService.findCountryLikealp('s');

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

		}
}

package sg.edu.nus.demo;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class Sa49demoApplication {

	private static final Logger Log=LoggerFactory.getLogger(Sa49demoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Sa49demoApplication.class, args);
	}

@Bean
public CommandLineRunner demo(EmployeeRepository repo) {
return(args) ->{
	Log.info("Object");
	List<Employee> empList = new ArrayList<Employee>();
	Employee e = new Employee(1,"Tin",1000.0,"ISS");
	Employee e1 = new Employee(2,"Suria",1200.0,"ISS");
	Employee e2 = new Employee(3,"Cha Wah",1200.0,"NUS");
	empList.add(e);
	empList.add(e1);
	empList.add(e2);
	repo.saveAll(empList);
	Log.info("Employee All"+e);
	for(Employee empy:repo.findAll())
	{
		Log.info("Employee "+empy.getId()+" "+empy);
	}
};
}
}
package sg.edu.nus.demo.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.*;

import jdk.internal.org.jline.utils.Log;

@SpringBootApplication
public class TestOneToOneApplication {
	private static final Logger log = LoggerFactory.getLogger(TestOneToOneApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestOneToOneApplication.class, args);
	}

	@Bean
	public CommandLineRunner demoOnetoOne(EmployeeRepository empRepo, PacklingSpaceRepository packRepo) {
		return (args) -> {
//			List<Student> studentList = new ArrayList<Student>();
//			Student s1 = new Student("Dilbert","geek","iss java",123.45,5.0);
//			Student s2 = new Student("Dogbert","ceo","iss slavery",123.45,3.0);
//			Student s3 = new Student("Catbert","hr","iss soft skill",123.45,4.0);
//			studentList.add(s1);
//			studentList.add(s2);
//			studentList.add(s3);
//			repo.saveAll(studentList);
//			Log.info("All Student");
//			for(Student stu:repo.findAll())
//			{
//				Log.info("Student "+stu.getId()+" "+stu);
//			}
//			Log.info("All Student By Id and Cgpa ");
//			for(Student stu:repo.findByIdAndCgpa(1, 5.0))
//			{
//				Log.info("Student "+stu.getId()+" "+stu);
//			}
//			
//			Log.info("Number of Student By Fee : "+repo.countByFees(123.45));
//			
//			Log.info("Searching Student By Nick Name ");
//			for(Student stu:repo.searchingForGeek("g%"))
//			{
//				Log.info("Student "+stu.getId()+" "+stu);
//			}
		log.info("One to One Relationship Sample");
		log.info("Parking Space Inserting ");
		List<PacklingSpace> parkList = new ArrayList<PacklingSpace>();
		PacklingSpace p1= new PacklingSpace(1,"USN Car Park");
		PacklingSpace p2 = new PacklingSpace(2,"S Car Park");
		PacklingSpace p3 = new PacklingSpace(1,"stown Car Park");
		parkList.add(p1);
		parkList.add(p2);
		parkList.add(p3);
		packRepo.saveAll(parkList);
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee("T",12345,p1);
		Employee e2 = new Employee("AA",12345,p2);
		Employee e3 = new Employee("A",12345,p3);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empRepo.saveAll(empList);
		log.info("Employee List");
		for(Employee emp:empRepo.findAll())
		{
			log.info("Employee "+emp.getId()+" "+emp);
		}
		};
	}
}

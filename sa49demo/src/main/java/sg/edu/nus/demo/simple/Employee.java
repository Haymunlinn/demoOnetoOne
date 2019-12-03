package sg.edu.nus.demo.simple;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private long salary;
	@OneToOne
	@JoinColumn(name="PSPACE_ID")
	private PacklingSpace parkingSpace;
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", parkingSpace=" + parkingSpace + "]";
	}
	public Employee(String name, long salary, PacklingSpace parkingSpace) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.parkingSpace = parkingSpace;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public PacklingSpace getParkingSpace() {
		return parkingSpace;
	}
	public void setParkingSpace(PacklingSpace parkingSpace) {
		this.parkingSpace = parkingSpace;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

}

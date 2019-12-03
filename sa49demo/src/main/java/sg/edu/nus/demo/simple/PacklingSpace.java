package sg.edu.nus.demo.simple;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PARKING_SPACE")
public class PacklingSpace {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int lot;
	private String location;

	public PacklingSpace() {
		super();
	}

	public PacklingSpace( int lot, String location) {
		super();
	
		this.lot = lot;
		this.location = location;
	}

	@Override
	public String toString() {
		return "PacklingSpace [id=" + id + ", lot=" + lot + ", location=" + location + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLot() {
		return lot;
	}

	public void setLot(int lot) {
		this.lot = lot;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
		PacklingSpace other = (PacklingSpace) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}

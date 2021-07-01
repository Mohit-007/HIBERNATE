package PQR.XYZ.ABC;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
	private int marks;
	
//	@OneToOne
//	private Laptop laptop ;
	
	@OneToMany(mappedBy = "student",fetch=FetchType.EAGER)
	private List<Laptop> laptop = new ArrayList<Laptop>();

//	@ManyToMany(mappedBy = "student")
//	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	
	/*
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	*/
	
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}

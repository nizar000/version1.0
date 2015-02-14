package pi.dev.entities;

import java.io.Serializable;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;



@Entity
public class Rank  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_rank;
	private String name_rank;
	private int Salary;
	private String Description ;
	private List<Employee> employees;
	

	
	public Rank(String name_rank, int salary, String description,
			List<Employee> employees) {
		super();
		this.name_rank = name_rank;
		Salary = salary;
		Description = description;
		this.employees = employees;
	}
	public Rank() {
		super();
	}
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_rank() {
		return id_rank;
	}
	public void setId_rank(int id_rank) {
		this.id_rank = id_rank;
	}
	public String getName_rank() {
		return name_rank;
	}
	public void setname_rank(String name_rank) {
		this.name_rank = name_rank;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Lob
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

   @OneToMany(mappedBy="rank")
	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public void setName_rank(String name_rank) {
		this.name_rank = name_rank;
	}
	
	@Override
	public String toString() {
		return name_rank + " " + Salary
				+ " " + Description;
	}
	 


}

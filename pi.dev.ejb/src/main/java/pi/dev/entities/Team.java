package pi.dev.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Team implements Serializable {
	
	
private static final long serialVersionUID = 1L;
	
	private int id_Team;
    private String Speciality;
    private List<Employee> employees;
    
    
    

	@Override
	public String toString() {
		return Speciality;
	}
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_Team() {
		return id_Team;
	}
	public void setId_Team(int id_Team) {
		this.id_Team = id_Team;
	}
	public String getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	@OneToMany(mappedBy="team")
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Team(int id_Team, String speciality) {
		super();
		this.id_Team = id_Team;
		Speciality = speciality;
	}
	public Team() {
		super();
	}
	
    
    
	
	
    
}

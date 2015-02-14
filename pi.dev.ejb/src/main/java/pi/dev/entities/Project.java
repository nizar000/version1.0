package pi.dev.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;




@Entity
public class Project implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	private Date deadLine;
	private Date startDate;
	private Date endDate;
	private String description;
	private String name;
//	private List<Task> employees;
	private List<ProjectEmp> ListEmployees;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Lob
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
/*	@OneToMany(mappedBy="project")
	public List<Task> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Task> employees) {
		this.employees = employees;
	}*/
	@OneToMany(mappedBy="project")
	public List<ProjectEmp> getListEmployees() {
		return ListEmployees;
	}
	public void setListEmployees(List<ProjectEmp> listEmployees) {
		ListEmployees = listEmployees;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(Date deadLine, Date startDate, Date endDate,
			String description) {
		super();
		this.deadLine = deadLine;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}
	

	@Override
	public String toString() {
		return deadLine + " " + startDate
				+ " " + endDate + " " + description;
	}

}

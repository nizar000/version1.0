package pi.dev.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;



@Entity
public class Task implements Serializable{

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  
	  private int id_task;
	  
	
	  private Project project;
	    private String skills;
		private String description;
		private Date deadLine ;
		private Date startDate;
		private Date endDate;
		private int Complexity;
		private ProjectEmp proEmp;
	  
	


	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Lob
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public int getComplexity() {
		return Complexity;
	}

	public void setComplexity(int complexity) {
		Complexity = complexity;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_task() {
		return id_task;
	}

	public void setId_task(int id_task) {
		this.id_task = id_task;
	}
	@ManyToOne
	public ProjectEmp getProEmp() {
		return proEmp;
	}

	public void setProEmp(ProjectEmp proEmp) {
		this.proEmp = proEmp;
	}

	public Task() {
		super();
	}
	

}

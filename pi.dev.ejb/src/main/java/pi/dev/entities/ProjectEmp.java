package pi.dev.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
@IdClass(ProjectEmpId.class)
public class ProjectEmp implements Serializable{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	  private int employeeId;
	  @Id
	  private int projectId;
	  
	  @ManyToOne
	  @JoinColumn(name = "employeeId", updatable = false, insertable = false, referencedColumnName = "id")
	  private Employee employee;
	  
	  @ManyToOne
	  @JoinColumn(name = "projectId", updatable = false, insertable = false, referencedColumnName = "id")
	  private Project project;
	  private boolean IsTeamLeader;
	  @OneToMany(mappedBy="proEmp")
	  private List<Task> tasks;
	  
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public boolean isIsTeamLeader() {
		return IsTeamLeader;
	}
	public void setIsTeamLeader(boolean isTeamLeader) {
		IsTeamLeader = isTeamLeader;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public ProjectEmp() {
		super();
	}
	@Override
	public String toString() {
		return employeeId + " "
				+ projectId + " " + IsTeamLeader;
	}
	  
}

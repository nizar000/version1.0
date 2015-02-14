package pi.dev.entities;

import java.io.Serializable;


public class ProjectEmpId implements Serializable{

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int employeeId;

	  private int projectId;

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + projectId;
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
		ProjectEmpId other = (ProjectEmpId) obj;
		if (employeeId != other.employeeId)
			return false;
		if (projectId != other.projectId)
			return false;
		return true;
	}
	  

	@Override
	public String toString() {
		return employeeId + " "
				+ projectId ;
	}

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
	
	  
}

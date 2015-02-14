package pi.dev.entities;

import java.io.Serializable;

public class TaskId implements Serializable {

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int employeeId;

	  private int projectId;
	  

	  

	public int hashCode() {
	    return (int)(employeeId + projectId);
	  }

	  public boolean equals(Object object) {
	    if (object instanceof TaskId) {
	      TaskId otherId = (TaskId) object;
	      return (otherId.employeeId == this.employeeId) && (otherId.projectId == this.projectId);
	    }
	    return false;
	  }

	  @Override
		public String toString() {
			return employeeId + " " + projectId;
		}
	}
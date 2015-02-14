package pi.dev.entities;

import java.io.Serializable;

public class ActivityInvitationId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int employeeId;

	  private int activityId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + activityId;
		result = prime * result + employeeId;
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
		ActivityInvitationId other = (ActivityInvitationId) obj;
		if (activityId != other.activityId)
			return false;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  employeeId
				+ " " + activityId;
	}
	  
	  
}

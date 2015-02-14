package pi.dev.entities;

import java.io.Serializable;

public class ExternalFormativeInvitationId implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int employeeId;

	  private int formativeExterneId;

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + formativeExterneId;
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
		ExternalFormativeInvitationId other = (ExternalFormativeInvitationId) obj;
		if (employeeId != other.employeeId)
			return false;
		if (formativeExterneId != other.formativeExterneId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return employeeId
				+ "=" + formativeExterneId;
	}

	  

}

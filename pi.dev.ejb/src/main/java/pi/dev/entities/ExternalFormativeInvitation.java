package pi.dev.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ExternalFormativeInvitationId.class)
public class ExternalFormativeInvitation implements Serializable{
	
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	  private int employeeId;
	  @Id
	  private int formativeExterneId;
	  
	  @ManyToOne
	  @JoinColumn(name = "employeeId", updatable = false, insertable = false, referencedColumnName = "id")
	  private Employee employee;
	  
	  @ManyToOne
	  @JoinColumn(name = "formativeExterneId", updatable = false, insertable = false, referencedColumnName = "id")
	  private ExternalFormative formativeExterne;

	

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getFormativeExterneId() {
		return formativeExterneId;
	}

	public void setFormativeExterneId(int formativeExterneId) {
		this.formativeExterneId = formativeExterneId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public ExternalFormative getFormativeExterne() {
		return formativeExterne;
	}

	public void setFormativeExterne(ExternalFormative formativeExterne) {
		this.formativeExterne = formativeExterne;
	}

	public ExternalFormativeInvitation() {
		super();
	}
	@Override
	public String toString() {
		return  employeeId
				+ " " + formativeExterneId;
	}
	  
}

package pi.dev.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(InernalFormativeInvitationId.class)
public class InernalFormativeInvitation {

	  @Id
	  private int employeeId;
	  @Id
	  private int InternalFormativeId;
	  
	  @ManyToOne
	  @JoinColumn(name = "employeeId", updatable = false, insertable = false, referencedColumnName = "id")
	  private Employee employee;
	  
	  @ManyToOne
	  @JoinColumn(name = "InternalFormativeId", updatable = false, insertable = false, referencedColumnName = "id")
	  private InternalFormative InternalFormative;

	@Override
	public String toString() {
		return employeeId
				+ " " + InternalFormativeId;
	}
	  
}

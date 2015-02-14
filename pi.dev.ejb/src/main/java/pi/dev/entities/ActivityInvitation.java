package pi.dev.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(ActivityInvitationId.class)
public class ActivityInvitation {

   	  @Id
	  private int employeeId;
	  @Id
	  private int activityId;
	
	  @ManyToOne
	  @JoinColumn(name = "employeeId", updatable = false, insertable = false, referencedColumnName = "id")
	  private Employee employee;
	  
	  @ManyToOne
	  @JoinColumn(name = "activityId", updatable = false, insertable = false, referencedColumnName = "id")
	  private Activity activity;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public ActivityInvitation() {
		super();
	}

	@Override
	public String toString() {
		return employeeId + " "
				+ activityId + " " + employee + " "
				+ activity;
	}
	  
	  
	  
	  
}

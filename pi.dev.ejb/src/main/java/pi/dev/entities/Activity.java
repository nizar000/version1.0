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

public class Activity implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private int id_Activity;
	private String nameAct;
	
	private String descriptionAct;
	private Date dateAct;
	private List<ActivityInvitation> employees;
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_Activity() {
		return id_Activity;
	}
	public void setId_Activity(int id_Activity) {
		this.id_Activity = id_Activity;
	}
	public String getNameAct() {
		return nameAct;
	}
	public void setNameAct(String nameAct) {
		this.nameAct = nameAct;
	}
	@Lob
	public String getDescriptionAct() {
		return descriptionAct;
	}
	public void setDescriptionAct(String descriptionAct) {
		this.descriptionAct = descriptionAct;
	}
	public Date getDateAct() {
		return dateAct;
	}
	public void setDateAct(Date dateAct) {
		this.dateAct = dateAct;
	}
	
	@OneToMany(mappedBy="activity")
	public List<ActivityInvitation> getEmployees() {
		return employees;
	}
	public void setEmployees(List<ActivityInvitation> employees) {
		this.employees = employees;
	}
	public Activity(int id_Activity, String nameAct, String descriptionAct,
			Date dateAct) {
		super();
		this.id_Activity = id_Activity;
		this.nameAct = nameAct;
		this.descriptionAct = descriptionAct;
		this.dateAct = dateAct;
	}
	public Activity() {
		super();
	}
	@Override
	public String toString() {
		return  nameAct+" "+descriptionAct+" "+dateAct;
	}
	
	
	
	

}

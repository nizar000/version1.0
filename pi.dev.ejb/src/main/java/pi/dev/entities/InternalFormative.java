package pi.dev.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class InternalFormative implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String subject;
	private String Description ;
	private Date date ;
	private List<InernalFormativeInvitation> employees;
	
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Lob
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@OneToMany(mappedBy="InternalFormative")
	public List<InernalFormativeInvitation> getEmployees() {
		return employees;
	}
	public void setEmployees(List<InernalFormativeInvitation> employees) {
		this.employees = employees;
	}
	public InternalFormative(int id, String subject, String description,
			Date date) {
		super();
		this.id = id;
		this.subject = subject;
		Description = description;
		this.date = date;
	}
	public InternalFormative() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	  
}

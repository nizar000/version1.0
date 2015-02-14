package pi.dev.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity

public class ExternalFormative implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	private int id_FormativeExterne;
	private String description_FormativeExterne;
	private String name_FormativeExterne;
	private ExternalFormative externalFormatives ;
	private List<ExternalFormativeInvitation> employees;

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_FormativeExterne() {
		return id_FormativeExterne;
	}
	public void setId_FormativeExterne(int id_FormativeExterne) {
		this.id_FormativeExterne = id_FormativeExterne;
	}
	public String getDescription_FormativeExterne() {
		return description_FormativeExterne;
	}
	public void setDescription_FormativeExterne(String description_FormativeExterne) {
		this.description_FormativeExterne = description_FormativeExterne;
	}
	public String getName_FormativeExterne() {
		return name_FormativeExterne;
	}
	public void setName_FormativeExterne(String name_FormativeExterne) {
		this.name_FormativeExterne = name_FormativeExterne;
	}
	
   @OneToMany(mappedBy="formativeExterne")
	public List<ExternalFormativeInvitation> getEmployees() {
		return employees;
	}
	public void setEmployees(List<ExternalFormativeInvitation> employees) {
		this.employees = employees;
	}
	@ManyToOne
	public ExternalFormative getExternalFormatives() {
		return externalFormatives;
	}
	public void setExternalFormatives(ExternalFormative externalFormatives) {
		this.externalFormatives = externalFormatives;
	}
	public ExternalFormative(int id_FormativeExterne,
			String description_FormativeExterne, String name_FormativeExterne) {
		super();
		this.id_FormativeExterne = id_FormativeExterne;
		this.description_FormativeExterne = description_FormativeExterne;
		this.name_FormativeExterne = name_FormativeExterne;
	}
	public ExternalFormative() {
		super();
	}
	
	@Override
	public String toString() {
		return id_FormativeExterne
				+ " "
				+ description_FormativeExterne + " "
				+ name_FormativeExterne;
	}
	
	

}

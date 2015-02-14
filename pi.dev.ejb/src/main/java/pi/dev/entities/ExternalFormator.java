package pi.dev.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class ExternalFormator implements Serializable  {
	
	
	private static final long serialVersionUID = 1L;
	
	
	private int id_FormatorExternal;
	private String name_FormatorExternal;
	private String speciality_FormatorExternal;
	private String email_FormatorExternal;
	private List<ExternalFormative> externalFormatives;
	
	
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId_FormatorExternal() {
		return id_FormatorExternal;
	}
	public void setId_FormatorExternal(int id_FormatorExternal) {
		this.id_FormatorExternal = id_FormatorExternal;
	}
	public String getName_FormatorExternal() {
		return name_FormatorExternal;
	}
	public void setName_FormatorExternal(String name_FormatorExternal) {
		this.name_FormatorExternal = name_FormatorExternal;
	}
	public String getSpeciality_FormatorExternal() {
		return speciality_FormatorExternal;
	}
	public void setSpeciality_FormatorExternal(String speciality_FormatorExternal) {
		this.speciality_FormatorExternal = speciality_FormatorExternal;
	}
	public String getEmail_FormatorExternal() {
		return email_FormatorExternal;
	}
	public void setEmail_FormatorExternal(String email_FormatorExternal) {
		this.email_FormatorExternal = email_FormatorExternal;
	}
	
	@OneToMany(mappedBy="externalFormatives")
	public List<ExternalFormative> getExternalFormatives() {
		return externalFormatives;
	}
	public void setExternalFormatives(List<ExternalFormative> externalFormatives) {
		this.externalFormatives = externalFormatives;
	}
	public ExternalFormator(int id_FormatorExternal,
			String name_FormatorExternal, String speciality_FormatorExternal,
			String email_FormatorExternal) {
		super();
		this.id_FormatorExternal = id_FormatorExternal;
		this.name_FormatorExternal = name_FormatorExternal;
		this.speciality_FormatorExternal = speciality_FormatorExternal;
		this.email_FormatorExternal = email_FormatorExternal;
	}
	public ExternalFormator() {
		super();
	}
	
	@Override
	public String toString() {
		return id_FormatorExternal
				+ " " + name_FormatorExternal
				+ " "
				+ speciality_FormatorExternal + " "
				+ email_FormatorExternal;
	}
	
	

}

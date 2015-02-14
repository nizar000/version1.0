package pi.dev.entities;

import java.io.Serializable;



import java.util.List;





import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private int phone;
	private String login;
	private String passwd ;
	private String speciality ;
	private int isAdmin ;
	private Reward reward;
	private Rank rank;
	private Team team;
//	private List<Task> projects; 
	private List<ActivityInvitation> activites; 
	private List<ProjectEmp> listProjects;
	private List<ExternalFormativeInvitation> formativeExternes;
	private List<InernalFormativeInvitation> listIntFor;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column( unique = true, nullable = false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	

	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	@ManyToOne
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@ManyToOne(cascade=CascadeType.REMOVE)
	public Reward getReward() {
		return reward;
	}
	public void setReward(Reward reward) {
		this.reward = reward;
	}
	@ManyToOne
	 public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
/*	@OneToMany(mappedBy="employee")
	public List<Task> getProjects() {
		return projects;
	}
	public void setProjects(List<Task> projects) {
		this.projects = projects;
	}*/
	@OneToMany(mappedBy="employee")
	public List<ProjectEmp> getListProjects() {
		return listProjects;
	}
	public void setListProjects(List<ProjectEmp> listProjects) {
		this.listProjects = listProjects;
	}
	@OneToMany(mappedBy="employee")
	public List<InernalFormativeInvitation> getListIntFor() {
		return listIntFor;
	}
	public void setListIntFor(List<InernalFormativeInvitation> listIntFor) {
		this.listIntFor = listIntFor;
	}
	@OneToMany(mappedBy="employee")
	public List<ActivityInvitation> getActivites() {
		return activites;
	}
	public void setActivites(List<ActivityInvitation> activites) {
		this.activites = activites;
	}
  @OneToMany(mappedBy="employee")
	public List<ExternalFormativeInvitation> getFormativeExternes() {
		return formativeExternes;
	}
	public void setFormativeExternes(
			List<ExternalFormativeInvitation> formativeExternes) {
		this.formativeExternes = formativeExternes;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String email, int phone, String login,
			String passwd, String speciality) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.login = login;
		this.passwd = passwd;
		this.speciality = speciality;
	}
	public Employee(String name, String email, int phone, String login,
			String passwd, String speciality, int isAdmin,
			List<Task> projects, List<ProjectEmp> listProjects,
			List<InernalFormativeInvitation> listIntFor) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.login = login;
		this.passwd = passwd;
		this.speciality = speciality;
		this.isAdmin = isAdmin;
		//this.projects = projects;
		this.listProjects = listProjects;
		this.listIntFor = listIntFor;
	}
	@Override
	public String toString() {
		return name + " " + email + " "
				+ phone + " " + login + " " + passwd
				+ " " + speciality + " =" + isAdmin
				+ " " + team;
	}

    
	
	
}

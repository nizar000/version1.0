package pi.dev.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reward implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rwd")
	private int id_rwd;
	
	private RwardType TRwd;
	@OneToMany(mappedBy="reward")
	private List<Employee> employees;


	public Reward() {
		super();
	}

	
	public int getId() {
		return id_rwd;
	}
	public void setId(int id) {
		this.id_rwd=id;
	}
	@Override
	public String toString() {
		return TRwd.toString();
	}


	public List<Employee> getEmployees() {
		return employees;
	}
@Enumerated(EnumType.STRING)
	public RwardType getTRwd() {
		return TRwd;
	}

	public void setTRwd(RwardType tRwd) {
		TRwd = tRwd;
	}
	

}

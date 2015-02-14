package pi.dev.sessionbeans.team;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pi.dev.entities.Team;

@Stateless
public class TeamImp implements ITeamLocal,ITeamRemote {

	
	@PersistenceContext(unitName="pidevDS")
	private EntityManager em;
	
	@Override
	public void addTeam(Team e) {
		em.persist(e);
	}

	@Override
	public void deleteTeam(Team e) {
		em.remove(e);
		
	}

	@Override
	public void updateTeam(Team e) {
		em.merge(e);
		
	}

	@Override
	public Team findTeam(int id) {
		Team e = em.find(Team.class,id);
		if(e==null )throw new RuntimeException("TeamIntrouvable");
		return e;
	}

	@Override
	public List<Team> findAllTeams() {
		return em.createQuery("select r from Team r", Team.class)
				.getResultList();
	}

}

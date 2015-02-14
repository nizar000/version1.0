package pi.dev.sessionbeans.rank;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pi.dev.entities.Rank;

@Stateless
public class RankImp implements IRankLocal,IRankRemote {
	
	@PersistenceContext(unitName="pidevDS")
	private EntityManager em;

	@Override
	public void addRank(Rank e) {
		em.persist(e);
		
		
	}

	@Override
	public void deleteRank(Rank e) {
		em.remove(e);
		
	}

	@Override
	public void updateRank(Rank e) {
		em.merge(e);
	}

	@Override
	public Rank findRank(int id) {
		Rank e = em.find( Rank.class,id);
			if(e==null )throw new RuntimeException(" RankIntrouvable");
			return e;
	}

	@Override
	public List<Rank> findAllRanks() {
		return em.createQuery("select r from Rank r", Rank.class)
				.getResultList();
	}

}

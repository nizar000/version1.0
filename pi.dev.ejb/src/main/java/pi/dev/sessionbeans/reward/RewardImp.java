package pi.dev.sessionbeans.reward;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pi.dev.entities.Reward;

@Stateless
public class RewardImp implements IRewardLocal, IRewardRemote {

	@PersistenceContext(unitName = "pidevDS")
	private EntityManager em;

	@Override
	public void addReward(Reward r) {
		em.persist(r);

	}

	@Override
	public void deleteReward(Reward r) {
		em.remove(r);

	}

	@Override
	public void updateReward(Reward r) {
		em.merge(r);

	}

	@Override
	public Reward findReward(int i) {
		Reward r = em.find(Reward.class, i);
		if (r == null)
			throw new RuntimeException("EmployeeIntrouvable");
		return r;
	}

	@Override
	public List<Reward> findAllRewards() {
		return em.createQuery("select r from Reward r", Reward.class)
				.getResultList();
	}

}

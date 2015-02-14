package pi.dev.sessionbeans.activity;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pi.dev.entities.Activity;

@Stateless
public class ActivityImp implements IActivityLocal, IActivityRemote {

	@PersistenceContext(unitName = "pidevDS")
	private EntityManager em;

	@Override
	public void addActivity(Activity e) {
		em.persist(e);

	}

	@Override
	public void deleteActivity(Activity e) {
		em.remove(e);

	}

	@Override
	public void updateActivity(Activity e) {
		em.merge(e);

	}

	@Override
	public Activity findActivity(int id) {
		Activity e = em.find(Activity.class, id);
		if (e == null)
			throw new RuntimeException(" ActivityIntrouvable");
		return e;
	}

	public List<Activity> findAllActivities() {

		return em.createQuery("select a from Activity a", Activity.class)
				.getResultList();
	}

}

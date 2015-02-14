package pi.dev.sessionbeans.externalformative;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pi.dev.entities.ExternalFormative;

@Stateless
public class ExternalFormativeImp implements IExternalFormativeLocal,
		IExternalFormativeRemote {

	@PersistenceContext(unitName = "pidevDS")
	private EntityManager em;

	@Override
	public void addExternalFormative(ExternalFormative f) {
		em.persist(f);

	}

	@Override
	public void deleteExternalFormative(ExternalFormative f) {
		em.remove(f);

	}

	@Override
	public void updateExternalFormative(ExternalFormative f) {
		em.merge(f);
	}

	@Override
	public ExternalFormative findExternalFormative(int id) {
		ExternalFormative f = em.find(ExternalFormative.class, id);
		if (f == null)
			throw new RuntimeException(" ExternalFormativeIntrouvable");
		return f;
	}

	@Override
	public List<ExternalFormative> findAllExternalFormatives() {
		return em.createQuery("select ex from ExternalFormative ex", ExternalFormative.class)
				.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ExternalFormative> findExternalFormativeByFormateurId(int forId) {
		List<ExternalFormative> externalFormatives = null;
		String query = String.format("select  f from ExternalFormative f where f.id_FormativeExterne= '%s'",forId );
		externalFormatives  =  (List<ExternalFormative>) em.createQuery(query).getResultList();
		
	return externalFormatives ;
	}

}

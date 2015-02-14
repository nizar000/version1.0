package pi.dev.sessionbeans.internalformative;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pi.dev.entities.InternalFormative;
@Stateless
public class InternalFormativeImp implements IInternalFormativeLocal , IInternalFormativeRemote{

	@PersistenceContext(unitName="pidevDS")
	private EntityManager em;
	@Override
	public void addInternalFormative(InternalFormative f) {
		em.persist(f);
		
	}

	@Override
	public void deleteInternalFormative(InternalFormative f) {
		
		
	}

	@Override
	public void updateInternalFormative(InternalFormative f) {
		em.merge(f);
		
	}

	@Override
	public InternalFormative findInternalFormative(int i) {
		InternalFormative f = em.find(InternalFormative.class,i);
		if(f==null )throw new RuntimeException("InternalFormativeIntrouvable");
		return f;
	}

	@Override
	public List<InternalFormative> findAllInternalFormatives() {
		return em.createQuery("select r from InternalFormative r", InternalFormative.class)
				.getResultList();
	}

}

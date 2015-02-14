package pi.dev.sessionbeans.externalformator;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pi.dev.entities.ExternalFormator;


@Stateless
public class ExternalFormatorImp implements IExternalFormatorLocal,IExternalFormatorRemote {
	
	@PersistenceContext(unitName="pidevDS")
	private EntityManager em;


	@Override
	public void addExternaFormator(ExternalFormator e) {
		em.persist(e);
		
	}
	@Override
	public void deleteExternalFormator(ExternalFormator e) {
		em.remove(e);
		
	}

	@Override
	public void updateExternalFormator(ExternalFormator e) {
		em.merge(e);
		
	}

	@Override
	public ExternalFormator findExternalFormator(int id) {
		ExternalFormator f = em.find(ExternalFormator.class,id);
		if(f==null )throw new RuntimeException("ExternalFormatorIntrouvable");
		return f;
	}
	@Override
	public List<ExternalFormator> findAllExternalFormator() {
		return em.createQuery("select r from ExternalFormator r", ExternalFormator.class)
				.getResultList();
		
	}
	




}

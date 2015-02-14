package pi.dev.sessionbeans.externalformativeinvitation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pi.dev.entities.ExternalFormativeInvitation;


@Stateless
public class ExternalFormativeInvitationImp implements
		IExternalFormativeInvitationLocal, IExternalFormativeInvitationRemote {

	@PersistenceContext(unitName = "pidevDS")
	private EntityManager em;

	@Override
	public void addExternalFormativeInvitation(ExternalFormativeInvitation inv) {
		em.persist(inv);

	}

	@Override
	public void deleteExternalFormativeInvitation(
			ExternalFormativeInvitation inv) {
		em.remove(inv);

	}

	@Override
	public void updateExternalFormativeInvitation(
			ExternalFormativeInvitation inv) {
		em.merge(inv);

	}


	@Override
	public ExternalFormativeInvitation findExternalFormativeInvitation(int i) {
		ExternalFormativeInvitation f = em.find(ExternalFormativeInvitation.class,i);
		if(f==null )throw new RuntimeException("ExternalFormativeInvitationIntrouvable");
		return f;
	}
	@Override
	public List<ExternalFormativeInvitation> findAllExternalFormatives() {
		return em.createQuery("select ex from ExternalFormativeInvitation ex",
				ExternalFormativeInvitation.class).getResultList();
	}



}

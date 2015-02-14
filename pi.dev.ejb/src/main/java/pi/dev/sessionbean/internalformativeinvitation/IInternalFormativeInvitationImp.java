package pi.dev.sessionbean.internalformativeinvitation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pi.dev.entities.InernalFormativeInvitation;

@Stateless
public class IInternalFormativeInvitationImp implements IInternalFormativeInvitationLocal , IInternalFormativeInvitationRemote {

	@PersistenceContext(unitName="pidevDS")
	private EntityManager em;
	@Override
	public void addInternalFormativeInvitation(InernalFormativeInvitation inv) {
		em.persist(inv);
		
	}

	@Override
	public void deleteInternalFormativeInvitation(InernalFormativeInvitation inv) {
		em.remove(inv);
		
	}

	@Override
	public void updateInternalFormativeInvitation(InernalFormativeInvitation inv) {
		em.merge(inv);
		
	}

	@Override
	public InernalFormativeInvitation findInternalFormativeInvitation(int i) {
		InernalFormativeInvitation inv = em.find(InernalFormativeInvitation.class,i);		
		if(inv==null )throw new RuntimeException("InernalFormativeInvitationIntrouvable");
		return inv;
	}

	@Override
	public List<InernalFormativeInvitation> findAllInernalFormativeInvitations() {
		return em.createQuery("select r from InernalFormativeInvitation r", InernalFormativeInvitation.class)
				.getResultList();
	}

}

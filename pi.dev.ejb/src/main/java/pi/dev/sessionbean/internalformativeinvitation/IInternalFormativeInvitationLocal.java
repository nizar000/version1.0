package pi.dev.sessionbean.internalformativeinvitation;

import java.util.List;

import javax.ejb.Local;

import pi.dev.entities.InernalFormativeInvitation;

@Local
public interface IInternalFormativeInvitationLocal {

	public void addInternalFormativeInvitation (InernalFormativeInvitation inv);
	public void deleteInternalFormativeInvitation (InernalFormativeInvitation inv);
	public void updateInternalFormativeInvitation (InernalFormativeInvitation inv);
	public InernalFormativeInvitation findInternalFormativeInvitation (int i);
	public List<InernalFormativeInvitation> findAllInernalFormativeInvitations();
}

package pi.dev.sessionbean.internalformativeinvitation;

import java.util.List;

import javax.ejb.Remote;

import pi.dev.entities.InernalFormativeInvitation;


@Remote
public interface IInternalFormativeInvitationRemote {

	public void addInternalFormativeInvitation (InernalFormativeInvitation inv);
	public void deleteInternalFormativeInvitation (InernalFormativeInvitation inv);
	public void updateInternalFormativeInvitation (InernalFormativeInvitation inv);
	public InernalFormativeInvitation findInternalFormativeInvitation (int i);
	public List<InernalFormativeInvitation> findAllInernalFormativeInvitations();
}

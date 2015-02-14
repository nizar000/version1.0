package pi.dev.sessionbeans.externalformativeinvitation;

import java.util.List;

import javax.ejb.Local;

import pi.dev.entities.ExternalFormativeInvitation;

@Local
public interface IExternalFormativeInvitationLocal {

	public void addExternalFormativeInvitation(ExternalFormativeInvitation inv);

	public void deleteExternalFormativeInvitation(
			ExternalFormativeInvitation inv);

	public void updateExternalFormativeInvitation(
			ExternalFormativeInvitation inv);

	public ExternalFormativeInvitation findExternalFormativeInvitation(
			int i);

	public List<ExternalFormativeInvitation> findAllExternalFormatives();
}

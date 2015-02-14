package pi.dev.sessionbeans.externalformative;

import java.util.List;

import javax.ejb.Remote;

import pi.dev.entities.ExternalFormative;

@Remote
public interface IExternalFormativeRemote {

	public void addExternalFormative(ExternalFormative f);

	public void deleteExternalFormative(ExternalFormative f);

	public void updateExternalFormative(ExternalFormative f);

	public ExternalFormative findExternalFormative(int id);

	public List<ExternalFormative> findAllExternalFormatives();
	public List<ExternalFormative> findExternalFormativeByFormateurId(int forId);

}

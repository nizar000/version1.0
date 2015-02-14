package pi.dev.sessionbeans.externalformative;

import java.util.List;

import javax.ejb.Local;

import pi.dev.entities.ExternalFormative;

@Local
public interface IExternalFormativeLocal {

	public void addExternalFormative(ExternalFormative f);

	public void deleteExternalFormative(ExternalFormative f);

	public void updateExternalFormative(ExternalFormative f);

	public ExternalFormative findExternalFormative(int id);

	public List<ExternalFormative> findAllExternalFormatives();
	public List<ExternalFormative> findExternalFormativeByFormateurId(int forId);

}

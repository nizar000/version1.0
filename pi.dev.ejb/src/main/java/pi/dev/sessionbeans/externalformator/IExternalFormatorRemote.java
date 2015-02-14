package pi.dev.sessionbeans.externalformator;


import java.util.List;

import javax.ejb.Remote;

import pi.dev.entities.ExternalFormator;
@Remote
public interface IExternalFormatorRemote {
	
	public void addExternaFormator(ExternalFormator e);
	public void deleteExternalFormator (ExternalFormator e);
	public void updateExternalFormator (ExternalFormator e);
	public ExternalFormator findExternalFormator (int id);
	public List<ExternalFormator> findAllExternalFormator();

}

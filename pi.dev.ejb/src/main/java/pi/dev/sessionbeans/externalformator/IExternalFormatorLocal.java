package pi.dev.sessionbeans.externalformator;


import java.util.List;

import javax.ejb.Local;


import pi.dev.entities.ExternalFormator;



@Local

public interface IExternalFormatorLocal {
	
	public void addExternaFormator(ExternalFormator e);
	public void deleteExternalFormator (ExternalFormator e);
	public void updateExternalFormator (ExternalFormator e);
	public ExternalFormator findExternalFormator (int id);
	public List<ExternalFormator> findAllExternalFormator();

}

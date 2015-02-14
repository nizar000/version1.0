package pi.dev.sessionbeans.internalformative;

import java.util.List;

import javax.ejb.Remote;


import pi.dev.entities.InternalFormative;


@Remote
public interface IInternalFormativeRemote {

	public void addInternalFormative (InternalFormative f);
	public void deleteInternalFormative (InternalFormative f);
	public void updateInternalFormative (InternalFormative f);
	public InternalFormative findInternalFormative (int i);
	public List<InternalFormative> findAllInternalFormatives();

}

package pi.dev.sessionbeans.internalformative;


import java.util.List;

import javax.ejb.Local;



import pi.dev.entities.InternalFormative;
@Local
public interface IInternalFormativeLocal {
	
	public void addInternalFormative (InternalFormative f);
	public void deleteInternalFormative (InternalFormative f);
	public void updateInternalFormative (InternalFormative f);
	public InternalFormative findInternalFormative (int i);
	public List<InternalFormative> findAllInternalFormatives();

}

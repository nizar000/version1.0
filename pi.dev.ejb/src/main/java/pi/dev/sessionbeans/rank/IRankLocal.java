package pi.dev.sessionbeans.rank;

import java.util.List;

import javax.ejb.Remote;

import pi.dev.entities.Rank;

@Remote
public interface IRankLocal {
	
	public void addRank (Rank e);
	public void deleteRank (Rank e);
	public void updateRank (Rank e);
	public Rank findRank (int id);
	public List<Rank> findAllRanks();
}

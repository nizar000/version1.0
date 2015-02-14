package pi.dev.sessionbeans.reward;

import java.util.List;

import javax.ejb.Local;

import pi.dev.entities.Reward;

@Local
public interface IRewardLocal {

	public void addReward(Reward r);

	public void deleteReward(Reward r);

	public void updateReward(Reward r);

	public Reward findReward(int i);

	public List<Reward> findAllRewards();

}

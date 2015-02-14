package pi.dev.sessionbeans.reward;

import java.util.List;

import javax.ejb.Remote;

import pi.dev.entities.Reward;

@Remote
public interface IRewardRemote {

	public void addReward(Reward r);

	public void deleteReward(Reward r);

	public void updateReward(Reward r);

	public Reward findReward(int i);

	public List<Reward> findAllRewards();

}

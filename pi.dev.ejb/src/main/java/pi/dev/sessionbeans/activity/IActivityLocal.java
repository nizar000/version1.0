package pi.dev.sessionbeans.activity;

import java.util.List;

import javax.ejb.Local;

import pi.dev.entities.Activity;

@Local
public interface IActivityLocal {

	public void addActivity(Activity e);

	public void deleteActivity(Activity e);

	public void updateActivity(Activity e);

	public Activity findActivity(int id);

	public List<Activity> findAllActivities();

}

package pi.dev.sessionbeans.task;



import java.util.List;

import javax.ejb.Remote;

import pi.dev.entities.Task;

@Remote
public interface ITaskRemote {
	
	public void addTask(Task t);
	public void deleteTask (Task t);
	public void updateTask (Task t);
	public Task findTask (int i);
	public List<Task> findAllTasks();
	public List<Task> findTaskByEmployeeId(int empId);
	public List<Task> findTaskByProjetId(int projId);

}

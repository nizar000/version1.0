package pi.dev.sessionbeans.task;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pi.dev.entities.Task;

@Stateless
public class TaskImp implements ITaskRemote , ITaskLocal{
	
	@PersistenceContext(unitName="pidevDS")
	private EntityManager em;

	@Override
	public void addTask(Task t) {
		em.persist(t);
		
	}

	@Override
	public void deleteTask(Task t) {
		em.remove(em.merge(t));
		
	}

	@Override
	public void updateTask(Task t) {
		em.merge(t);
		
	}

	@Override
	public Task findTask(int i) {
		Task t = em.find(Task.class,i);
		if(t==null )throw new RuntimeException("TaskIntrouvable");
		return t;
	}

	@Override
	public List<Task> findAllTasks() {
		return em.createQuery("select r from Task r", Task.class)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Task> findTaskByEmployeeId(int empId) {
		List<Task> tasks = null;
		String query = String.format("select  t from Task t where t.employeeId= '%s'",empId );
		tasks  =  (List<Task>) em.createQuery(query).getResultList();
		
	return tasks ;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Task> findTaskByProjetId(int projId) {
		List<Task> tasks = null;
		String query = String.format("select  t from Task t where t.projectId= '%s'",projId );
		tasks  =  (List<Task>) em.createQuery(query).getResultList();
		
	return tasks ;
	}

}

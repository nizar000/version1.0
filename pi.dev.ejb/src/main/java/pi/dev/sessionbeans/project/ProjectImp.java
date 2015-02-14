package pi.dev.sessionbeans.project;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pi.dev.entities.Employee;
import pi.dev.entities.Project;

@Stateless
public class ProjectImp implements IProjectLocal , IProjectRemote{

	@PersistenceContext(unitName="pidevDS")
	private EntityManager em;
	
	@Override
	public void addProject(Project p) {
		
		em.persist(p);
		
	}

	@Override
	public void deleteProject(Project p) {
		em.remove(em.merge(p));
		
	}

	@Override
	public void updateProject(Project p) {
		em.merge(p);
		
	}

	@Override
	public Project findProject(int i) {
		Project p = em.find(Project.class,i);		
		if(p==null )throw new RuntimeException("ProjectIntrouvable");
		return p;
	}

		
	@Override
	public void addEmployee(Employee e , Project p) {
		
		
	}

	@Override
	public List<Project> findAllProjects() {
		return em.createQuery("select r from Project r", Project.class)
				.getResultList();
	}
	@Override
	public Project findProjectsByName(String Name) {
		
        Project project = null;
		
		String query = String.format("select  p from Project p where p.name = '%s'", Name);
		List<Project> projects = em.createQuery(query).getResultList();
		if(projects.size() >= 1)
		{
			project = projects.get(0);
		}
		
		return project;
	}
	
}

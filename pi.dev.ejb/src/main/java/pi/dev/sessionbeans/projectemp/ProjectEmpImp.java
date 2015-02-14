	package pi.dev.sessionbeans.projectemp;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;







import pi.dev.entities.Employee;
import pi.dev.entities.ProjectEmp;
import pi.dev.entities.ProjectEmpId;


@Stateless
public class ProjectEmpImp implements IProjectEmpLocal , IProjectEmpRemote{

	@PersistenceContext(unitName="pidevDS")
	private EntityManager em;
	@Override
	public void addProjectEmp(ProjectEmp pe) {
		em.persist(pe);
		
	}

	@Override
	public void deleteProjectEmp(ProjectEmp pe) {
		em.remove(em.merge(pe));
		
	}

	@Override
	public void updateProjectEmp(ProjectEmp pe) {
		em.merge(pe);
		
	}

	@Override
	public ProjectEmp findProjectEmp(int i) {

		ProjectEmp pe= em.find(ProjectEmp.class,i);
		if(pe==null )throw new RuntimeException("ProjectIntrouvable");
		return pe;
	}

	@Override
	public List<ProjectEmp> findAllProjectEmps() {
		return em.createQuery("select r from ProjectEmp r", ProjectEmp.class)
				.getResultList();
	}
	//Ahmed
		@Override
		public ProjectEmp findProjectEmpByIdProject(int id) {
			
	        ProjectEmp projectEmp = null;
			
			String query = String.format("select  e from ProjectEmp e where e.projectId = '%s'", id);
			List<ProjectEmp> projectEmps = em.createQuery(query).getResultList();
			if(projectEmps.size() >= 1)
			{
				projectEmp = projectEmps.get(0);
			}
			
			return projectEmp;
		}

}

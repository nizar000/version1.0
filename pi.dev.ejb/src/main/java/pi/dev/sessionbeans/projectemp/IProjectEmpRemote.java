package pi.dev.sessionbeans.projectemp;


import java.util.List;

import javax.ejb.Remote;

import pi.dev.entities.ProjectEmp;
import pi.dev.entities.ProjectEmpId;

@Remote
public interface IProjectEmpRemote {
	
	public void addProjectEmp (ProjectEmp pe);
	public void deleteProjectEmp (ProjectEmp pe);
	public void updateProjectEmp (ProjectEmp pe);
	public ProjectEmp findProjectEmp (int i);
	public List<ProjectEmp> findAllProjectEmps();
	public ProjectEmp findProjectEmpByIdProject(int id);
}

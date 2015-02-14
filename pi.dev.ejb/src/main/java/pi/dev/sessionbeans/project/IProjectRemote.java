package pi.dev.sessionbeans.project;

import java.util.List;

import javax.ejb.Remote;

import pi.dev.entities.Employee;
import pi.dev.entities.Project;

@Remote
public interface IProjectRemote {
	
	public void addProject (Project p);
	public void deleteProject (Project p);
	public void updateProject (Project p);
	public Project findProject (int i);
	public List<Project> findAllProjects();
	public void addEmployee(Employee e,Project p);
	public Project findProjectsByName(String name);
}

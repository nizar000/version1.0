package pi.dev.sessionbeans.employee;

import java.util.List;

import javax.ejb.Local;

import pi.dev.entities.Employee;

@Local
public interface IEmployeeLocal {

	public void addEmployee(Employee e);

	public void deleteEmployee(Employee e);

	public void updateEmployee(Employee e);

	public Employee findEmployee(int i);

	public List<Employee> findEmployeebyRank(String Rname);

	public List<Employee> findAllEmployees();
	
	public Employee authentificationEmployee(String login, String passwd);
	
	public Employee findEmployeesByName(String Name);
}

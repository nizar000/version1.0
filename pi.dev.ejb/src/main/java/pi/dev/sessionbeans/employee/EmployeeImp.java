package pi.dev.sessionbeans.employee;

import java.util.ArrayList;
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
public class EmployeeImp implements IEmployeeLocal, IEmployeeRemote {
	@PersistenceContext(unitName = "pidevDS")
	private EntityManager em;

	@Override
	public void addEmployee(Employee e) {
		em.persist(e);

	}

	@Override
	public void deleteEmployee(Employee e) {
		em.remove(em.merge(e));

	}

	@Override
	public void updateEmployee(Employee e) {
		em.merge(e);

	}

	@Override
	public Employee findEmployee(int id) {
		Employee e = em.find(Employee.class, id);
		if (e == null)
			throw new RuntimeException("EmployeeIntrouvable");
		return e;
	}

	@Override
	public List<Employee> findEmployeebyRank(String Rname) {
		/*
		 * Query req= em.createQuery("select e from employee e"); List<Employee>
		 * emp= req.getResultList(); for (Employee employee : emp) {
		 * if(emp.getClass().get)
		 * 
		 * }
		 */List<Employee> returnList = new ArrayList<>();
		/*
		 * TypedQuery<Employee> query= em.createNamedQuery("findByName",
		 * Employee.class); query.setParameter(Rname, Employee.class);
		 * 
		 * 
		 * returnList = query.getResultList();*
		 */

		return returnList;
	}

	public List<Employee> findAllEmployees() {
		return em.createQuery("select e from Employee e", Employee.class)
				.getResultList();
	}

	@Override
	public Employee authentificationEmployee(String login, String password) {
		
			Employee found = null;
			String jpql = "select u from Employee u where u.login=:x and u.passwd=:y and u.isAdmin=:z";
			TypedQuery<Employee> query = em.createQuery(jpql, Employee.class);
			query.setParameter("x", login);
			query.setParameter("y", password);
		    query.setParameter("z", 1);
			try{
				found = query.getSingleResult();
			}catch(Exception e){
				Logger.getLogger(getClass().getName()).log(Level.WARNING, "auth attempt failed with login="+login+" and password="+password);
			}
			return found;
		
	}
	//Ahmed
	@Override
	public Employee findEmployeesByName(String Name) {
		
        Employee employee = null;
		
		String query = String.format("select  e from Employee e where e.name = '%s'", Name);
		List<Employee> employees = em.createQuery(query).getResultList();
		if(employees.size() >= 1)
		{
			employee = employees.get(0);
		}
		
		return employee;
	}

}

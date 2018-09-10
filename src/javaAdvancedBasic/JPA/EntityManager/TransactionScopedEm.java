/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaAdvancedBasic.JPA.EntityManager;

/**
 * - Entity manager acquired using @PersistenceContext annotation is called as container managed entitymanager
 * - Application does not have to create entity manager.
 * - Transaction scoped entitymanager is one of the two types of container managed entity managers.
 * @author Yassir Arafat
 */
public class TransactionScopedEm {
    
    @PersistenceContext(unitName="EmployeeService")
	EntityManager em;
 
	public void assignEmployeeToProject(int empId, int projectId){
 
		Project project = em.find(Project.class, projectId);
		Employee employee = em.find(Employee.class, empId);
		project.getEmployees().add(employee);
		employee.getProjects().add(projecct);
	}
}

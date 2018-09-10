/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ya.javaAdvancedBasic.JPA.EntityManager;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * - Entity manager acquired using @PersistenceContext annotation is called as `container managed entitymanager` 
 * - Application does not have to create entity manager. 
 * - Transaction scoped entitymanager is one of the two types of
 * container managed entity managers.
 *
 * @author Yassir Arafat
 */
public class TransactionScopedEm {

    @PersistenceContext(unitName = "EmployeeService")
    EntityManager em;

    public void assignEmployeeToProject(int empId, int projectId) {

        // 1. When find method is invoked, container checks for available transaction
        // 2. Then it checks for persistence context. As there isn’t one right now, 
        //    container managed persistence context creates one and finds the project as per id.
        Project project = em.find(Project.class, projectId);
        // 3. While searching for employee, it checks the transaction again and finds one which was created to find project.
        // 4. Now both entities are managed and entity manager makes the change while committing.
        Employee employee = em.find(Employee.class, empId);
        
        project.getEmployees().add(employee);
        employee.getProjects().add(project);
        
        // 5. Entity manager goes away when transaction is over
        // 6. This process is repeated every time whenever one or more entity managers 
        //    operations are invoked within a transaction.

    }
}

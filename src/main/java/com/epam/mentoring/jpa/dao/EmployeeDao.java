package com.epam.mentoring.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import com.epam.mentoring.jpa.entities.Employee;

import java.util.List;

/**
 * Created by Natallia_Dziameshka on 12/8/2014.
 */
public class EmployeeDao {

  private EntityManagerFactory emf;

  public EmployeeDao(){
    emf = Persistence.createEntityManagerFactory( "employee-unit" );
  }

  public void closeEntityManagerFactory(){
    emf.close();
  }

  public List<Employee> getAllEmployees(){
    List employees = null;
    EntityManager em = emf.createEntityManager();
    try {
      EntityTransaction newTx = em.getTransaction();
      newTx.begin();
      employees = em.createQuery( "select e from Employee e order by e.id asc" ).getResultList();
      System.out.println( employees.size() + " employee(s) found" );
      newTx.commit();
    } finally {
      em.close();
    }
    return  employees;
  }

  public Employee createEmployee(Employee employee) {
    EntityManager em = emf.createEntityManager();
    try {
      EntityTransaction tx = em.getTransaction();
      tx.begin();
      em.persist( employee );
      tx.commit();
      return employee;
    } finally{
      em.close();
    }
  }
  public Employee findEmployee(Long id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Employee.class, id);
  }

  public void deleteEmployee(Long id) {
    EntityManager em = emf.createEntityManager();
    try {
      Employee employee = em.find(Employee.class, id);
      if (employee != null) {
        em.remove( employee);
      }
    } finally{
      em.close();
    }
  }
//
//  public void assignEmployeeToProject(int empId, int projectId) {
//    Project project = em.find(Project.class, projectId);
//    Employee employee = em.find(Employee.class, empId);
//    project.getEmployees().add(employee);
//    employee.getProjects().add(project);
//  }
}

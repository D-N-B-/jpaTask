package com.epam.mentoring.jpa.service;

import org.hibernate.SessionFactory;
import org.hibernate.ejb.HibernateEntityManagerFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.sql.DataSource;
import java.util.Map;

public class EmployeeService
{
DataSource dataSource;

  EntityManagerFactory emf;
  @PersistenceContext(name = "OrgChart")
  EntityManager em;

  public EmployeeService()
  {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory( "EmployeeService" );
    EntityManager em = emf.createEntityManager();
  }

  public DataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public EntityManagerFactory getEmf() {
    return emf;
  }

  public void setEmf(EntityManagerFactory emf) {
    this.emf = emf;
  }

  public EntityManager getEm() {
    return em;
  }

  public void setEm(EntityManager em) {
    this.em = em;
  }
}

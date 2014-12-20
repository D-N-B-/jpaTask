package com.epam.mentoring.jpa.entities;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import java.util.Set;
//
//<!-- <EMPLOYEE EMPLOYEE_ID="1" EMPLOYEE_NAME="Doe"/>
//  <EMPLOYEE EMPLOYEE_ID="2" EMPLOYEE_NAME="Foo"/>
//  <EMPLOYEE EMPLOYEE_ID="3" EMPLOYEE_NAME="Brown"/>-->

@Entity
@Table(name = "EMPLOYEE")
public class Employee
{

  private Long id;
  private String name;
  private EmployeeStatus status;
  private Address address;
  //  private Set<Project> projects;
  private Unit unit;
  @Id
  @GenericGenerator(name = "employee_pk_generator", strategy = "increment")
  @GeneratedValue(generator = "employee_pk_generator")
  @Column(name="EMPLOYEE_ID")
  public Long getId()
  {
    return id;
  }

  public void setId( Long id )
  {
    this.id = id;
  }

  @Column(name="EMPLOYEE_NAME")
  public String getName()
  {
    return name;
  }

  public void setName( String name )
  {
    this.name = name;
  }

  @Enumerated(EnumType.STRING)
  @Column(name="STATUS")
  public EmployeeStatus getStatus()
  {
    return status;
  }

  public void setStatus( EmployeeStatus status )
  {
    this.status = status;
  }

  @Embedded
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

//  @ManyToMany
//  @JoinTable(name = "EMPLOYEE_PROJECTS",
//    joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
//    inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
//  public Set<Project> getProjects() {
//    return projects;
//  }
//
//  public void setProjects(Set<Project> projects) {
//    this.projects = projects;
//  }

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "UNIT_ID")
  public Unit getUnit() {
    return unit;
  }

  public void setUnit(Unit unit) {
    this.unit = unit;
  }
}

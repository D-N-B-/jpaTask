package com.epam.mentoring.jpa.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * Created by Natallia_Dziameshka on 12/8/2014.
 */
@Entity
@Table(name = "UNIT")
public class Unit
{

  private Long id;
  private String name;

  private Collection<Employee> employees;

  @Id
  @TableGenerator(name = "Unit_PK_Generator", table = "UNIT_ID_GEN")
  @GeneratedValue(generator = "Unit_PK_Generator")
  public Long getId()
  {
    return id;
  }

  public void setId( Long id )
  {
    this.id = id;
  }

  @Column(name = "unit_name")
  public String getName()
  {
    return name;
  }

  public void setName( String name )
  {
    this.name = name;
  }

  @OneToMany(targetEntity = Employee.class, mappedBy = "unit")
  public Collection<Employee> getEmployees()
  {
    return employees;
  }

  public void setEmployees( Collection<Employee> employees )
  {
    this.employees = employees;
  }
}

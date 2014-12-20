package com.epam.mentoring.jpa.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PROJECT")
public class Project {
  private Long projectId;
  private String projectName;
//  private List<Employee> employees;

  @Id
  @GenericGenerator(name = "project_pk_generator", strategy = "increment")
  @GeneratedValue(generator = "project_pk_generator")
  @Column(name="PROJECT_ID")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  @Column(name="PROJECT_NAME")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

//  @ManyToMany(mappedBy="projects")
//  public List<Employee> getEmployees() {
//    return employees;
//  }
//
//  public void setEmployees(List<Employee> employees) {
//    this.employees = employees;
//  }
}

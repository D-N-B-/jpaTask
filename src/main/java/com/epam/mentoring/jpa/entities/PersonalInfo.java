package com.epam.mentoring.jpa.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 * Created by Natallia_Dziameshka on 12/8/2014.
 */

public class PersonalInfo {


  private Long id;
  private String characteristics;
  private Employee employee;

  @Id
  @TableGenerator(name = "Personal_Info_PK_Generator", table = "PERSONAL_ID_GEN")
  @GeneratedValue(generator = "Personal_Info_PK_Generator")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name="characteristics")
  public String getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(String characteristics) {
    this.characteristics = characteristics;
  }

  @OneToOne
  @JoinColumn(name = "employee_id")
  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
}

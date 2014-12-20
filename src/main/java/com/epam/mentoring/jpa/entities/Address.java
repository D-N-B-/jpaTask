package com.epam.mentoring.jpa.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Natallia_Dziameshka on 12/8/2014.
 */
@Embeddable
public class Address {

  private String city;
  private String street;

  @Column(name="city_name")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Column(name = "street_name")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }
}

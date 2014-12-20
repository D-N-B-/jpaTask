package com.epam.mentoring.jpa;

import java.util.ArrayList;
import java.util.List;

import com.epam.mentoring.jpa.dao.EmployeeDao;
import com.epam.mentoring.jpa.entities.Address;
import com.epam.mentoring.jpa.entities.Employee;
import com.epam.mentoring.jpa.entities.EmployeeStatus;
import com.epam.mentoring.jpa.entities.Unit;
import org.junit.Test;

public class EmployeeDaoTest
{

  public static Employee createEmployee()
  {
    Employee employee = new Employee();
    employee.setName( "Petrov" );
    employee.setStatus( EmployeeStatus.FULL_TIME );
    Address address = new Address();
    address.setCity( "Vitebsk" );
    address.setStreet( "Gagarina" );
    employee.setAddress( address );
    Unit unit = new Unit();
    unit.setName( "unit 1" );
    unit.setEmployees( new ArrayList() );
    unit.getEmployees().add( employee );
    employee.setUnit( unit );
    return employee;
  }


@Test
  public void main()
  {
    EmployeeDao employeeDAO = new EmployeeDao();
    employeeDAO.createEmployee( createEmployee() );
    List employees = employeeDAO.getAllEmployees();
    System.out.println( employees.size() + " employee(s) found" );
    for( Object m : employees ) {
      Employee singleEmployee = (Employee)m;
      System.out.println( singleEmployee.getName()
        + singleEmployee.getAddress().getCity() + singleEmployee.getUnit()
        + singleEmployee.getStatus() );
    }
  }

}

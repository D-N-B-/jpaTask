package com.epam.mentoring.jpa.dao;

import com.epam.mentoring.jpa.entities.Employee;
import com.epam.mentoring.jpa.entities.Unit;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 * Created by Natallia_Dziameshka on 12/8/2014.
 */
public class UnitDao {
    @PersistenceContext(unitName = "EmployeeService", type = PersistenceContextType.EXTENDED)
    private EntityManager em;
    private Unit unit;

    public void init(int deptId) {unit = em.find(Unit.class, deptId);}

    public void setName(String name) {unit.setName(name);}

   // @Remove public void finished() {}
//
//    public void addEmployee(int empId) {
//      Employee employee = em.find(Employee.class, empId);
//      unit.getEmployees().add(employee);
//      employee.setUnit(unit);
//    }
}

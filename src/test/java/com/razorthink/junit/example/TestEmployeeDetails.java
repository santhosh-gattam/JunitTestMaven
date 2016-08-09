package com.razorthink.junit.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployeeDetails {
   EmpBusinessLogic empBusinessLogic =new EmpBusinessLogic();
   EmployeeDetails employee = new EmployeeDetails();

   //test to check appraisal
   @Test
   public void testCalculateAppriasal() {
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
      double appraisal= empBusinessLogic.calculateAppraisal(employee);
      assertEquals(1500, appraisal, 1000.0);
   }

   // test to check yearly salary
   @Test
   public void testCalculateYearlySalary() {
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
      double salary= empBusinessLogic.calculateYearlySalary(employee);
      assertEquals(96000, salary, 0.0);
   }
}
package com.bridgelabz.employeepayroll;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class EmployeePayrollServiceTest {

	@Test
	public void givenThreeEmployeesWhenWritteToFileShouldMatchEntries() {
		EmployeePayrollData[] arrayOfEmps= {
				new EmployeePayrollData(1,"Jeff",10000.0),
			    new EmployeePayrollData(2,"Henry",20000.0),
			    new EmployeePayrollData(3,"Kid",5000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);

	}

}

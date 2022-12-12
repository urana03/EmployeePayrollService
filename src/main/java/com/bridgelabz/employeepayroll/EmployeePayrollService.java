package com.bridgelabz.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	
    private List<EmployeePayrollData> employeePayrollList;
	public EmployeePayrollService() {}
	public EmployeePayrollService(List <EmployeePayrollData>employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}
	
	public static void main(String args[]) {
		ArrayList <EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner inputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(inputReader);
		employeePayrollService.writeEmployeePayrollData();
		
	}
	private void writeEmployeePayrollData() {
		System.out.println("Employee payroll data: "+employeePayrollList);
	}
	private void readEmployeePayrollData(Scanner inputReader) {
		System.out.print("Enter Employee ID: ");
		int id = inputReader.nextInt();
		System.out.print("Enter Employee Name: ");
		String name = inputReader.next();
		System.out.print("Enter Employee Salary: ");
		double salary = inputReader.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id,name,salary));
	}
	
}

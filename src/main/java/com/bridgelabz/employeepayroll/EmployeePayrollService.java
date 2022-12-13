package com.bridgelabz.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeePayrollService {
	public enum IOService{CONSOLE_IO,FILE_IO,DB_IO,REST_IO}
    public List<EmployeePayrollData> employeePayrollList;
	public EmployeePayrollService() {}
	public EmployeePayrollService(List <EmployeePayrollData>employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}
	
	public static void main(String args[]) {
		ArrayList <EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner inputReader = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(inputReader);
		employeePayrollService.writeEmployeePayrollData(IOService.CONSOLE_IO);
		
	}
	void writeEmployeePayrollData(IOService ioService) {
		if(ioService.equals(IOService.CONSOLE_IO))
		    System.out.println("Employee payroll data: "+employeePayrollList);
		else if(ioService.equals(EmployeePayrollService.IOService.FILE_IO))
		      new EmployeePayrollFileIOService().writeData(employeePayrollList);
		
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
	public void printData(IOService ioService) throws IOException {
		if(ioService.equals(IOService.FILE_IO))
			new EmployeePayrollFileIOService().printData();
	}	
}

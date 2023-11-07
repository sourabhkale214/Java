package com.demo.services;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void ReadFromFile();

	void addEmployee();

	List<Employee> displayall();



	boolean DeleteById(int id);

	void writetofile();

}

package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeServiceDao {

	void ReadFromFile();

	void save(Employee e1);
	
	List<Employee>FindAll();

	boolean deleteById(int id);

	void writetofile();

}

package com.demo.services;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeServiceDao;
import com.demo.dao.EmployeeServiceDaoImp;

public class EmployeeServiceImpl implements EmployeeService {
	Scanner sc=new Scanner(System.in);
	private EmployeeServiceDao edao;
	public EmployeeServiceImpl() {
		edao=new EmployeeServiceDaoImp();
	}
	

	@Override
	public void ReadFromFile() {
		edao.ReadFromFile();
		
	}


	@Override
	public void addEmployee() {
		System.out.println("enter the id of the employee");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name of the employee");
		String name=sc.nextLine();
		System.out.println("enter the mobile number of the employee");
		String mobnum=sc.nextLine();
		Employee e1=new Employee(id,name,mobnum);
		edao.save(e1);
		

		
	}


	@Override
	public List<Employee> displayall() {

		return edao.FindAll();
	}


	@Override
	public boolean DeleteById(int id) {
		return edao.deleteById(id);
	}


	@Override
	public void writetofile() {
		edao.writetofile();
		
	}

}

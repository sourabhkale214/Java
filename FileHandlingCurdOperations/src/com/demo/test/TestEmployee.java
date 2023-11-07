package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.services.EmployeeService;
import com.demo.services.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		EmployeeService ss=new EmployeeServiceImpl();
		ss.ReadFromFile();
		int choice=0;
		do {
			System.out.println("1.add employee \n2.display all \n3.search by id \n4.exit \n choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				ss.addEmployee();
				
				break;
			case 2:
				List<Employee> e2=ss.displayall();
				e2.stream().forEach(System.out::println);
				break;
			case 3:
				System.out.println("enter the id you need to delete");
				int id=sc.nextInt();
				boolean status=ss.DeleteById(id);
				break;
			case 4:
				ss.writetofile();
				sc.close();
				System.out.println("thankyou for visiting");
				break;
			default :
				System.out.println("invalid input");
			}
			
		}while(choice!=4);

	}

}

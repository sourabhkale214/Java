package com.Project.Test;

import java.util.Scanner;

import com.Project.Beans.Person;
import com.Project.PersonServices.PersonService;
import com.Project.PersonServices.PersonServiceImp1;

public class TestPerson {

	public static void main(String[] args) {
//		testing of the person -------------
//		Person p=new Person(1,"tejal",12345);
//		System.out.println(p);
//------------------------------------------------------
		int choice =0;
		PersonService ps=new PersonServiceImp1();
		do {
			System.out.println("1: adding of the person data \n2: search person by id \n3: display all person \n4:exit");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				ps.addNewPerson();
				break;
			case 2:
				System.out.println("enter the id to searchbyid");
				int id=sc.nextInt();
				Person p=ps.displayById(id);
				if(p!=null) {
				System.out.println(p);
				}
				else {
					System.out.println("id not present");
				}
				break;
			case 3:
				Person[] arr=ps.displayAll();
				for(Person p1:arr) {
					if(p1!=null)
					   System.out.println(p1);
					else
						break;
				}
				break;
	
	
			case 4:
				sc.close();
				System.out.println("thankyou for visiting");
				break;
			default:
				System.out.println("invalid input");
			}
		}while(choice!=0);
	}





}

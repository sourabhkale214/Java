package com.Project.PersonServices;

import java.util.Scanner;

import com.Project.Beans.Person;
import com.Project.dao.PersonDao;
import com.Project.dao.PersonDaoImpl;

public class PersonServiceImp1 implements PersonService {


	Scanner sc=new Scanner(System.in);
		private PersonDao pdao;
		public PersonServiceImp1() {
			pdao=new PersonDaoImpl();
			
		}
		@Override
		public void addNewPerson() {
			
			System.out.println("enter the id of the person");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the name of the person");
			String name=sc.nextLine();
			System.out.println("enetr the mobnum of the person");
			int mobnum=sc.nextInt();
			Person p=new Person(id,name,mobnum);
			pdao.save(p);
			
		}

		@Override
		public Person displayById(int id) {
			// TODO Auto-generated method stub
			return pdao.findById(id);
		}

		@Override
		public Person[] displayAll() {
			return pdao.findAll();
		}


		
}

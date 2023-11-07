package com.Project.dao;

import com.Project.Beans.Person;

public class PersonDaoImpl implements PersonDao {
  static Person[] parr;
  private static int cnt;

	static{
		parr=new Person[100];
		parr[0]=new Person(1,"tejal",12345);
		parr[1]=new Person(2,"saurabh",123456);
		cnt=2;
		
		
	}
	@Override
	public void save(Person p) {
		parr[cnt]=p;
		cnt++;
		}
	@Override
	public Person[] findAll() {
			return parr;
	}
	
	@Override
	public Person findById(int id) {
		for(int i=0;i<cnt;i++) {
			if(parr[i]!=null) {
			if(parr[i].getId()==id) {
				return parr[i];
			}
		}
		}
		return null;
	}

}

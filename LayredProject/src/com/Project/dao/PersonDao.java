package com.Project.dao;

import com.Project.Beans.Person;

public interface PersonDao {

	void save(Person p);

	Person[] findAll();

	Person findById(int id);

}

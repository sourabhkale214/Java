package com.Project.PersonServices;

import com.Project.Beans.Person;

public interface PersonService {

	void addNewPerson();

	Person displayById(int id);

	Person[] displayAll();



}

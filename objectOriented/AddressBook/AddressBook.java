package com.bridgeIt.objectOriented.AddressBook;

import java.util.ArrayList;

public interface AddressBook {

	void addPerson();
	ArrayList<Person> editPerson(String name);
	void deletePerson(String name);
	ArrayList<Person> sortByLastName(ArrayList<Person> list);
	ArrayList<Person> sortByZip(ArrayList<Person> list);
	void print(ArrayList<Person> list);
	
	
}

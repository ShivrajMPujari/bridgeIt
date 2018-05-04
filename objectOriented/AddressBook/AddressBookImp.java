package com.bridgeIt.objectOriented.AddressBook;

import java.util.ArrayList;
import java.util.Collections;

import com.bridgeIt.utility.Utility;

public class AddressBookImp implements AddressBook {
	
	ArrayList<Person> list=new ArrayList<Person>();
	
	AddressBookImp(){}
	AddressBookImp(ArrayList list){
		this.list=list;
	}
	
	
	@Override
	public void addPerson() {
		
		Person person=new Person();
		System.out.println("Enter your First name");
		person.setFirstName(Utility.inputString());
		System.out.println("Enter your Last name");
		person.setLastname(Utility.inputString());
		System.out.println("Enter your Address");
		String st=Utility.inputStringLong();
		person.setAddress(st);
		System.out.println("Enter your City");
		person.setCity(Utility.inputString());
		System.out.println("Enter your ZipCode");
		person.setZipcode(Utility.inputInt());
		System.out.println("Enter your State");
		person.setState(Utility.inputString());
		System.out.println("Enter your phone Number");
		person.setPhoneNumber(Utility.inputString());
		list.add(person);
		
	}

	@Override
	public ArrayList<Person> editPerson(String name) {

		print(list);
	for (Person people : list) {
			if(people.getFirstName().equals(name))	{
				
				System.out.println("Enter your Address");
				String st=Utility.inputStringLong();
				people.setAddress(st);
				System.out.println("Enter your City");
				people.setCity(Utility.inputString());
				System.out.println("Enter your state");
				people.setState(Utility.inputString());
				System.out.println("Enter your ZipCode");
				people.setZipcode(Utility.inputInt());
				System.out.println("Enter your phone Number");
				people.setPhoneNumber(Utility.inputString());
				print(list);
				return list;
			}
			
			}
		System.out.println("No such name exist.");
		print(list);
		return list;
	}

	@Override
	public void deletePerson(String name) {
		
		
		for (Person people : list) {
				if(people.getFirstName().equals(name))	{
					list.remove(people);
					break;
				}
				
				}
		System.out.println("No such name exist.");
		print(list);
	}

	@Override
	public ArrayList<Person> sortByLastName(ArrayList<Person> list) {
		
	Collections.sort(list,new NameComparator());
		
		return list;
	}

	@Override
	public ArrayList<Person> sortByZip(ArrayList<Person> list) {

		Collections.sort(list,new ZipComparator());
		
		return list;
	}

	
	@Override
	public void print(ArrayList<Person> list) {
			
		for (Person person : list) {
			
			System.out.println("First Name:- "+person.getFirstName()+" Last Name:- "+person.getLastname());
			System.out.println("Address:- "+person.getAddress());
			System.out.println("City:- "+person.getCity()+" State:- "+person.getState());
			System.out.println("Zip code:- "+person.getZipcode());
			System.out.println();
		}
		
	}
												
	public static void main(String[] args) {
		
		
		AddressBookImp add=new AddressBookImp();
		add.addPerson();
		add.addPerson();
		add.addPerson();
		add.deletePerson("adit");
	}
	
	
}

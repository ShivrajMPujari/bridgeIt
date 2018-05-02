package com.bridgeIt.objectOriented.AddressBook;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class AddressBookManagerImp implements AddressBookManager {

	@Override
	public void readFile() {
	
	File file= new File("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//Json");
	String [] st=file.list();
	System.out.println(Arrays.toString(st));
	
	}

	@Override
	public void createFile(String files) throws IOException {
	File file= new File("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//Json//"+files+".json");
	file.createNewFile();
	
	System.out.println(file.exists());
		
	}

	public static void main(String[] args) throws IOException {
		AddressBookManagerImp book= new AddressBookManagerImp();
		book.createFile("shiv");
		book.readFile();
	}
}

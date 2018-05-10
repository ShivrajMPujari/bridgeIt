package com.bridgeIt.objectOriented.AddressBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgeIt.utility.Utility;

public class AddressBookManagerImp implements AddressBookManager {

	
	/* function reads the file of the user
	 * @see com.bridgeIt.objectOriented.AddressBook.AddressBookManager#readFile()
	 */
	@Override
	public void readFile() throws JsonParseException, JsonMappingException, IOException {
	
	File file= new File("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//Json");
	String [] st=file.list();
	System.out.println(Arrays.toString(st));
	System.out.println("Enter the name of book to open");
	String bookName=Utility.inputString();
	ObjectMapper map= new ObjectMapper();
	FileReader file1= new FileReader("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//Json//"+bookName+".json");
	BufferedReader br = new BufferedReader(file1);
	ArrayList<Person> persons= (ArrayList<Person>) map.readValue(br,new TypeReference<List<Person>>(){});
	AddressBookOpen openbook= new AddressBookOpen(persons, bookName);
	openbook.actions();
	
	}

	/* function creates file of the username
	 * @see com.bridgeIt.objectOriented.AddressBook.AddressBookManager#createFile(java.lang.String)
	 */
	@Override
	public boolean createFile(String files)  {
	File file= new File("//home//bridgeit//Downloads//shiv//JavaPrograms//src//com//bridgeIt//objectOriented//Json//"+files+".json");
	boolean existence=file.exists();
	if(existence){
		
		return true;
	}
	
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;
	}

	public static void main(String[] args) throws IOException {
		
		AddressBookManagerImp book= new AddressBookManagerImp();
		book.createFile("jayauiah");
		
	}
}

package com.bridgeIt.objectOriented.AddressBook;

import java.io.IOException;

public interface AddressBookManager {

	void readFile();
	void createFile(String file) throws IOException;
	
}

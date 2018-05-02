package com.bridgeIt.objectOriented.AddressBook;

import java.util.Comparator;

public class ZipComparator  implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Person person1=(Person)o1;
		Person person2=(Person)o2;
		
		return person1.getZipcode().compareTo(person2.getZipcode());
	}

}

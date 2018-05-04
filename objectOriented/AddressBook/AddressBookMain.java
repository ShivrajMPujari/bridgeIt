
package com.bridgeIt.objectOriented.AddressBook;

import java.io.IOException;
import java.util.ArrayList;

import com.bridgeIt.utility.Utility;

public class AddressBookMain {

	public static void main(String[] args) throws IOException {

		AddressBookManagerImp create = new AddressBookManagerImp();
		JsonPerform perform = new JsonPerform();
		System.out.println("Press the following numbers to perform actions:- ");
		System.out.println(" 1.Create new address book \n 2.Open existing address book \n 3.Quit");
		int i = 0;
		System.out.println("Enter your choice");
		int choice = Utility.inputInt();
		while (i == 0) {

			switch (choice) {

			case 1: {

				System.out.println("Enter the Adress book name ");
				String name = Utility.inputStringLong();
				if (create.createFile(name) == true) {

					choice = 1;
					System.out.println("file already exist");
					break;

				}
				AddressBookImp book = new AddressBookImp();
				System.out.println("Press the following numbers to perform actions:- ");
				System.out.println(
						" 1.Add person \n 2.Edit person \n 3.remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
				int need = Utility.inputInt();

				while (need < 7) {

					switch (need) {
					case 1: {

						book.addPerson();
						book.print(book.list);
						System.out.println(
								" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
						need = Utility.inputInt();
						break;
					}
					case 2: {

						book.print(book.list);
						System.out.println("Enter the person first name to edit");
						String names = Utility.inputStringLong();
						book.editPerson(names);
						System.out.println(
								" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
						need = Utility.inputInt();
						break;
					}
					case 3: {

						System.out.println("Enter the person first name to delete");
						book.deletePerson(name);
						System.out.println(
								" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Quit");
						need = Utility.inputInt();
						break;

					}
					case 4: {

						ArrayList<Person> nameList = book.sortByLastName(book.list);
						book.print(nameList);
						System.out.println(
								" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
						need = Utility.inputInt();
						break;
					}
					case 5: {

						ArrayList<Person> zipList = book.sortByZip(book.list);
						book.print(zipList);
						System.out.println(
								" 1.Add person \n 2.Edit person \n 3.Remove person \n 4.Sort By name \n 5.Sort By zip \n 6.Save&Quit");
						need = Utility.inputInt();
						break;
					}
					case 6: {

						System.out.println(name);

						perform.writeToFile(name, book.list);
						System.out.println(" 1.Create new address book \n 2.Open existing address book \n 3.Quit");
						choice = Utility.inputInt();
						need = 7;
						break;
					}

					}
				}
				break;
			}
			case 2: {

				create.readFile();
				System.out.println(" 1.Create new address book \n 2.Open existing address book \n 3.Quit");
				choice = Utility.inputInt();
				break;

			}
			case 3: {

				System.exit(0);
				break;

			}

			}

		}

	}

}

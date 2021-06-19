
package OneLookPhonebook;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import MainDirectory.Address;

public class MainDirectory {

	public static void main(String[] args) throws InterruptedException {
		Address jdaddress = new Address("114 Market St", "St. Louis", "MO", "63403");
		Address jedaddress = new Address("324 Main St", "St. Charles", "MO", "63303");
		Address jmwdaddress = new Address("574 Pole Ave", "St. Peters", "MO", "63333");
		Person johnDoe = new Person("John", "", "Doe", jdaddress, "6366435698");
		Person johnEDoe = new Person("John", "E", "Doe", jedaddress, "8475390126");
		Person johnMichaelWestDoe = new Person("John", "Michael West", "Doe", jmwdaddress, "5628592375");
		ArrayList<Person> listings = new ArrayList<Person>();
		listings.add(johnDoe);
		listings.add(johnEDoe);
		listings.add(johnMichaelWestDoe);
		Scanner selection = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		int choice;
		String entry;
		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO ONE LOOK PHONEBOOK ");
		blank(2);
		print("   At");
		blank(1);
		print("****************************************");
		print("                           Loading .    ");
  		Thread.sleep(3000);
  		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO ONE LOOK PHONEBOOK DIRECTORY");
		blank(2);
		print("   At One Look Express,");
		blank(1);
		print("****************************************");
		print("                           Loading . .  ");
  		Thread.sleep(1000);
  		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO ONE LOOK PHONEBOOK DIRECTORY");
		blank(2);
		print("   At One Look Express, we");
		blank(1);
		print("****************************************");
		print("                           Loading . . .");
  		Thread.sleep(1000);
  		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO ONE LOOK PNONEBOOK DIRECTORY");
		blank(2);
		print("   At One Look Express, we make");
		blank(1);
		print("****************************************");
		print("                           Loading .    ");
  		Thread.sleep(1000);
  		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO ONE LOOK PHONEBOOK DIRECTORY");
		blank(2);
		print("   At One Look Express, we make the");
		blank(1);
		print("****************************************");
		print("                           Loading . .  ");
  		Thread.sleep(1000);
  		blank(50);
		print("****************************************");
		blank(2);
		print("WELCOME TO ONE LOOK PHONEBOOK DIRECTORY");
		blank(2);
		print("   At One Look Express, we make the future!");
		blank(1);
		print("****************************************");
		print("                           Loading . . .");
  		Thread.sleep(2000);
  		blank(50);
  		int keepgoing = 0;
		while(keepgoing < 1) {
  		print("WELCOME TO ONE LOOK PHONEBOOK DIRECTORY\r\n"+
  				"Please make a selection from one of the choices below:\r\n" + 
				"1 SEARCH THE DIRECTORY\r\n" + 
				"2 VIEW ALL DIRECTORY LISTINGS\r\n" + 
				"3 UPDATE AN EXISTING ENTRY\r\n" + 
				"4 ADD A NEW LISTING\r\n" + 
				"5 DELETE AN EXISTING LISTING\r\n" + 
				"6 EXIT THE PHONE DIRECTORY\r\n" + "");
  		choice = selection.nextInt();
  		blank(1);
  		switch(choice) {
  			case 1:
  				print("SEARCH THE DIRECTORY");
  				blank(1);
  				print("***Please select your search criteria***\r\n" + 
  						"\r\n" + 
  						"Please make a selection from the choices below:\r\n" + 
  						"1 SEARCH BY FIRST AND LAST NAME\r\n" + 
  						"2 SEARCH BY LAST NAME ONLY\r\n" + 
  						"3 SEARCH BY FIRST NAME ONLY\r\n" + 
  						"4 SEARCH BY STATE\r\n" + 
  						"5 SEARCH BY CITY\r\n" + 
  						"6 REVERSE PHONE LOOKUP");
  				choice = selection.nextInt();
  				blank(1);
  				switch(choice) {
  				case 1:
  					print("SEARCH BY FIRST AND LAST NAME");
  					blank(1);
  					print("Enter the last name only, then press 'Enter'.");
  					entry = input.nextLine();
  					String searchLastName = entry;
  					print("Enter the first name only, then press 'Enter'.");
  					entry = input.nextLine();
  					print("The search for " + entry + " " + searchLastName + " produced the following results: ");
  	  				int counter = 0;
  	  				for(Person firstLast : listings) {
  	  					if(firstLast.getFirstName().equals(entry) && firstLast.getLastName().equals(searchLastName)) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(firstLast.getFirstName()+" "+firstLast.getMiddleName()+firstLast.getLastName());
  	  						System.out.println(firstLast.getAddress());
  	  						System.out.println(parsePhoneNum(firstLast.getNumber()));
  	  						blank(1);
  	  					}
  	  				}  					
  					break;
  				case 2:
  					print("SEARCH BY LAST NAME ONLY");
  					blank(1);
  					print("Enter the last name, then press the 'Enter' key.");
  					entry = input.nextLine();
  					print("The search for " + entry + " produced the following results: ");
  	  				counter = 0;
  	  				for(Person lastName : listings) {
  	  					if(lastName.getLastName().equals(entry)) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(lastName.getFirstName()+" "+lastName.getMiddleName()+lastName.getLastName());
  	  						System.out.println(lastName.getAddress());
  	  						print(parsePhoneNum(lastName.getNumber()));
  	  						blank(1);
  	  					}
  	  				}  					
  					break;
  				case 3:
  					print("SEARCH BY FIRST NAME ONLY");
  					blank(1);
  					print("Enter the first name, then press the 'Enter' key.");
  					entry = input.nextLine();
  					print("The search for " + entry + " produced the following results: ");
  	  				counter = 0;
  	  				for(Person firstName : listings) {
  	  					if(firstName.getFirstName().equals(entry)) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(firstName.getFirstName()+" "+firstName.getMiddleName()+firstName.getLastName());
  	  						System.out.println(firstName.getAddress());
  	  						print(parsePhoneNum(firstName.getNumber()));
  	  						blank(1);
  	  					}
  	  				}  					
  					break;
  				case 4:
  					print("SEARCH BY STATE");
  					blank(1);
  					print("Enter the two-letter state abbreviation, then press the 'Enter' key.");
  					entry = input.nextLine().toUpperCase();
  					print("The search for listings in " + entry + " produced the following results: ");
  	  				counter = 0;
  	  				for(Person state : listings) {
  	  					if(state.getAddress().getState().toUpperCase().equals(entry.toUpperCase())) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(state.getFirstName()+" "+state.getMiddleName()+state.getLastName());
  	  						System.out.println(state.getAddress());
  	  						print(parsePhoneNum(state.getNumber()));
  	  						blank(1);
  	  					}
  	  				}  					
  					break;
  				case 5:
  					print("SEARCH BY CITY");
  					blank(1);
  					print("Enter the city name, then press the 'Enter' key.");
  					entry = input.nextLine();
  					print("The search for listings in the city of " + entry + " produced the following results: ");
  	  				counter = 0;
  	  				for(Person city : listings) {
  	  					if(city.getAddress().getCity().equals(entry)) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(city.getFirstName()+" "+city.getMiddleName()+city.getLastName());
  	  						System.out.println(city.getAddress());
  	  						print(parsePhoneNum(city.getNumber()));
  	  						blank(1);
  	  					}
  	  				}  					
  					break;
  				case 6:
  					blank(2);
  					print("REVERSE PHONE NUMBER LOOKUP");
  					blank(1);
  					print("Enter the 10-digit telephone number you wish to lookup. Enter the number without spaces.");
  					entry = input.nextLine();
  	  				blank(1);
  					print("The search for phone number " + parsePhoneNum(entry) + " produced the following results: ");
  	  				counter = 0;
  	  				for(Person phoney : listings) {
  	  					if(phoney.getNumber().equals(entry)) {
  	  						counter++;
  	  						print("LISTING " + counter);
  	  						System.out.print(phoney.getFirstName()+" "+phoney.getMiddleName()+phoney.getLastName());
  	  						System.out.println(phoney.getAddress());
  	  						blank(1);
  	  						}
  	  					}
				default:
					print("Please make a valid selection.");
					break;  	  				
  					}
				break;
  			case 2:
  				blank(1);
  				print("VIEW ALL DIRECTORY LISTINGS");
  				blank(1);
  				for(Person fullList : listings) {
  					System.out.print(fullList);
  					blank(1);
  				}
  				blank(1);
  					break;
  			case 3:
  				print("UPDATE AN EXISTING ENTRY");
  				blank(1);
  				print("Please enter the 10-digit phone number of the listing you would like to update.");
  				entry = input.nextLine();
				blank(1);
				int indexFound = -1;
  				for(Person chosenOne : listings) {
  					if(chosenOne.getNumber().equals(entry)) {
  						indexFound = listings.indexOf(chosenOne);
  					}
  					if(indexFound > -1) {
  						print("LISTING FOUND. Please enter the requested data to update the listing.");
  		  				blank(1);
  		  				print("Enter the first name only.");
  		  				entry = input.nextLine();
  		  				String firstName = entry;
  		  				print("Next, enter the middle name only. IF THERE IS NONE, PRESS ENTER.");
  		  				entry = input.nextLine();
  		  				String middleName = entry;
  		  				print("Next, enter the last name only.");
  		  				entry = input.nextLine();
  		  				String lastName = entry;
  		  				print("Next, enter the street number and street name to appear on the address first line.");
  		  				entry = input.nextLine();
  		  				String street1 = entry;
  		  				print("Next, enter the city only.");
  		  				entry = input.nextLine();
  		  				String city = entry;
  		  				print("Next, enter the state only.");
  		  				entry = input.nextLine();
  		  				String state = entry;
  		  				print("Next, enter the five digit zip code only.");
  		  				entry = input.nextLine();
  		  				String zipCode = entry;
  		  				print("Finally, enter the 10-digit telephone number WITH NO SPACES OR HYPHENS. Ex. 5559998888");
  		  				entry = input.nextLine();
  		  				blank(1);
  		  				String number = entry;
  		  				Address address = new Address (street1, city, state, zipCode);
  		  				listings.get(indexFound).setFirstName(firstName);
  		  				listings.get(indexFound).setMiddleName(middleName);
  		  				listings.get(indexFound).setLastName(lastName);
  		  				listings.get(indexFound).setAddress(address);
  		  				listings.get(indexFound).setNumber(number);
  		  				print("Thank you. The listing has been updated.");
  		  				blank(1);
  		  				Collections.sort(listings);
  		  				for(Person x : listings) {
  		  					System.out.print(x);
  		  					blank(1);
  		  					}
  		  				break;
  					}
  				}
  				break;
  			case 4:
  				blank(1);
  				print("ADD A NEW LISTING");
  				blank(1);
  				print("Enter the first name only.");
  				entry = input.nextLine();
  				String firstName = entry;
  				print("Next, enter the middle name only. IF THERE IS NONE, PRESS ENTER.");
  				entry = input.nextLine();
  				String middleName = entry;
  				print("Next, enter the last name only.");
  				entry = input.nextLine();
  				String lastName = entry;
  				print("Next, enter the street number and street name to appear on the address first line.");
  				entry = input.nextLine();
  				String street1 = entry;
  				print("Next, enter the city only.");
  				entry = input.nextLine();
  				String city = entry;
  				print("Next, enter the state only.");
  				entry = input.nextLine();
  				String state = entry;
  				print("Next, enter the five digit zip code only.");
  				entry = input.nextLine();
  				String zipCode = entry;
  				print("Finally, enter the 10-digit telephone number WITH NO SPACES OR HYPHENS. Ex. 5559998888");
  				entry = input.nextLine();
  				String number = entry;
			Person addOne = new Person(firstName, middleName, lastName, new Address(street1, city, state, zipCode), number);
  				listings.add(addOne);
  				print("Thank you. The listing has been added.");
  				blank(1);
  				Collections.sort(listings);
  				for(Person x : listings) {
  					System.out.print(x);
  					blank(1);
  				}
  				blank(1);
					break;
  			case 5:
  				print("DELETE AN EXISTING LISTING");
  				blank(1);
  				print("Please enter the 10-digit phone number of the listing you would like to remove.");
  				entry = input.nextLine();
				blank(1);
  				for(Person chosenOne : listings) {
  					if(chosenOne.getNumber().equals(entry)) {
  						indexFound = listings.indexOf(chosenOne);
  						listings.remove(indexFound);
  		  				print("LISTING REMOVED");
  		  				for(Person fullList : listings) {
  		  					System.out.print(fullList);
  		  					blank(1);
  		  				}
  		  				blank(1);
  						break;
  						}
  					}
					break;
  				
  			case 6:
  				print("EXIT THE PHONE DIRECTORY");
  				blank(2);
  				print("Shutting down. Please wait.");
  		  		Thread.sleep(3000);
  		  		blank(50);
  				print("****************************************");
  				blank(2);
  				print("    THANK YOU FOR CHOOSING ONE LOOK PHONEBOOK");
  				blank(2);
  				print("    At One Look Express, we make the future!");
  				blank(1);
  				print("****************************************");
  				print("                       Session has ended");
  				selection.close();
  				input.close();
				return;
  			default:
  				print("Please enter a valid selection");
					break;
  				}
			}
		}//End of the main method / while loop

		public static void blank(int lines) {
		for(int i = 0; i <= lines; i++) {
			System.out.println();
			}
		}
		public static void print(String string) {
			System.out.println(string);
		}
		public static String parsePhoneNum(String phoneNum) {
			String areaCode = phoneNum.substring(0, 3);
			String prefix = phoneNum.substring(3, 6);
			String suffix = phoneNum.substring(6, 10);
			return ("("+ areaCode + ") " + prefix + "-" + suffix);
		}

}

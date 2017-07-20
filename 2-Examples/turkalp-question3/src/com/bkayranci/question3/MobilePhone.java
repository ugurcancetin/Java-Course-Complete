package com.bkayranci.question3;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public static void main(String[] args) {
		ContactMenu();
	}

	private static void ContactMenu() {
		
		while(true){
			// TODO: Clean Screen
			System.out.println("MENU");
			System.out.println("1\t-> List All Contact");
			System.out.println("2\t-> Edit Contact");
			System.out.println("3\t-> Delete Contact");
			System.out.println("4\t-> Show Detail Contact");
			System.out.println("5\t-> Add New Contact");
			System.out.println("!int\t-> Quit Application");
			
			if (scan.hasNextInt()) {
				switch (scan.nextInt()) {
				case 1:
					ListAllContact();
					break;
				case 2:
					EditContact();
					break;
				case 3:
					DeleteContact();
					break;
				case 4:
					ShowDetailContact();
					break;
				case 5:
					AddNewContact();
					break;
				default:
					System.out.println("command not found!");
					
					break;
				}
			}
			else {
				// TODO: clean screen
				System.out.println("Bye bye :)");
				break;
			}
				
		}
	}

	private static Contact AddNewContact() {
		// TODO: clear screen
		System.out.println("ADD NEW CONTACT MENU");
		
		String newName = getNewName();
		
		String newSurname = getNewSurname();
		
		String newPhoneNumber = getNewPhoneNumber();
		
		
		
		System.out.println("Object is created!");
		Contact qwe = new Contact(newName, newSurname, newPhoneNumber);
		qwe.printMe();
		contacts.add(0, qwe);
		return qwe;
		
	}

	private static String getNewName() {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter Name: ");
		return myScan.nextLine();
	}

	private static String getNewSurname() {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter Surname: ");
		return myScan.nextLine();
	}

	private static String getNewPhoneNumber() {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter PhoneNumber: ");
		return myScan.nextLine();
	}

	private static void ShowDetailContact() {
		Scanner scan = new Scanner(System.in);
		// TODO: clear screen
		System.out.println("SHOW DETAIL MENU");
		ListAllContact();
		System.out.println("Enter a name: ");
		
		if(scan.hasNext()) {
		// TODO: Make control Id is exists and unsigned
			Contact con = findContactWithName(scan.nextLine());
			if (con != null) {
				contacts.get(contacts.indexOf(con)).printMe();	
			}
		}
		else {
			System.out.println("Incorrect entry!");
		}
	}

	private static void DeleteContact() {
		// TODO: clear screen
		Scanner scan = new Scanner(System.in);
		System.out.println("DELETE MENU");
		ListAllContact();
		System.out.println("Enter a name for delete: ");
		
		if(scan.hasNext()) {
			// TODO: Make control Id is exists and unsigned
			contacts.remove(findContactWithName(scan.nextLine()));
		}
		else {
			System.out.println("Incorrect entry!");
		}
		
		
		
	}

	private static void EditContact() {
		// TODO: clear screen
		Scanner scan = new Scanner(System.in);
		System.out.println("EDIT MENU");
		ListAllContact();
		System.out.println("Enter a name: ");
		
		if(scan.hasNext()) {
			// TODO: Make control Id is exists and unsigned
			String name = scan.nextLine();
			Contact con = findContactWithName(name);
			if (con != null) {
				contacts.get(contacts.indexOf(con)).editMe();
			}
			
		}
		else {
			System.out.println("Incorrect entry!");
		}
	}

	private static Contact findContactWithName(String nextLine) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).Name.contains(nextLine)) {
				contacts.get(i).printMe();
				System.out.println("Do you want to this contact? (1 or 0)");
				if (scanner.hasNextInt()) {
					int key = scanner.nextInt();
					if (key == 1) {
						return contacts.get(i);
					}
					else {
						continue;
					}
				}
			}
		}
		System.out.println("Contact not found!");
		return null;
	}

	private static void ListAllContact() {
		for (int i = 0; i < contacts.size(); i++) {
			contacts.get(i).printMe();
		}
	}
	
	public static int getNewId(){
		if (contacts.isEmpty()) {
			return 0;
		}
		else {
			return contacts.size();
		}
	}
}
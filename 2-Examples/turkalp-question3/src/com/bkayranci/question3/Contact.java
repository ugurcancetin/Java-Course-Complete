package com.bkayranci.question3;

import java.util.Scanner;
import javax.security.auth.Subject;

public class Contact {
	public static Scanner scan = new Scanner(System.in);
	
	int Id;
	String Name;
	String Surname;
	String PhoneNumber;
	
	public void printMe() {
		System.out.println("\n********************");
		System.out.println("Id: " + this.Id);
		System.out.println("Name: " + this.Name);
		System.out.println("Surname: " + this.Surname);
		System.out.println("Phonename: " + this.PhoneNumber);
		System.out.println("********************\n");
	}

	public Contact(){
		this.Id = MobilePhone.getNewId();
		this.Name = "";
		this.Surname = "";
		this.PhoneNumber = "";
	}
	public Contact(String Name,String Surname,String PhoneNumber){
		this.Id = MobilePhone.getNewId();
		this.Name = Name;
		this.Surname = Surname;
		this.PhoneNumber = PhoneNumber;
	}
	
	public void editMe() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Last Data\n(for empty you press only n)");
		printMe();
		
		System.out.println("New name (" + this.Name + "):");
		if (scan.hasNext()) {
			String newName = scan.nextLine();
			if (newName.length() == 1 && (newName.charAt(0) == 'n' || newName.charAt(0) == 'N')) {
				this.Name = "";
			}
			else {
				this.Name = newName;
			}
		}
		System.out.println("New surname (" + this.Surname + "):");
		if (scan.hasNext()) {
			String newSurname = scan.nextLine();
			if (newSurname.length() == 1 && (newSurname.charAt(0) == 'n' || newSurname.charAt(0) == 'N')) {
				this.Surname = "";
			}
			else {
				this.Surname = newSurname;
			}
		}
		System.out.println("New phone number (" + this.PhoneNumber + "):");
		if (scan.hasNext()) {
			String newPhoneNumber = scan.nextLine();
			if (newPhoneNumber.length() == 1 && (newPhoneNumber.charAt(0) == 'n' || newPhoneNumber.charAt(0) == 'N')) {
				this.PhoneNumber = "";
			}
			else {
				this.PhoneNumber = newPhoneNumber;
			}
		}
		
		System.out.println("Object is editted!");
		// TODO: clean screen
		printMe();
		
	}
	
}
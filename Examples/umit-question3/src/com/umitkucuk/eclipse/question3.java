package com.umitkucuk.eclipse;

import java.util.Scanner;

public class question3 {

	public static void crypt(String myString){
		int shift = 8;
		String newText = "";
		for(int i=0; i<myString.length(); i++){
			char c1 = myString.charAt(i);
			if(Character.isLetter(c1)){
				if(Character.isLowerCase(c1)){
					char c2 = (char)(c1+shift);
					if(c2>'z'){
						newText += (char)(c1 - (26-shift));
					}
					else {
						newText += c2;
					}
				}
				else if(Character.isUpperCase(c1)){
					char c2 = (char)(c1+shift);
					if(c2>'Z'){
						newText += (char)(c1 - (26-shift));
					}
					else {
						newText += c2;
					}
				}
			}
			else {
				newText += c1;
			}
		}
		System.out.println("Your cryptic text is: " + newText);
	}
	
	public static void decrypt(String myString){
		int shift = 8;
		String newText = "";
		for(int i=0; i<myString.length(); i++){
			char c1 = myString.charAt(i);
			if(Character.isLetter(c1)){
				if(Character.isLowerCase(c1)){
					char c2 = (char)(c1-shift);
					if(c2<'a'){
						newText += (char)(c1 + (26-shift));
					}
					else {
						newText += c2;
					}
				}
				else if(Character.isUpperCase(c1)){
					char c2 = (char)(c1-shift);
					if(c2<'A'){
						newText += (char)(c1 - (26-shift));
					}
					else {
						newText += c2;
					}
				}
			}
			else {
				newText += c1;
			}
		}
		System.out.println("Your decryptic text is: " + newText);	
	}
	
	public static void cryptSelection(){
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter your text to make it cryptic: ");
		String myString = input.nextLine();
		crypt(myString);
	}
	
	public static void decryptSelection(){
		Scanner input = new Scanner (System.in);
		System.out.print("Please enter your text to make it decryptic: ");
		String myString = input.nextLine();
		decrypt(myString);
	}
		
	
	public static void main(String[] args) {	    
	    System.out.println("1 - Crypt ");
	    System.out.println("2 - Decrypt ");
	    System.out.print("Please choose your selection: ");
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();

	    switch (choice) {
	        case 1:
	            cryptSelection();
	            break;
	        case 2:
	            decryptSelection();
	            break;
	        default:
	        	break;
	    }
	}

}

package com.bkayranci.question3;

import java.util.Scanner;

public class Source {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String data = new String("text");
		Encryption encryption = new Encryption(data);
		String encryptedText = encryption.encrypt();
		System.out.println(encryptedText);
		
		Encryption decryption = new Encryption("tjgsfmfofdfl!nfujo");
		System.out.println(decryption.decrypt());
		
		
		System.out.println(encryption.decrypt(encryption.encrypt("hello")));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text for encryption: ");
		String encryptedData = scan.nextLine();
		System.out.println("Entered Text:" + encryptedData);
		System.out.println("Encrypted Text: " + Encryption.encrypt(encryptedData));
		System.out.println("Encrypted Text(difficult:10): " + Encryption.encrypt(encryptedData,10));
		
		System.out.println("Enter text for decryption: ");
		String decryptedData = scan.nextLine();
		System.out.println("Entered Text: " + decryptedData);
		System.out.println("Decrypted Text: " + Encryption.decrypt(decryptedData));
		System.out.println("Decrypted Text(difficult:10): " + Encryption.decrypt(decryptedData,10));
		
		System.out.println("Enter text for encrypt and decrypt: ");
		String newData = scan.nextLine();
		System.out.println("Entered Text: " + newData);
		System.out.println("Decrypted Text(difficult:"+ newData.length() +"): " + Encryption.decrypt(newData,newData.length()));
		
	}
	public static class Encryption{
		String myData;
		static int encryptDifficult = 1;
		Encryption(String data) {
			this.myData = data;
		}
		Encryption(String data,int difficult) {
			this.myData = data;
			this.encryptDifficult = difficult;
		}
		String encrypt(){
			String Temp = "";
			for (int i = 0; i < myData.length(); i++) {
				 Temp += (char)(myData.charAt(i) + encryptDifficult);
			}
			return Temp;
		}
		static String encrypt(String data){
			String Temp = "";
			for (int i = 0; i < data.length(); i++) {
				 Temp += (char)(data.charAt(i) + encryptDifficult);
			}
			return Temp;
		}
		static String encrypt(String data,int encryptDifficult){
			String Temp = "";
			for (int i = 0; i < data.length(); i++) {
				 Temp += (char)(data.charAt(i) + encryptDifficult);
			}
			return Temp;
		}
		
		String decrypt(){
			String Temp = "";
			for (int i = 0; i < myData.length(); i++) {
				Temp += (char)(myData.charAt(i) - encryptDifficult);
			}
			return Temp;
		}
		static String decrypt(String data){
			String Temp = "";
			for (int i = 0; i < data.length(); i++) {
				Temp += (char)(data.charAt(i) - encryptDifficult);
			}
			return Temp;
		}
		static String decrypt(String data,int encryptDifficult){
			String Temp = "";
			for (int i = 0; i < data.length(); i++) {
				Temp += (char)(data.charAt(i) - encryptDifficult);
			}
			return Temp;
		}
	}

}
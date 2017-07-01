package com.umitkucuk.eclipse;

import java.util.Scanner;

public class question2 {
	
	public static void write(int[] characterCount, char[] characters){
		for(int i=0; i<characterCount.length; i++){
			System.out.println(characters[i] + " : " + characterCount[i]);
		}
	}
	
	// Bubble Sort Algorithm
	public static void sort(int[] characterCount, char[] characters){
		int temp1;
		char temp2;
		for(int i=0; i<characterCount.length-1; i++){
			for(int j=0; j<characterCount.length-1; j++){
				if(characterCount[j]<characterCount[j+1]){
					temp1 = characterCount[j];
					characterCount[j] = characterCount[j+1];
					characterCount[j+1] = temp1;
					temp2 = characters[j];
					characters[j] = characters[j+1];
					characters[j+1] = temp2;
				}
			}
		}
	}
	
	public static void findCharsCount(String myString, int[] characterCount, char[] characters) {
		for(int i=0; i<characterCount.length; i++){
			for(int j=0; j<myString.length(); j++){
				if(myString.charAt(j)==characters[i]){
					characterCount[i]++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		char[] characters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] characterCount = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your string: ");
		String myString = input.nextLine();
		
		findCharsCount(myString, characterCount, characters);
		sort(characterCount, characters);
		write(characterCount, characters);	
	}

}



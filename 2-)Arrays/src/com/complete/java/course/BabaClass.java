package com.complete.java.course;

import java.util.Scanner;

public class BabaClass {

	private static Scanner scanner = new Scanner(System.in);
	//private static int[] myIntegers = getIntegers(5);
	private static ShoppingList shoppingList = new ShoppingList();
	
	public static void main(String[] args) {
		
		//Array defining
		//int[] myIntArray = new int[5];
		
		//tek tek atama
		/*	myIntArray[0] = 10;
		myIntArray[1] = 20;
		myIntArray[2] = 30;
		myIntArray[3] = 40;
		myIntArray[4] = 50;
		myIntArray[3] = 1000;*/
		//java.lang.ArrayIndexOutOfBoundsException Error
		//myIntArray[5] = 60;
		
		/*for (int i = 0; i < myIntArray.length; i++) {
			//deger atamasi
			myIntArray[i] = 100 * i;
			
			//dizideki degeri ekrana yazdir
			System.out.println( i+1 + ".number is : " + myIntArray[i]);
		}*/
		
		
		/*		
		printArray(myIntegers);
		System.out.println("The Average is : " + getAverage(myIntegers));
		resizeArray();
		System.out.println("Enter the new values ");
		getIntegers();
		printArray(myIntegers); */
		
		printIntructions();
		
		boolean quit = false;
		int choice = 0;
		while(!quit){
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				printIntructions();
				break;
			case 1:
				shoppingList.printShoppingList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit = true;
				break;
			}
		}
	}
		
	/*
	public static void getIntegers(){
		for (int i = 0; i < myIntegers.length; i++) {
			myIntegers[i]=scanner.nextInt();
		}
	}
	
	public static int[] getIntegers(int number){
		
		System.out.println("Please Enter  " + number + "  integer values");
		
		int[] values = new int[number];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	public static void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.println("Girdiginiz " + i + ".deger : " + array[i]);
		}
	}

	public static double getAverage(int[] array){
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (double)sum/ (double)array.length;
	}
	
	private static void resizeArray(){
		
		int[] original = myIntegers;
		
		myIntegers = new int[10];
		for (int i = 0; i < original.length; i++) {
			myIntegers[i] = original[i];
		}
	}*/
	
	public static void printIntructions(){
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options");
		System.out.println("\t 1 - To print the list of shopping list");
		System.out.println("\t 2 - To add an item to the list ");
		System.out.println("\t 3 - To modify an item in the list ");
		System.out.println("\t 4 - To remove an item from the list");
		System.out.println("\t 5 - To search for an item in the list");
		System.out.println("\t 6 - To quit the application");
		System.out.println("===========================================");
	}
	
	public static void addItem(){
		System.out.println("Please enter the shopping item : ");
		shoppingList.addShoppingItem(scanner.nextLine());
	}
	
	public static void modifyItem(){
		System.out.print("Enter the item number : ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the replacement item : ");
		String newItem = scanner.nextLine();
		shoppingList.modifyShoppingItem(itemNo-1, newItem);
	}
	
	public static void removeItem(){
		System.out.print("Enter the item number : ");
		int itemNo = scanner.nextInt();
		shoppingList.removeShoppingItem(itemNo);
	}
	
	public static void searchForItem(){
		System.out.print("Item to search for : ");
		String searchItem = scanner.nextLine();
		if(shoppingList.findItem(searchItem) != null){
			System.out.println(searchItem + " is found your shopping list");
		}else {
			System.out.println(searchItem + " is not found in the shopping list");
		}
	}
}
	

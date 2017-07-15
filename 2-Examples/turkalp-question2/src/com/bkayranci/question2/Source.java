package com.bkayranci.question2;

import java.util.Scanner;

public class Source {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {	
		System.out.println("Enter numeric and press non-numeric: ");
		int myArray[] = getIntegers();
		int newArray[] = sortIntegers(myArray);
		
		// Print myArray or newArray.
		if (newArray != null) {
			printArrays(newArray);
		}
		System.out.println("THE END!");
	}

	private static int[] getIntegers() {
		
		int tempArray[] = new int[0];
		
		while (scan.hasNextInt()){
			int tempArray2[] = new int[tempArray.length];
			System.arraycopy(tempArray, 0, tempArray2, 0, tempArray.length);
			tempArray = new int [tempArray2.length + 1];
			System.arraycopy(tempArray2, 0, tempArray, 0, tempArray2.length);
			tempArray[tempArray.length - 1] = scan.nextInt();
		}
		
		return tempArray;
	}

	private static void printArrays(int[] myArray) {
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
	}

	private static int[] sortIntegers(int[] myArray) {
		
		if (myArray.length <= 0) {
			return null;
		}
		
		int tempArray[] = new int[myArray.length];
		
		for (int i = 0; i < tempArray.length; i++) {
			tempArray[i] = myArray[i];
		}
		
		for (int i = 0; i < tempArray.length - 1; i++) {
			for (int j = 1; j < tempArray.length - i; j++) {
				if (tempArray[j - 1] < tempArray[j]) {
					int temp = tempArray[j - 1];
					tempArray[j - 1] = tempArray[j];
					tempArray[j] = temp;
				}
			}
		}
		
		return tempArray;
	}
}
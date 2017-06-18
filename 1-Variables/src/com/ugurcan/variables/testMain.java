package com.ugurcan.variables;

import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {

		// whole numbers data types
		
		//int primitive data type
		int int_lowest_range = -2_147_483_648;
		int int_highest_range = 2_147_483_647;
		int result = int_highest_range + int_lowest_range;
		System.out.println("Result : " + result);

		//Integer reference
		Integer ref_from_Integer_Class = 235;
		System.out.println(ref_from_Integer_Class);

		//Reversing an int number
	      int n, reverse = 0;
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter the number to reverse");
	      n= in.nextInt();
	      
	      while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
	 
	      System.out.println("Reverse of entered number is "+reverse);

	    //byte range and primitive data type 
		byte byte_highest_range = 127;
		byte byte_lowest_range = -128;

		//float and double primitive data type
		float myFloat = 5f;
		double myDouble = 5d;
		System.out.println(myDouble+ " - " + myFloat);

		
		float result1 = myFloat/ 3;
		System.out.println(result1);

		double result2 = myDouble / 3;
		System.out.println(result2);

		
		// Casting 
		myFloat = 2f;
		double result3 = (double) (myDouble / myFloat);
		System.out.println(result3);

		//char primitive data type
		char myChar = 'a';
		// char unicode = '\u009A';
		System.out.println(myChar);
		char MySecondChar = '\u01C0';
		System.out.println(MySecondChar);

		char charVariable = (char) ( myChar + MySecondChar );
		System.out.println(myChar + MySecondChar);
		System.out.println(charVariable);

		//boolean
		Boolean isFalse;
		boolean isCorrect = true;
		System.out.println(isCorrect);

		// Simply String.
		String myString1 = "bu bir";
		String myString2 = " denemedir";
		System.out.println(myString1 + myString2);
	}

}

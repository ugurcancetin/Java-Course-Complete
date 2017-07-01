package com.bkayranci.question2;

import java.util.Scanner;

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String data = "aaqweeeee";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter text:\n");
		String data = scan.nextLine();
		char myData[][] = new char[howManyChar(data)][2];
		operationString(data, myData);
		order(myData);
		writeConsole(myData);
	}
	public static void writeConsole(char[][] myData) {
		for (int i = 0; i < myData.length; i++) {
			System.out.println(myData[i][0] + ":" + (int)myData[i][1]);
		}
	}
	
	public static  void order(char[][] myData) {
		for (int i = 0; i < myData.length - 1; i++) {
			for (int j = 0; j < myData.length - i ; j++) {
				
				if ((int)myData[i][1] < (int)myData[i+j][1]) {
					char temp = myData[i][1];
					char temp2 = myData[i][0];
					myData[i][1] = myData[i+j][1];
					myData[i+j][1] = temp;
					myData[i][0] = myData[i+j][0];
					myData[i+j][0] = temp2;
				}
			}
		}
	}

	public static void operationString(String data,char myData[][]) {
		String temp = data;
		for (int i = 0; i < data.length(); i++) {
			if (temp.isEmpty()) {
				break;
			}
			myData[i][0] = temp.charAt(0);
			myData[i][1] = (char)CountChar(temp, temp.charAt(0));
			temp = temp.replace(""+temp.charAt(0), "");
		}
	}
	
	public static int howManyChar(String data){
		int result = 0;
		while (!data.isEmpty()) {
			result++;
			data = data.replace(""+data.charAt(0), "");
		}
		return result;
	}
	
	public static int CountChar(String myString,char myChar){
		int result = 0;
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == myChar) {
				result++;
			}
		}
		return result;
	}
}

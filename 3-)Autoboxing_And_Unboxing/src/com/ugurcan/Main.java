package com.ugurcan;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

class intClass {
	private int myValue;
	
	public intClass(int myValue){
		this.myValue = myValue ;
	}

	public int getMyValue() {
		return myValue;
	}

	public void setMyValue(int myValue) {
		this.myValue = myValue;
	}	
}

public class Main {
	
	public static void main(String[] args) {

		
		ArrayList<String> strArrayList = new ArrayList<>();
		strArrayList.add("Ugurcan");
		
		// int is a primitive type so we can't create ArrayList with primitive type
		//ArrayList<int> intArrayList = new ArrayList<>();
		
		
		// Thanks to our class we can use ArrayList. Actually we created a wrapper.
		ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
		intClassArrayList.add(new intClass(40));
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		//intArrayList.add(20);
		for (int i = 0; i < 10; i++) {
			intArrayList.add(Integer.valueOf(i));
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(i + "--> " + intArrayList.get(i).intValue());
		}
		
		//Integer is a wrapper class as String. Here we create an object and convert the value of it to primitive int.
		Integer myIntValue = 56;
		int MyInt = myIntValue.intValue();
		
		//Thanks to Wrapper classes, Our job gets easier becuase of ready functions and we don't need to write wrapper classes manually
		String test = "ASDA";
		String test2 = "ASD";
		boolean result = test.equals(test2);
		System.out.println(result);
	}
}

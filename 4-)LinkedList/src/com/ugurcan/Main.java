package com.ugurcan;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer("Ugurcan", 40.23);
		
		Customer anotherCustomer;
		
		anotherCustomer = customer;
		
		anotherCustomer.setBalance(12.18);
		
		boolean test = false;
		
		System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
		
		//Most of the students expect here as output 40.23 as balance because we display first customer balance
		//Therefore we haven't changed the first customer object balance and output should be 40.23
		//Well, not really!!
		//Here what happened in the behind scene actually when we equals the objects,
		//we have just saved the memory address. Therefore, 
		//when we change something with second class, actually we change the first class value as well, because
		//they point the same address. See the examples below
		
		anotherCustomer.setName("test");
		System.out.println("Another Customer name --> " + anotherCustomer.getName());
		System.out.println("First Customer name --> " + customer.getName());
		customer.setName("test -- 2");
		System.out.println("Another Customer name --> " + anotherCustomer.getName());
		System.out.println("First Customer name --> " + customer.getName());
		
		
		//============================================================================================================//
		System.out.println("=====================================================");
		if(anotherCustomer == customer){
			test = true;
			System.out.println(test);
		}else System.out.println(test);
		System.out.println("=====================================================");
		Integer x = new Integer(2);
		Integer y ;
		
		y = x;
		y = 4;
		System.out.println(x);
		// this is not working same on Wrapper classes because everytime when we give a value for variable
		// new object is being created.
		if (x == y) {
			System.out.println("true");
		}else System.out.println("false");
		
		System.out.println("=====================================================");
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + " : " + intList.get(i));
		}
		
		//here let's add another value which should be on index - 1 and value should be 2
		
		intList.add(1, 2);
		
		System.out.println("====================================================");
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + " : " + intList.get(i));
		}
		//What I would like to explain here as you see, the other values in the arrayList had to change the indexes.
		//This is not a problem in small arrays like this but when we have arrayLists with thousands of value...
		
		intList.remove(1);
		System.out.println("====================================================");
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + " : " + intList.get(i));
		}
		
		//Here we start thinking about LinkedList 
		//With using LinkedList, when we add or remove an item from the list, we don't need to update all indexes and memory adresses.
	}
}

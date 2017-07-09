package com.ugurcan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		
		LinkedList<String> placesToVisit = new LinkedList<String>();

/*		placesToVisit.add("Sydney");
		placesToVisit.add("Budapest");
		placesToVisit.add("Paris");
		placesToVisit.add("London");
		placesToVisit.add("Istanbul");
		placesToVisit.add("Tokio");
		placesToVisit.add("California");
		placesToVisit.add("Los Angeles");
		
		printList(placesToVisit);
		
		placesToVisit.add(1, "Ankara");
		
		printList(placesToVisit);
		
		placesToVisit.remove(0);
		
		printList(placesToVisit);
		*/
		
		addInOder(placesToVisit, "Sydney");
		addInOder(placesToVisit, "Budapest");
		addInOder(placesToVisit, "Paris");
		addInOder(placesToVisit, "London");
		addInOder(placesToVisit, "California");
		addInOder(placesToVisit, "Istanbul");
		addInOder(placesToVisit, "Los Angeles");
		
		printList(placesToVisit);
		
	}
	
	private static void printList(LinkedList<String> linkedList){
		
		Iterator<String> i = linkedList.iterator();
		
		while(i.hasNext()){
			System.out.println("Now visiting..." + i.next());
		}
		System.out.println("=========================");
		System.out.println("No more place to visit");
		System.out.println("=========================");
		
	}
	
	private static boolean addInOder(LinkedList<String> linkedList, String newCity){
		//listIterator is more flexible and special for these kind of cases.
		ListIterator<String> stringListIterator = linkedList.listIterator();
		
		while(stringListIterator.hasNext()){
			int comparison = stringListIterator.next().compareTo(newCity);
			
			if(comparison == 0 ){
				//equal, do not add
				System.out.println(newCity + " is already included in destinations");
				return false;
			}else if (comparison > 0 ){
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}else if(comparison < 0){
				//move on the next city
			}
			
			
		}
		
		stringListIterator.add(newCity);
		return true;
	}
}

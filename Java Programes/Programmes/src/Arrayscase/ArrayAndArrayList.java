package Arrayscase;

import java.util.ArrayList;

public class ArrayAndArrayList {

	public static void main(String[] args) {


		// creating a arraylist in java
		
		
			ArrayList<String> a  = new  ArrayList<>();
			
			
			a.add("apple");
			a.add("orange");
			a.add("grapes");
		
		
		
		System.out.println(a);
		System.out.println(" ");
		
		System.out.println(a.get(2));
		System.out.println(" ");
		
		
		
		System.out.println("..............// adding values to the array..................................");
		System.out.println(" ");
		
		
		a.add(1,"pineapple");
		
		
		a.add("guava");
		
		System.out.println(a);
		
		System.out.println(" ");
		
		System.out.println("...........// Accessing data from the array....................................");
		System.out.println(" ");
		
		System.out.println(	a.get(0));
		System.out.println(" ");
		
		System.out.println(	a.get(4));
		System.out.println(" ");
		
		System.out.println(".............// changing the arraylist elements..................");

		System.out.println(a);
		
		a.set(2, "apple2");
		
		a.set(3, "melon");
		
		System.out.println(a);
		
		System.out.println("..............// deleting the values from the arraylist.............");
		
		a.remove(4);
		a.remove(1);
		
		System.out.println(a);
		
	}

}

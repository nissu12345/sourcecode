package Arrayscase;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylistexe {

	public static void main(String[] args) {


		System.out.println(" iterate through an array list...");
		
ArrayList<String> a  = new  ArrayList<>();
		
		
		a.add("apple");
		a.add("orange");
		a.add("grapes");
		
		System.out.println(a);
		
		for(String it : a)
		{
			System.out.print(" " + it + ",");
		}
		System.out.println(" ");
		
		for(int i =0;i<a.size();i++)
		{
			System.out.print(" " + a.get(i) + ",");
		}
		
		
		
		System.out.println(".................//ArrayList To Array Conversion......");
		
		
		ArrayList<String> b =  new ArrayList<>();
		b.add("nissar");
		b.add("numan");
		b.add("naveen");
		b.add("raju");
		b.add("affu");
		System.out.println(b);
		 								// arraylist variable.toArray(array varaible name)
		
		String[] ar = new String[b.size()];
		
		
		
		b.toArray(ar);
		
		System.out.println("Array: ");
		
		for(String arr : ar)
		{
			System.out.print(" " + arr + ",");
		}
		
		System.out.println(" ");
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(" " + ar[i] + ",");
		}
		
		
		
		System.out.println("\n..................//Java Array to ArrayList Conversion..............");
		
		
		System.out.println(" ");
		
		String[] t =  {"nut","bolt","screw","pan","hammer"};
		
		System.out.println(Arrays.toString(t));
		
		// in the Arraylist definition step pass,Arrays.asList(array varaible name as argument)
		
		ArrayList<String> c = new ArrayList<>(Arrays.asList(t));
		
		System.out.println(c);
		
		
		System.out.println("\n.....................//ArrayList to String Conversion.....");
		
		ArrayList<String> z = new ArrayList<>();
		
		z.add("a");
		z.add("b");
		z.add("c");
		z.add("d");
		System.out.println(z);
		System.out.println("\n");
	
		// ArrayList varaible.toArray and pass it into an array.
		
	String str = z.toString();
	System.out.println(str);
		
		
		
	}

}



// array to arraylist : this is done after defining arraylist and passing the command as argument

// arraylist to string : arraylist varaible.toString an pass this to the array of string type

// Arraylist to array : arraylist varaible.toArray(array varaible name) which is predifined the previous step.

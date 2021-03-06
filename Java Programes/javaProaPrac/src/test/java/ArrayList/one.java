package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sun.tools.javac.code.Attribute.Array;

public class one {

	public static void main(String[] args) {

		System.out.println("Creating a AL of colors");

		ArrayList<String> al = new ArrayList<String>();
		al.add("purple");
		al.add("yellow");
		al.add("white");

		System.out.println(al);

		System.out.println("\n");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("\n");
		System.out.println("Enhnached for Loop.. ");

		for (String Al : al) {
			System.out.println(Al);
		}

		System.out.println("\n" + "  insert an Element at first position");

		al.add(0, "firstColorRed");
		al.add(4, "forthcolorBlue");
		System.out.println(al);

		System.out.println(" \n 4.retrive element from an index");

		String SecondIndexColor = al.get(2);
		System.out.println("SecondIndexColorz " + SecondIndexColor);

		System.out.println("\n 5.update specific array element by given element");

		System.out.println("updating 3rd index element");

		al.add(3, "updated3rdColorPale");
		System.out.println(al);

		/*
		 * for inserting an element into first i.e 0 index and for updating an element
		 * at any index use al.add(index,element) method.
		 */

		System.out.println(" \n 6.Remove the third element from the array");

		System.out.println(" ");
		System.out.println(al);
		System.out.println(" ");
		al.remove(3);
		System.out.println(al);

		System.out.println("\n 7.Search an element in ArrayList");

		for (int j = 0; j < al.size(); j++) {
			if (al.get(j).equalsIgnoreCase("Yellow")) {
				System.out.println("color found");
			} else {
				System.out.println("There is no such color");
			}

		}

		System.out.println("\n 8.Sort the Array");

		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

		System.out.println("\n 9.add one arrayList to another Arraylist");

		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("Pen");
		al2.add("Eraiser");
		al2.add("Nib");
		al2.add("Cap");
		System.out.println(al2 + "\n");

		al2.addAll(al);
		System.out.println(" ");
		System.out.println(al2);

		System.out.println("extra pblm..copy a arraylist into another arraylist ...");

		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("apple");
		al3.add("mango");
		al3.add("grape");
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("egg");
		al4.add("omlete");
		al4.add("boiled");

		System.out.println(al3);
		System.out.println(al4);

		Collections.copy(al3, al4);
System.out.println("..copy...");
		System.out.println(al3);
		System.out.println(al4);

		System.out.println("10.Write a Java program to shuffle elements in a array list");

		ArrayList<String> al5 = new ArrayList<String>();

		al5.add("mon");
		al5.add("tue");
		al5.add("Wed");
		al5.add("Thrus");
		al5.add("Fri");
		al5.add("Satur");

		System.out.println(al5);

		Collections.shuffle(al5);// not clear

		System.out.println(al5);

		// Learn the program to shuffle the elements by x value

		int[] an = { 1, 2, 3, 4, 5 };

		int sf = 2;

		for (int i = 0; i < sf; i++) {
			int j, last;
			last = an[an.length - 1];
			for (j = an.length - 1; j > 0; j--) {
				an[j] = an[j - 1];
			}

			an[0] = last;
		}

		System.out.println(Arrays.toString(an));

		System.out.println("11.Write a Java program to reverse elements in a array list");

		Collections.reverse(al5);
		System.out.println(al5);

		System.out.println("12. Write a Java program to extract a portion of a array list");

		List<String> sub = al5.subList(0, sf);
		System.out.println(sub);

		System.out.println("13. Write a Java program to compare two array lists.");
		System.out.println(al5.contains(al3));
		// to compare two strings use contains instead of equals
	
	System.out.println(" 14.Write a Java program of swap two elements in an array list.");	
	
	System.out.println(al5);
	
	/*
	String temp = al5.get(0);
	al5.set(0, al5.get(2));
	al5.set(2, temp); // this is not a correct way to swap the elements
	*/
	
	Collections.swap(al5, 0, 4);
	System.out.println(al5);
	
	System.out.println("15.Write a Java program to join two array lists.");
	
	ArrayList<String> alj = new ArrayList<String>();
	
	
	alj.addAll(al5);
	alj.addAll(al4);
	alj.addAll(al3);
	alj.addAll(al2);
	alj.addAll(al);
	
	System.out.println(alj);
	
	System.out.println("16. Write a Java program to clone an array list to another array list.");

	ArrayList<String> cloneal5 = new ArrayList<String>();
	
	cloneal5 = (ArrayList<String>) al5.clone();
	System.out.println(cloneal5);
	
	
	System.out.println("17.Write a Java program to empty an array list.");
	
	ArrayList<String> clr = new ArrayList<String>();
	
	clr.add("ab");
	clr.add("cd");
	clr.add("ef");
	clr.add("gh");
	
	System.out.println(clr);
	//clr.clear();
	clr.removeAll(clr);
	// both serves the same
	
	System.out.println(clr);
	
	System.out.println("18.Write a Java program to test an array list is empty or not.");
	
	System.out.println(clr.isEmpty());
	
	
	System.out.println("19.Write a Java program to trim the capacity of an array list the current list size");
	 
	System.out.println(al3);
	
	al3.trimToSize();
	
	System.out.println(al3);
	
	System.out.println("20.Write a Java program to increase the size of an array list");
	
	al5.ensureCapacity(15);
	System.out.println(al5);
	
	
	System.out.println("Write a Java program to replace the second element of a ArrayList with the specified element.");
	
System.out.println(al);

al.set(1, "SecondElementSet");
	
System.out.println(al);

System.out.println("Write a Java program to print all the elements of a ArrayList using the position of the elements.");
	

System.out.println(" ");
for(int y=0;y<al.size();y++)
{
	System.out.println(al.get(y));
}

	
	/*
	 * in sublist we will mention the element place , whereas in swap we will mention the index
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

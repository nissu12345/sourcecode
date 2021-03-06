package ArrayList;


import java.util.ArrayList;
import java.util.List;

public class Examples {

	public static void main(String[] args) {


		/*
		 * ways to declare the arrayList
		 */
	
	
	
	ArrayList<String> Al1  = new ArrayList<>();
	
	Al1.add("apple");
	Al1.add("banana");
	Al1.add("grape");
	Al1.add("lemon");
	Al1.add("banana");
	
	
	
	ArrayList<Integer> Al2  = new ArrayList<>(20);
	
	
	ArrayList<String> Al3  = new ArrayList<>(Al1);
	
	
	/*
	 * how to increase the current capacity of the ArrayList
	 */
	
	
	Al1.ensureCapacity(30);
	
	/*
	 * initial capacity of ArrayList is 10 and we have increased it to 30
	 * 
	 * memory gets increased automatically when ArrayList size exceeds it max limit.
	 * this method is used to increase the size manually
	 * 
	 */
	
	
	
	/*
	 * how to reduce the size of the ArrayList
	 */
	
	
	
	Al1.trimToSize();
	
	/*
	 * this will change the size to its default value.
	 * this is used by the developers to reduce the  Storage area of ArrayList.
	 */
	
	
	/*
	 * how to find the number of elements in a ArrayList
	 * 
	 */
int s =	Al1.size();

System.out.println(Al1);
System.out.println(" ");

System.out.println(s);
System.out.println(" ");
	
	/*
	 * how to find an given array is empty or not
	 */
	
System.out.println(Al1.isEmpty());
System.out.println(" ");
System.out.println(Al2.isEmpty());
System.out.println(" ");
System.out.println(Al3.isEmpty());
System.out.println(" ");
System.out.println(Al2.size());
System.out.println(" ");
/*
 * this method is returns boolean value,True if the arraylist is empty or
 *  else false if the arraylist is not empty.
 *  we can also check it by using .size() method,it returns 0 if the array is empty.
 *  
 */

	
	/*
	 * how to check whether the given element is present in the given arraylist or not
	 */
	
	
	boolean va = Al1.contains("apple");
	boolean v = Al1.contains("appi");
	System.out.println(va );
	System.out.println(" ");
	System.out.println(v  + "\n");
	
	
	
	/*
	 * How do you get the position of a particular element in an ArrayList?
	 */
	
	
	int position = Al1.indexOf("banana");
	System.out.println(position + "\n");
	
	int lpos =  Al1.lastIndexOf("banana");
	System.out.println(lpos);
	 System.out.println(" ");
	
	int pos = Al1.indexOf("bana");
	System.out.println(pos);
	System.out.println(" ");
	
	/*
	 * indexOf will return the index value of first occurrence of the specified element
	 * 
	 * LastIndexOf will return the index value of last occurrence of the specified element
	 * if the element is not found it will return -1
	 */
	
	
	/*
	 *  How do you convert an ArrayList to Array?
	 */
	
	
	ArrayList<String> al = new ArrayList<>();
	
	al.add("aa");
	
	al.add("bb");
	
	al.add("cc");
	
	al.add("dd");
	
	System.out.println(al);
	System.out.println(" ");
	
	
Object[] a = 	al.toArray();

for(Object ar : a)
{
System.out.println(ar);	
}
	
System.out.println(" ");
/*
 * How do you retrieve an element from a particular position of an ArrayList?
 */
	
	
	
	System.out.println(Al1.get(1) + "\n");
	System.out.println(al.get(1) + "\n");
	
	
	
	/*
	 * How do you replace a particular element in an ArrayList with the given element?
	 */
	
	
	al.set(1, "gg");
	System.out.println(al);
	System.out.println(" ");
	
	
	
	/*
	 *  How do you append an element at the end of an ArrayList
	 */
	
	
	al.add("nn");
	System.out.println(al);
	System.out.println(" ");
	
	/*
	 * .add method adds the element  at the end of the ArrayList
	 */
	
	
	
	/*
	 * How do you insert an element at a particular position of an ArrayList?
	 */
	
	
	al.add(4, "mm");
System.out.println(al);	
	System.out.println(" ");
	
	
	
	/*
	 *  How do you remove an element from a particular position of an ArrayList
	 */
	
	
	
	al.remove(2);
	
	System.out.println(al);
	System.out.println(" ");
	
	
	/*
	 *  How do you remove the given element from an ArrayList?
	 */
	
	
	al.remove("gg");
	
	System.out.println(al + "\n");
	
	/*
	 * this method will remove the first occurance of the specified element 
	 */
	
	
	
	/*
	 * How do you remove all elements of an ArrayList at a time?
	 */
	
	
	
	
	ArrayList<Integer> inte = new ArrayList<>();
	
	inte.add(10);
	inte.add(1, 20);
	inte.add(30);
	
	System.out.println(inte + "\n");
	
	inte.clear();
	
	System.out.println(inte + "\n");

	
	
	/*
	 * How do you retrieve a portion of an ArrayList?
	 */
	
	ArrayList<Integer> inn = new ArrayList<>();
	
inn.add(5);
inn.add(6);
inn.add(7);
inn.add(8);
inn.add(9);
System.out.println(inn + "\n");
List<Integer> subList =inn.subList(1, 4);
System.out.println(subList + "\n");
	
	
/*
 *  How do you join two ArrayLists?	
 */
	
	
	ArrayList<String> al1 = new ArrayList<>();
	al1.add("aa");
	al1.add("ab");
	al1.add("ac");
	al1.add("ad");
	al1.add("ae");
	
	
	
	
	ArrayList<String> al2 = new ArrayList<>();


	al2.add("ba");
	al2.add("bb");
	al2.add("bc");
	al2.add("bd");
	al2.add("be");
	
	
	ArrayList<String> al3 = new ArrayList<>();
	
	
	al3.add("ca");
	al3.add("cb");
	al3.add("cc");
	al3.add("cd");
	al3.add("ce");
	
	System.out.println(al1 + "\n");
	
	System.out.println(al2 + "\n");
	
	System.out.println(al3 + "\n");

al1.addAll(al2);

System.out.println(al1 + "\n");





/*
 * How do you insert more than one element at a particular position of an ArrayList?
 */




	al1.addAll(2, al3);
	System.out.println(al1 + "\n");

/*
 * same as add with specifing the index value.
 */




























	
	
	
	}

}

package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class E2E {

	public static void main(String[] args) {

		System.out.println("\n 1.Write a Java program to append the specified element to the end of a linked list.");

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Apple");
		ll.add("Mango");
		ll.add("Grapes");
		ll.add("Banana");

		System.out.println(ll);

		ll.add("Last element adding first time");

		System.out.println(ll);

		System.out.println("\n 2. Write a Java program to iterate through all elements in a linked list");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println(
				"\n 3. Write a Java program to iterate through all elements in a linked list starting at the specified position");

		Iterator it = ll.listIterator(1);

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("\n 4. Write a Java program to iterate a linked list in reverse order.");

		Iterator itdec = ll.descendingIterator();

		while (itdec.hasNext()) {
			System.out.println(itdec.next());
		}

		// descending iterator is used to get the reverse order of the linkedlist

		
		System.out.println("\n 5. Write a Java program to insert the specified element at the specified position in the linked list.");
		
		ll.add(4, "4th-papaya");
		System.out.println(ll);
		
		System.out.println("\n 6. Write a Java program to insert elements into the linked list at the first and last position.");
		
		ll.add("secod time last element adding");
		ll.addFirst("first time first element adding");
		System.out.println(ll);
		
	System.out.println("\n 7. Write a Java program to insert the specified element at the front of a linked list. ");	
		
	
	
	
	ll.addFirst("using add first -one");
		
	ll.offerFirst("using offer first -one");
		
		System.out.println(ll);
		
		
		System.out.println("\n 8. Write a Java program to insert the specified element at the end of a linked list.");
		
	
		
		LinkedList<String> ll1 = new LinkedList<String>();
		
		ll1.add("llb");
		ll1.add("ll is added at seond index,this is first index");
		ll1.add("mba");
		ll1.add("mca");
		System.out.println(ll1);
		ll1.addLast("adding last -last");
		ll1.offerLast("offering last -one");
		System.out.println(ll1);
		
	System.out.println("\n 9. Write a Java program to insert some elements at the specified position into a linked list.");	
		
	// actually it is get first and last element 	
		ll1.addAll(2, ll);
		System.out.println(ll1);
		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("one");
		ll2.add("two");
		ll2.add("Three");
		ll2.add("four");
		ll2.add("Five");
		ll2.add("one");
		
	System.out.println(	ll2.getFirst());
	System.out.println(	ll2.getLast());
	
	System.out.println("\n 10.1 Remove the first occurance and last occurance of a speccified element ");
		
	LinkedList<String> ll3 = new LinkedList<String>();
	ll3.add("one-1");
	ll3.add("two-2");
	ll3.add("Three-3");
	ll3.add("four-4");
	ll3.add("Five-5");
	ll3.add("one-1");
	ll3.add("four-4");
	
	System.out.println(ll3);
	ll3.removeFirstOccurrence("one-1");
	ll3.removeLastOccurrence("four-4");
	System.out.println(ll3);
	
		System.out.println("\n 11. Write a Java program to display the elements and their positions in a linked list.");
		
		for(int h=0;h<ll3.size();h++)

		{
			System.out.println("The Element at " + h + " index is: " + ll3.get(h));
		}
		
		
		System.out.println("\n 12. Write a Java program to remove a specified element from a linked list. ");
		
		System.out.println(ll3);
		ll3.remove(3);
		System.out.println(ll3);
		
		
		System.out.println("\n 13.Write a Java program to remove first and last element from a linked list. ");
		
		
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		System.out.println("\n Write a Java program to remove all the elements from a linked list.  ");
		LinkedList<String> ra = new LinkedList<String>();
		
		ra.add("aa");
		ra.add("bb");
		ra.add("cc");
		ra.add("dd");
		System.out.println(ra);
		ra.removeAll(ra);
	//	ra.clear();
		System.out.println(ra);
		
		System.out.println("\n 15.Write a Java program of swap two elements in a linked list. ");
		
		System.out.println(ll3);
	Collections.swap(ll3, 0, 3);
	System.out.println(ll3);
	
	System.out.println("\n 16.Write a Java program to shuffle the elements in a linked list.");
		
		System.out.println(ll2);
		Collections.shuffle(ll2);
		System.out.println(ll2);
		
		System.out.println("\n 17. Write a Java program to join two linked lists. ");


		LinkedList<String> a = new LinkedList<String>();
		a.add("null");
		a.add("top");
		a.add("marginal");
		LinkedList<String> b = new LinkedList<String>();
		
		b.add("not okay");
		b.add("okay");
		b.add("ok ok");
		
		System.out.println(a);
		System.out.println(b);
		a.addAll(b);
		
		System.out.println(a);
		System.out.println(b);
		
	System.out.println("\n 18. Write a Java program to clone an linked list to another linked list.");	
		
	LinkedList<String> clonb = new LinkedList<String>();
	
clonb =	(LinkedList<String>) b.clone();
		
		System.out.println(clonb);
		
		
		System.out.println("\n 19. Write a Java program to remove and return the first element of a linked list.");
		
		System.out.println(ll2);
	
		System.out.println(ll2.remove()+ " :Using Remove method");

		System.out.println(ll2.pop() + " :Using POP method");
		System.out.println(ll2);
	
		System.out.println("\n Write a Java program to retrieve but does not remove, the first element of a linked list.");
		System.out.println(ll3);
		System.out.println(ll3.peekFirst());
		System.out.println(ll3.getFirst());
		System.out.println(ll3);
		
		
		System.out.println("\n 21. Write a Java program to retrieve but does not remove, the last element of a linked list");
		
		System.out.println(ll1);
		System.out.println(ll1.peekLast());
		System.out.println(ll1.getLast());
		System.out.println(ll1);
		
		System.out.println("22. Write a Java program to check if a particular element exists in a linked list.");
		
		
		System.out.println(ll);
		
		System.out.println(ll.containsAll(ll2));
		System.out.println(ll.containsAll(ll3));
		System.out.println(ll.contains("Banana"));
		
		System.out.println("\n 23. Write a Java program to convert a linked list to array list.");
		
		LinkedList<String> ll6 = new LinkedList<String>();
		
		ll6.add("closed");
		ll6.add("open");
		ll6.add("shutdown");
		System.out.println(ll6);
		
	Iterator its =	ll6.descendingIterator();
	
	while(its.hasNext())
	{
		System.out.println(its.next());
	}
		
		ArrayList<String> al = new ArrayList<String>(ll6);
		System.out.println(al);
		
	/*
	 * 	Iterator ite =	al.descendingIterator();
	 * Descending iterator cant be used with the ArrayList
	 */
		
		System.out.println("\n 24. Write a Java program to compare two linked lists.");
		
		System.out.println(ll6.containsAll(ll));
		
		System.out.println("\n Write a Java program to test an linked list is empty or not. ");
		
		System.out.println(ll3.isEmpty());
		
		System.out.println("\n Write a Java program to replace an element in a linked list.");
		
		System.out.println(ll2);
		
		ll2.set(0, "Eight");
		System.out.println(ll2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

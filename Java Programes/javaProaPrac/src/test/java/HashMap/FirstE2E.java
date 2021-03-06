package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FirstE2E {
	
	public static void main(String[] args)
	{
		
		System.out.println("\n 1. Write a Java program to associate the specified value with the specified key in a HashMap.");
		
		
		HashMap<String,Integer> hsh  = new HashMap<String,Integer>();
		
		
		hsh.put("Pen Cost is Ruppe's  : ", 10);
		hsh.put("Pencil cost is Ruppe's  : ", 5);
		hsh.put("Eriser Cost is Ruppe's : ", 4);
		
		System.out.println(hsh);
		
		System.out.println("\n 2. Write a Java program to count the number of key-value (size) mappings in a map. ");
		
		System.out.println(hsh);
		
		System.out.println(hsh.size());
		
		System.out.println("\n 3. Write a Java program to copy all of the mappings from the specified map to another map.");
		HashMap<String,Integer> hsh1 = new HashMap<String,Integer>();
		
		hsh1.put("Banana",600);
		hsh1.put("apple", 300);
		hsh1.put("Orange", 100);
		System.out.println(hsh);
		System.out.println(hsh1);
		
		hsh1.putAll(hsh);
		System.out.println(hsh1);
		
		System.out.println("\n 4. Write a Java program to remove all of the mappings from a map.");
		
		HashMap<Integer,String> hsh2 = new HashMap<Integer,String>();
		
		hsh2.put(1, "Nissar");
		hsh2.put(2, "Ahmed");
		hsh2.put(3,"Syed");
		
		System.out.println(hsh2);
		hsh2.clear();
		System.out.println(hsh2);
		
		System.out.println("\n 5.Write a Java program to check whether a map contains key-value mappings (empty) or not");
		
		
		System.out.println(hsh);
		System.out.println(hsh.isEmpty() );
		
		
		
		System.out.println("\n 6. Write a Java program to get a shallow copy of a HashMap instance.");
		
		
		
		HashMap<String,Integer> hsh3 =  new HashMap<String,Integer>();
		
		System.out.println(hsh1);
		hsh3 =  (HashMap<String,Integer>) hsh1.clone();
		System.out.println(hsh3);
		
		System.out.println("\n 7. Write a Java program to test if a map contains a mapping for the specified key.");
		
		System.out.println(hsh);
		System.out.println(hsh1);
		System.out.println(hsh.containsKey("Pen Cost is Ruppe's  : "));
		System.out.println(hsh1.containsKey("Banana"));
		
		
		System.out.println("\n 8. Write a Java program to test if a map contains a mapping for the specified value.");
		
		System.out.println(hsh1);
		System.out.println("Yes " + hsh1.containsValue(100));
		
		
		
		System.out.println("\n 9. Write a Java program to create a set view of the mappings contained in a map.");
		
		System.out.println(hsh1);
		
		/*
		 * Set<Map.Entry<String, Integer>> set = hsh1.entrySet();
	      System.out.println(set);
		 */
	System.out.println(hsh1.entrySet());
		
		System.out.println("\n 10. Write a Java program to get the value of a specified key in a map. ");
		
		System.out.println(hsh3);
		int value = hsh3.get("apple");
		System.out.println(value);
		
		System.out.println("\n 11. Write a Java program to get a set view of the keys contained in this map");
		
		System.out.println(hsh);
		
		Set<String> set =hsh.keySet();
		System.out.println(set);
		
		System.out.println("\n 12. Write a Java program to get a collection view of the values contained in this map");
		
		System.out.println(hsh1);
	Collection<Integer> cval =	hsh1.values();
	System.out.println(cval);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

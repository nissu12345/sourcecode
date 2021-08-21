package ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapHash {

	public static void main(String[] args) {
HashMap<String, Double> maps = new HashMap<>();

maps.put("Ashwin", 92.92);
maps.put("Asish" ,93.93);
maps.put("bala" ,95.95);
maps.put("null" ,100.00);

maps.put("vas" , null);
maps.put("sav" , null);

System.out.println("size of map: ");

System.out.println("The size of the map is :" + maps.size());
System.out.println("\n");

System.out.println("print the map Elements: ");

Set set =  maps.keySet();

Iterator it =  set.iterator();

while(it.hasNext())
{
	Object Key = it.next();
	System.out.println(Key + " : " + maps.get(Key));
}

System.out.println("\n");


System.out.println("Does this map has bala as key? "+maps.containsKey("bala"));

System.out.println("Does this map has 92.92 as value? "+maps.containsValue(92.92));
 
System.out.println("\n");
 
System.out.println("Removing an element from the map ");
 
System.out.println("Value removed from the map : "+maps.remove("Asish"));
  








	}

}

package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorit {

	public static void main(String[] args) {


ArrayList<String> a = new ArrayList<String>();

a.add("nissar");
a.add("hannu");
a.add("imran");

a.add("riyaz");
	
Iterator<String> it  = a.iterator();

while(it.hasNext())
{
	String s = it.next();
	System.out.println(s);
}


}
}

package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class two {

	public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("apple");
	al.add("mango");
	al.add("grape");
	ArrayList<String> al2 = new ArrayList<String>();
	al2.add("egg");
	al2.add("omlete");
	al2.add("boiled");
	
	System.out.println(al);
	System.out.println(al2);
	
	Collections.copy(al, al2);
	
	System.out.println(al);
	System.out.println(al2);

	}

}

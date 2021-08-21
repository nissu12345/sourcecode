package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAL {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> al =  new ArrayList<>();
		
		al.add("at");
		al.add("an");
		al.add("as");
		al.add("on");
		
		System.out.println(al);
		
	
		Collections.reverse(al);
		
		System.out.println(al);
		
	}

}

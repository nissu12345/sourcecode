package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LLtoAL {

	public static void main(String[] args) {

LinkedList<String> ll = new LinkedList<>();

ll.add("on");
ll.add("an");
ll.add("at");
ll.add("in");
ll.add("as");
System.out.println(ll);

ArrayList<String> al =  new ArrayList<>(ll);

System.out.println(al.get(4));

	}

}

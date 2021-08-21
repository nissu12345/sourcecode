
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.ListIterator;


public class RoughWork {

public static void main(String[] args)
{

ArrayList<String> a =  new ArrayList<>();
a.add("ab");
a.add("cd");
a.add("ef");
a.add("gh");
a.add("ij");
a.add("kl");

ListIterator<String> it = a.listIterator();



while(it.hasNext())
{
	System.out.print(it.next());
	
}

System.out.println("\n");
while(it.hasPrevious())
{
	System.out.print(  " [" + it.previousIndex() + "]" + it.previous());
	
	
}


}


		

}


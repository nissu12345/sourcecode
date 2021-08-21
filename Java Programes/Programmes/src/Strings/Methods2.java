package Strings;

import java.awt.List;
import java.util.Arrays;
import java.util.Locale;

public class Methods2 {

	public static void main(String[] args) {
		
		

System.out.println("Sub-String");


String s1= "NissarAhmed";


String  sub = s1.substring(6);
System.out.println(sub);


System.out.println("\n");
System.out.println("Sub-String with end index");


String s2 = "This is a newspaper of daily wages";

String sub2 = s2.substring(5,21);

System.out.println(sub2);


System.out.println("\n");
System.out.println("concat");


String c1 = "Nissar";

c1 = c1.concat("Ahmed").concat("Syed");

System.out.println(c1);


System.out.println("\n");
System.out.println("concat");

String d1 = "Nissar";

String d2 = "Syed";

 d2 = d2.concat(d1);

System.out.println(d2);

System.out.println("\n");
System.out.println("concat");

String e1 = "Hi";

e1 = e1.concat(" Nissar");
e1 = e1.concat(" Ahmed");

System.out.println(e1);


System.out.println("\n");
System.out.println("concat");

String f1 = " Welcome";

String f2 = "Hi".concat(f1);
System.out.println(f2);


System.out.println("\n");
System.out.println("String Replace char");

String  r = "pog pance";

String r1 = r.replace('p', 'd');

System.out.println(r1);


System.out.println("\n");
System.out.println("String Replace first string");

String rpf= "The day sun set's early is the day of winter";

String rpf1 = rpf.replaceFirst("day","Evening");

System.out.println(rpf1);

System.out.println("\n");
System.out.println("String Replace all string");

String rpa = "The dog in the Garden is the dog of don";

String rpa1 = rpa.replaceAll("dog","cat");

System.out.println(rpa1);


System.out.println("\n");
System.out.println("boolean contains");

String o1 = "This is a blue pen";

boolean v = o1.contains("a");

boolean v2 = o1.contains("A");

System.out.println(v);

System.out.println(v2);



System.out.println("\n");
System.out.println("String to upper case locale");

String u1 = "nissar";

String u2 = u1.toUpperCase(Locale.ITALY);

System.out.println(u2);


String u3 = u1.toUpperCase();

System.out.println(u3);


String lu2 = "ahmed";

String lu22 = lu2.toUpperCase();

System.out.println(lu22);



System.out.println("\n");
System.out.println("lowercase using locale");

String lc = "NISSAR";

String lc1 = lc.toLowerCase(Locale.GERMAN);


System.out.println(lc1);

String lc2 = lc.toLowerCase();

System.out.println(lc2);


System.out.println("\n");
System.out.println("intern");

String in = "nissar";

String in1 = "ahmed";

String in2 = new  String("ahmed").intern();

String in22 = new  String("ahmed");

String in3 = "nissar";

String in4 = "ahmed".intern();



System.out.println("in==in1  " + (in==in1));

System.out.println("in==in3  " + (in==in3));

System.out.println("in1==in2  " + (in==in2));

System.out.println("in1==in22  " + (in==in22));

System.out.println("in2==in4  " + (in2==in4));

System.out.println("in==in2  " + (in==in2));

System.out.println("in==in4  " + (in==in4));


System.out.println("\n");
System.out.println("is empty");

String em1 = "";

String em2 = "nissar";


boolean em11 = em1.isEmpty();

boolean em22 = em2.isEmpty();

System.out.println(em11);

System.out.println(em22);


System.out.println("Checking null case using the isempty method");


String isem = null;

String isnem = "ahmed";

if(isem==null || isem.isEmpty())
{
System.out.println("isem is null or empty");		
}

else 
{
	System.out.println(isem);
}

if(isnem==null || isnem.isEmpty())
{
System.out.println("isnem is null or empty");		
}

else 
{
	System.out.println(isnem);
}



System.out.println("\n");
System.out.println("join");

String join = String.join("/", "17","08","1995");

String j = String.join(" ", "This","is","a","pen");

System.out.println(join);
System.out.println(j);

//List list<String> = Arrays.asList("Steve","jobs","pen");
//
//String Arr = String.join("*", l);
//
//System.out.println(Arr);



System.out.println("\n");
System.out.println("split");

String spt = "17/08/1995/1994/48/10";

System.out.println("using the regex method without limit");


String[] j1 = spt.split("/");

for(String j11 : j1)
{
	System.out.println(j11);
}



System.out.println("using the regex method with limit 0");


String[] j2 = spt.split("/", 0);

for(String j22 : j2)
{
	System.out.println(j22);
}


System.out.println("using the regex method with limit -ve ");
String[] neg = spt.split("/", -5);

for(String neg1 : neg)
{
	System.out.println(neg1);
}



System.out.println("using the regex method with limit specified ");



String[] spec = spt.split("/", 2);


for(String spec1 : spec)
{
	System.out.println(spec1);
}

String[] spec1 = spt.split("/", 4);



for(String spec11 : spec1)
{
	System.out.println(spec11);
}



String va = " ,ab:gh,bc;pq#kk$bb";

String[] va1 = va.split("[,:;#$]");

for(String va11 : va1) 
{
	System.out.print(va11);
}
	
		
System.out.println("spliting the regular expresion");

String m = "helloxyzhixyxbye";

String[] m1 = m.split("xyz", 3);

String[] m2 = m.split("xyz", 2);


for(String m11 :m1)
{
	System.out.println(m11);
}

for(String m22 :m2)
{
	System.out.print(m22);
}



String space = "My name is Syed";

String[] space1 =space.split(" ");

for(String space11 : space1)
{
	System.out.println(space11);
}



System.out.println("\n");
System.out.println("trim");

String trm = "  Hi this  is me  ";//removes leading and trailing spaces only remember
String trm1 = trm.trim();

	System.out.println(trm1);
	

	System.out.println("\n");
	System.out.println("length of string");




String l = "this is a pen";

int d = l.length();

System.out.println(d);



System.out.println("length of string excluding white spaces"); 


int rlen = l.replace(" ", " ").length();//not worked


System.out.println(rlen);






System.out.println("\n");
System.out.println("tocharArray");


String ca = "Welcome to yellandu";

char[] ch =ca.toCharArray();

for(char ch1 : ch )
{
	System.out.print(ch1);
}


System.out.println("\n");

System.out.println("Copyvalueof");


char[] array = {'a','b','c','d','e','z','x','y','u','m','n','q'};


String copy1 = "apple";

String copy2 = "mango";


 copy1 = copy1.copyValueOf(array);
copy2 = copy2.copyValueOf(array, 5, 5);


System.out.println(copy1);
System.out.println(copy2);






String a = "nissar";
String b = "nissar";
String c = "ahmed";



String g = new String("ahmed");

String e = new String("nissar").intern(); 

String f = new String("ahmed").intern();
String i = new String("nissar"); 

System.out.println("a==b" + (a==b)); //true

System.out.println("a==c" + (a==c)); //f

System.out.println("a==d" + (a==b)); //f

System.out.println("a==e" + (a==e)); //t

System.out.println("a==f" + (a==f)); //f

System.out.println("c==f" + (c==f));//t

System.out.println("a==g" + (a==g)); //f





















































































	}
	
	

}

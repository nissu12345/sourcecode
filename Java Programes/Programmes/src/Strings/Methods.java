package Strings;

public class Methods {

	public static void main(String[] args) {

String s1 = "GOOD MORNING";
String s2 = "Hi Good";
int v = s1.compareToIgnoreCase(s2);
System.out.println(v);


String q1 = "Hello";

System.out.println(q1.startsWith("He"));


String q2 = "hi world";

System.out.println(q2.startsWith("w",3));



String r1 = "iam nissar";

boolean va = r1.endsWith("r");
System.out.println(va);


String g1 = "nissar ahmed";

int hc = g1.hashCode();

System.out.println(hc);



String n = "Nissar   ";

System.out.println(n.trim());




String h1 = "Nissar";

int vd = h1.indexOf('N');

System.out.println(vd);




String h2 = "Iam nissar ahmed a boy";


int ve = h2.indexOf('a',11);

System.out.println(ve);


String h3 = "Apple Banana";

char c4 = 'A';

char c5 = 'B';

int val = h3.indexOf(c4);

int val2 = h3.indexOf(c5);

System.out.println(val);
System.out.println(val2);

System.out.println("\n");


String li = "nissar";

int y = li.lastIndexOf('s');


System.out.println(y);


System.out.println("\n");


String y1 = "this a new book for me";

int e = y1.lastIndexOf('e', 9);

System.out.println(e);


System.out.println("\n");

String o = "This is a book for students for";

int o1 = o.indexOf("book");

System.out.println(o1);




String o3 = "is";

String o4 = "for";


System.out.println(o3.indexOf('i'));


int sub = o.indexOf("for",10);
System.out.println(sub);




System.out.println("lastindex of string");


String lst = "this is a pencl of this type";


int value = lst.lastIndexOf("this");

System.out.println(value);

String lst1 = "pen of a boy is a news boy pen";

int  value1 = lst1.lastIndexOf("boy", 15);

System.out.println(value1);









	}

}

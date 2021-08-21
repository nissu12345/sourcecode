package Strings;

public class Programs {

	public static void main(String[] args) {


		String s1  = "nissar";
		String s2 = "ahmed";
		
		Integer h1 = s1.hashCode();
		Integer h2 = s2.hashCode();
	    System.out.println(h1.equals(h2));	
	    
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1==h2);
		
		System.out.println("int");
		int a = 5;
		
		int b =10;
		
		int c =5;
		
	//	a.equals(c); throwing error
		
		System.out.println(a==b);
		
		System.out.println(a==c);
		
		System.out.println("integer mine");
		
		 Integer aa = 5;
	        Integer bb = 6;
	        Integer cc = 5;

	        System.out.print(aa.equals(bb) + "\n");

	        System.out.print(aa.equals(cc));
		
		
		
		
	
		//System.out.println();

	}

}

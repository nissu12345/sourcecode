package TypePrograms;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println(" enter the value to check is it a even...");
	    int value =	sc.nextInt();
	    
	    if(value%2==0)
	    {
	    	System.out.println("its even..");
	    }
	    else
	    {
	    	System.out.println(" its not even..");
	    }
	
	}

}

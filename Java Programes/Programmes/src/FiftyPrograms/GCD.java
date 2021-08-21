package FiftyPrograms;

public class GCD {

	public static void main(String[] args) {
		
		int n1=50,n2=60,gcd=1,i;
		
		for(i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd =i;
	    	}
		
		
	   }  
		System.out.printf("The gcd of the two numbers %d and %d is: %d",n1,n2,gcd);
}
}
package FiftyPrograms;

public class HighestDivisors {

	public static void main(String[] args) {


		
		int x=156,y=225,i,j,gcd1=1,gcd2=1,gcd;
		
		for(i=1;i<x;i++)
		{
			if(x%i==0)
			{
				gcd1=i;
		}
		}
		
		for(j=1;j<y;j++)
		{
			if(y%j==0)
			{
				gcd2 =j;
			}
		}
		
		System.out.println("The Highest Divisors of the two number's " +x+ " and " +y+ " is :"
				+ " " + gcd1 + " , " + gcd2 );
	}

}

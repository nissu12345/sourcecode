package FiftyPrograms;

public class FacttorialOfNumber {

	public static void main(String[] args) {


int n,i,fact=1;

for(n=1;n<15;n++)
{
	fact = 1;
	for(i=1;i<=n;i++)
	{
		fact = fact * i;
	}
	
	System.out.println("The factotial of the number " + n + "is " + fact );
}


		
	}


}
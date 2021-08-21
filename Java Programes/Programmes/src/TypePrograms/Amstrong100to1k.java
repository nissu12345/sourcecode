package TypePrograms;

public class Amstrong100to1k {

	public static void main(String[] args) {

int n,r=0,sum=0,temp;
for(temp=100;temp<1000;temp++)
{
	sum = 0;
	n=temp;
	
	while(n>0)
	{
		r = n%10;
		n= n /10;
		sum = sum + (r*r*r);
	}
	
	
	if(sum==temp)
	{
	System.out.println( sum + " its a amstrong number");
	}


}




	}

}

package TypePrograms;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int n = 153,r =0,sum =0,temp =0;
		temp=n;
		while(temp>0)
		{
			r = temp %10;
			temp =temp /10;
			sum = (r * r * r ) + sum;
		}
if(sum==n)
{
	System.out.println("amstrong...");
}
else
{
	System.out.println("non-amstrong..");
}
	}

}

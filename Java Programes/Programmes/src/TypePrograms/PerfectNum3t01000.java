package TypePrograms;

public class PerfectNum3t01000 {

	public static void main(String[] args) {

		
		int i,n,d,sum=0;
		
		for(n=3;n<1000;n++)
		{
			sum=0;
			
			for(i=1;i<n;i++)
			{
				if(n%i==0)
				{
					d =i;
					sum = d +sum;
				}
			}
			
			if(sum==n)
			{
				System.out.println("The perfect number is:  " + n);
			}
		}

	}

}

package TypePrograms;

public class PrimeNumbers100to1k {

	public static void main(String[] args) {

int n,temp,m;

for(temp = 1;temp<50;temp++)
{
	boolean flag = true;
	n=temp;
	m=(int) Math.sqrt(n);
	
	
	for(int i=2;i<=m;i++)
	{
		if(n%i==0)
		{
			flag=false;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println(n + " is a prime number..");
	}
	
	
}



	}

}

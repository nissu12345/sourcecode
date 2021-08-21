package TypePrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the number to be checked of prime condition...");
		
		int n = sc.nextInt();
		int m =n/2;
		
		boolean flag = true;
		
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				flag = false;
				break;
			}
		}
		
if(flag==true)
{
	System.out.println("prime");
}
else
{
	System.out.println("non-prime");
}
	}

}

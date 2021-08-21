package TypePrograms;

import java.util.Scanner;

public class perfectNum {

	public static void main(String[] args) {


		int n,i,m,sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number to check if its a perfect number: ");
		
		n = sc.nextInt();
		
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				m =i;
				sum = sum + m;
			}
		}
		
		
		if(sum==n)
		{
			System.out.println("Perfect number is:   " + n);
		}
		
	}

}

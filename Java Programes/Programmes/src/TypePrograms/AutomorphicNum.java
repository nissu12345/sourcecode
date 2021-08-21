package TypePrograms;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		
		
		
		int k,n,p=0,d=10;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number to check is it a Automorphic..");
		
		n = sc.nextInt();
		
		k= n*n;
	
		
		while(p<n)
		{
			p =k % d;
			
			d=  d * 10;
		}
		
		if (n==p)
		{
			System.out.println("Its a automorphic number..");
		}
		
		else
		{
			System.out.println(" its not a automorphic number...");
		}

	}

}

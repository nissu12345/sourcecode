package InterviewPreparation;

import java.util.Scanner;

public class RotateElementsOfArray {

	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5};
		
		for(int ar : a)
		{
			System.out.print(ar);
		}
		System.out.println("");
		System.out.println("Enter no of times the array to be rotated");
		
		Scanner sc = new Scanner(System.in);
		
		int nR = sc.nextInt();
		
		for(int i=0;i<nR;i++)
		{
			int j,last;
			last = a[a.length-1];
			
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			
			a[0]=last;
		}
		
		
		System.out.println("");
		
		for(int ar : a)
		{
			System.out.print(ar);
		}
		
	}
}

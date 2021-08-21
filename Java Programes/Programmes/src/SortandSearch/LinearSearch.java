package SortandSearch;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

int j,i,num;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter the number of the elements of the array:\n");
		
		
		num = s.nextInt();
		
		int[] a = new int[num];
		
		
		System.out.println("Enter the " + num + " values of the array:\n");
		
		
		for( i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Enter the element to search:\n ");
		
		int rnum = s.nextInt();
		
		
		for( j=0;j<a.length;j++)
		{
			if(a[j]==rnum)
			{
				System.out.println("The required number " + rnum + " is found at " + j);
				break;
			}
		}
		
		if(j==num)
		{
			System.out.println("The required number " + rnum + " doesn't exist in the array.");
		}
		

	}

}

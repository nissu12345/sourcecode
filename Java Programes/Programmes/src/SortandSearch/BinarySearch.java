package SortandSearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
int j,i,num,first,last,middle;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter the number of the elements of the array: ");
		
		
		num = s.nextInt();
		
		int[] a = new int[num];
		
		
		System.out.println("Enter the " + num + " values of the array: ");
		
		
		for( i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Enter the element to search: "  );
		
		int rnum = s.nextInt();
		
		
		first = 0;
		last = num-1;
		middle = (first+last)/2;
		
		while(first<=last)
		{
			
		if(a[middle]<rnum)
		{
			first = middle + 1;
		}
		
		else if(a[middle]==rnum)
		{
			System.out.println("The Required Element " + rnum + " is found at " + middle + ".");
			break;
		}
		
		else
		{
			last = middle -1;
		}
			
		middle= (first+last)/2;		
		}
		
		if(first > last)
			
		{
			System.out.println("The Required Element " + rnum + " does'nt exist in the array. ");
		}
		

	}

}

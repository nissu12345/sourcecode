package Arrayscase;

import java.util.Arrays;

public class PrintingArray {

	public static void main(String[] args) {
		
		
	//	using for loop

int[] a = {1,2,3,4,5,6,7,8,9};

for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]);
	System.out.print(" ");
}
		
System.out.println("  ");
		// using enhanced for loop

int [] b = {8,9,7,6,4,5,1,3,2};

for(int items : b)
{
	System.out.print(items);
	System.out.print(" ");
}
	
System.out.println("  ");
	// using Arrays.toString method

int[] c = {10,100,1000,10000}; 

System.out.print(Arrays.toString(c));
System.out.println("  ");

// printing 2d arrays

int[][] t = { {1,2,3,},{4,5,6},{7,8,9}};

System.out.println(Arrays.deepToString(t));

System.out.println(" " );

// 2d using for loop

int[][] T = { {1,2,},{4,5},{7,8}};

for(int i=0;i<T.length;i++)
{
	for(int j=0;j<T[i].length;j++)
	{
		System.out.print(T[i][j]);
	}
	
}



	}

}

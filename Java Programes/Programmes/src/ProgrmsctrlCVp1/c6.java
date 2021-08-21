package ProgrmsctrlCVp1;

import java.util.Arrays;
import java.util.Scanner;

public class c6 {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to test if the first and the last element of an array of integers are same. 
		 * The length of the array must be greater than or equal to 2.
		 */

int[] same= {5,6,7,8,9,4,6,2,5};

System.out.println(same.length >= 2 && same[0]==same[same.length-1]);
		
	/*
	 * Write a Java program to test if the first or the last elements of two arrays of integers are same.
	 * The length of the two arrays must be greater than or equal to 2.
	 */
		
		
		
		
		int[] same1 = {5,4,8,7,9,6,5};
		int[] same2 = {4,5,8,9,6,3,4};
		
		
		if(same1.length >=2 && same2.length >=2)
		{
			System.out.println(same1[0]==same2[0] && same1[same1.length-1]==same2[same2.length-1]);
		}
		
		else
		{
			System.out.println("Array length is less than 2");
		}
		
		
		
		/*
		 * Write a Java program to create a new array of length 2 from two arrays of integers
		 *  with three elements and the new array will contain the first and last elements from the two arrays.
		 */
		
		
		int[] array1 = {50, -20, 0};
		int[] array2 = {5, -50, 10};
		
		System.out.println("Array1 is: " +Arrays.toString(array1));
		System.out.println("Array2 is: " + Arrays.toString(array2));
		
		int[] new_Array =  {array1[0],array2[2]};
		
		System.out.println("new_Array is: " + Arrays.toString(new_Array));
		
	//Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.	
		
		int[] array_nums = {5, 7};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		if(array_nums[0] == 4 || array_nums[0] == 7)
			System.out.println("True");
		else
	    System.out.println(array_nums[1] == 4 || array_nums[1] == 7);
		
	// Write a Java program to rotate an array (length 3) of integers in left direction.
		
		 int[] array_nums1 = {20, 30, 40};
			System.out.println("Original Array: "+Arrays.toString(array_nums1)); 
			int[] new_array_nums = {array_nums1[1], array_nums1[2], array_nums1[0]};
			System.out.println("Rotated Array: "+Arrays.toString(new_array_nums)); 	
			
//Write a Java program to get the larger value between first and last element of an array (length 3) of integers.
		
			int[] array_nums11 = {20, 30, 40};
			System.out.println("Original Array: "+Arrays.toString(array_nums11)); 
			int max_val = array_nums11[0];
			if(array_nums11[2] >max_val)
				max_val = array_nums11[2];
			System.out.println("Larger value between first and last element: "+max_val); 
		
	// Write a Java program to swap the first and last elements of an array (length must be at least 1) and create a new array.
			
			 int[] array_nums4 = {20, 30, 40};
				System.out.println("Original Array: "+Arrays.toString(array_nums)); 
				int x = array_nums4[0];
				array_nums4[0] = array_nums4[array_nums4.length-1];
				array_nums4[array_nums4.length-1] = x;
				System.out.println("New array after swaping the first and last elements: "+Arrays.toString(array_nums));
				
	//Write a Java program to find the largest element between first, last, and middle values from an array of integers (even length).	
		
				 int[] array_nums2 = {20, 30, 40, 50, 67};
					System.out.println("Original Array: "+Arrays.toString(array_nums)); 
					int max_val1 = array_nums2[0];
					if(max_val1 <= array_nums2[array_nums2.length-1])
						max_val1 = array_nums2[array_nums2.length-1];
					if(max_val1 <= array_nums2[array_nums2.length/2])
						max_val1 = array_nums2[array_nums2.length/2];
					System.out.println("Largest element between first, last, and middle values: "+max_val1);
		
		//Write a Java program to multiply corresponding elements of two arrays of integers.
					
					String result = "";
					   int[] left_array = {1, 3, -5, 4};
					   int[] right_array = {1, 4, -5, -2};
					   System.out.println("\nArray1: "+Arrays.toString(left_array));  
					   System.out.println("\nArray2: "+Arrays.toString(right_array)); 
				       for (int i = 0; i < left_array.length; i++) {
								int num1 = left_array[i];
								int num2 = right_array[i];
								result += Integer.toString(num1 * num2) + " "; 
							}
						System.out.println("\nResult: "+result);     
						
		// 
						//Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
						
						int ctr = 0;
						Scanner in = new Scanner(System.in);
						int n = in.nextInt();
						while (n != 1) {
						    System.out.println(n);
							if (n % 2 == 0) {
								n = n / 2;
								ctr += 1;
							}
							else {
								n = (3 * n + 1) / 2;
								ctr += 1;
							}
						}
						System.out.println(ctr);
						in.close();
					}
		// Write a Java program to get the current system environment and system properties.
	
//	System.out.println("\nCurrent system environment:");
//     System.out.println(System.getenv());	 
//System.out.println("\n\nCurrent system properties:");
//System.out.println(System.getProperties());	
//		
		
	/*
	 * 	Write a Java program to check whether a security manager has already been established for the current application or not.
	 */
	
//	System.out.println("System security interface:");
//    System.out.println(System.getSecurityManager());
//		
		
	/*
	 * Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME.
	*/	
		
//	System.out.println("\nEnvironment variable PATH: ");
//    System.out.println(System.getenv("PATH"));
//
//    // gets the value of the specified environment variable "TEMP"
//    System.out.println("\nEnvironment variable TEMP: ");
//    System.out.println(System.getenv("TEMP"));
//
//    // gets the value of the specified environment variable "USERNAME"
//    System.out.println("\nEnvironment variable USERNAME: ");
//    System.out.println(System.getenv("USERNAME"));
//		
//		

	/*
	 * Write a Java program to measure how long some code takes to execute in nanoseconds.
	 */
		
//	long startTime = System.nanoTime(); 
//	// Sample program
//	// Display the first 10 natural numbers.
//	int i;
//	System.out.println ("The first 10 natural numbers are:\n");
//	for (i=1;i<=10;i++)
//	{      
//		System.out.println (i);
//	}
//		long estimatedTime = System.nanoTime() - startTime;
//	System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: "+estimatedTime);
//		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



package ProgrmsctrlCVp1;

import java.util.Arrays;

public class c7 {

	public static void main(String[] args) {

		//  Write a Java program to count the number of even and odd elements in a given array of integers.

		int[] nums = {5, 7, 2, 4, 9};
		int ctr_even = 0, ctr_odd = 0;
		System.out.println("Original Array: "+ Arrays.toString(nums)); 
		    
	    for(int i = 0; i < nums.length; i++) {
	        if(nums[i] % 2 == 0)
			{         
	          ctr_even++;
			}
			else
			   ctr_odd++;	
	    }                 
	    System.out.printf("\nNumber of even elements in the array: %d",ctr_even);
		System.out.printf("\nNumber of odd elements in the array: %d",ctr_odd);
		System.out.printf("\n");
		
		
//		Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.
		
		
		int[] nums1 = {10, 10, 2, 4, 20, 20};  
		int ctr_even1 = 0, ctr_odd1 = 0;
		System.out.println("Original Array: "+Arrays.toString(nums1)); 
		    
	    boolean found1010 = false;
	    boolean found2020 = false;
	      
	    for(int i = 0; i < nums1.length - 1; i++) {
	        if(nums1[i] == 10 && nums1[i+1] == 10)
	            found1010 = true;
	                        
	        if(nums1[i] == 20 && nums1[i+1] == 20)
	            found2020 = true;
	    }
	   
		System.out.printf( String.valueOf(found1010 != found2020));	
		System.out.printf("\n");
		
// Write a Java program to rearrange all the elements of an given array of integers 
		//so that all the odd numbers come before all the even numbers.	
		
		/*
		 * my solution
		 */
		int[] a = {1,5,4,7,6,9,8};

		for(int i=0;i<a.length;i++)
		{
			if(a[i]/2 ==0)
			{
				int j =i+1;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
				i++;
			}
		}
				
		System.out.println(Arrays.toString(a));
		
//Write a Java program to create an array (length # 0) of string values. 
		//The elements will contain "0", "1", "2" … through ... n-1.
	
		
		int n =5;
	
		String[] a1 = new String[n];
		
		for(int i=0;i<a1.length;i++)
		{
			a1[i] = String.valueOf(i);
		}
		
		System.out.println("New Array: "+Arrays.toString(a1)); 	
		
//	Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere later in the array.
		
		
		
		int[] array_nums = {10, 70, 80, 50, 20, 13, 50};
	      boolean testd = false;
		  int result=0;
		  int x = 10;
		  int y = 20;
	    
	    for(int i = 0; i < array_nums.length; i++) {
	        if(array_nums[i] == x)
	            testd = true;
	                    
	        if(testd && array_nums[i] == y)
			{
	         System.out.printf( String.valueOf(true));	
	         result = 1		 ;
			}
	    }
	     if (result==0)                             
		   {	 
	         System.out.printf( String.valueOf(false));
		    }
			System.out.printf("\n");
		
		
	//Write a Java program to check if an array of integers contains a specified number next to each other or
			//there are two same specified numbers separated by one element.
			
			
			  int[] array_nums1 = {10, 20, 10, 50, 20, 13, 50};
				//int[] array_nums = {10, 10, 50, 50, 20, 13, 50};
			      boolean testd1 = false;
				  int result1=0;
				  int x1 = 10;
				      
				for(int i = 0; i < array_nums1.length - 1; i++) {
			        if(array_nums1[i] == x1 && array_nums1[i+1] == x1)
			            {
			         System.out.printf( String.valueOf(true));	
			         result1 = 1 ;
					}
			                  
			        if(i <= array_nums1.length - 3 && array_nums1[i] == x1 && array_nums1[i+2] == x1)
			           {
			         System.out.printf( String.valueOf(true));	
			         result1 = 1 ;
					}
			    }
				
				 if (result1==0)                             
				   {	 
		         System.out.printf( String.valueOf(false));
				    }
					System.out.printf("\n");
		
		
	// Write a Java program to check if the value 20 appears three times and no 20’s are next 
				//	to each other in a given array of integers.
					
				/*
				 * my solution
				 */
			
					 int[] array_nums11 = {20, 20, 20, 80, 789, 13, 50};
					 
				      
						int      result11 =0;
						
							  int x11 = 20,count=0;
							  
							  int y1 =0;
							
						    
						    for(int i = 0; i < array_nums11.length; i++) 
						    {
						    	y1 = array_nums11[i];
						    	
						        if(y1==x11);
						    count ++;
						    
						    //here the loop is not braking after falling the condition
						         
						    }
						    System.out.println(count);
						    
						    for(int i = 0; i < array_nums11.length; i++) 
						    {
						    if(array_nums11[i]==x11 && array_nums11[i+1]==x11 && array_nums11[i+2]==x11)
						    {
						    	System.out.println(String.valueOf(true));
						    	result11 = 1;
						    }	
						    }
						                    
						 
						    if(result11==0)
						    {
						    	System.out.println(String.valueOf(false));
						    }
						    
						    
		
		/*
		 * Write a Java program to check if a specified number appears 
		 * in every pair of adjacent element of a given array of integers.
		 */
		
		
						    int[] array_nums111 = {10, 20, 10, 20, 40, 20, 50};
							int result111 = 0;	
							int x111 = 20;
							for(int i = 0; i < array_nums111.length - 1; i++) {
						        if(array_nums111[i] != x111 && array_nums111[i + 1] != x111)
								{
						                                result111 = 1;	
								}        
						    }                                   
						    if (result111==0)
						 	  {
						     	 System.out.printf( String.valueOf(true));	         
							  }
						 else
							   	  {
						     	 System.out.printf( String.valueOf(false));	         
							  }		
		
		
		/*
		 * Write a Java program to count the two elements of two given arrays of 
		 * integers with same length, differ by 1 or less.
		 */
		
		
						    int[] z1 = {10, 11, 10, 20, 43, 20, 50};
							int[] z2 = {10, 13, 11, 20, 44, 30, 50};
							System.out.println("Array1: "+Arrays.toString(z1)); 
							System.out.println("Array2: "+Arrays.toString(z2)); 
							int count1 =0;
							
							for(int i =0;i <z1.length;i++)
							{
							
								  if(Math.abs(z1[i] - z2[i]) <= 1)
							            count1++;
							}
							
							System.out.println(count1);
					    
	/*
	 * Write a Java program to check if the number of 10 is greater than number 
	 * to 20's in a given array of integers.						
	 */
							
		
							int[] n1 = {10, 11, 10, 30, 45, 20, 33, 53};
						 
							System.out.println("Original Array: "+Arrays.toString(n1)); 
						    
							int ctr1 = 0;
						    int ctr2 = 0;
						      
						    for(int i = 0; i < n1.length; i++) {
						        if(n1[i] == 10)
						            ctr1++;
						                        
						        if(n1[i] == 20)
						            ctr2++;
						    }     
						    
						    System.out.printf(String.valueOf(ctr1 > ctr2));
							System.out.printf("\n");
		
		/*
		 * 
		 */
		
		
							int[] q1= {11, 11, 13, 31, 45, 20, 33, 53};
						    int resu = 1; 
							System.out.println("Original Array: "+Arrays.toString(q1)); 
							
							for(int i = 0; i < q1.length; i++)
						     {
						      	if(q1[i] == 10 || q1[i] == 30)
								{	
						  		
								   result =0;
								}
						      }
							 if (result==1)
						 	   System.out.printf( String.valueOf(false));	         
						     else
							   System.out.printf(String.valueOf(true));

		//103
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

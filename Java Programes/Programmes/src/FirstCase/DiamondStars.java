package FirstCase;

import java.util.Scanner;

public class DiamondStars {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 
	        //Taking noOfRows value from the user
	 
	        System.out.println("How Many Rows You Want In Your Diamond?");
	 
	        int noOfRows = sc.nextInt();
	        
	        //Getting midRow of the diamond
	        
	        int midRow = (noOfRows)/2;
	 
	        //Initializing row with 1
	 
	        int row = 1;
	 
	        System.out.println("Here Is Your Diamond : ");
	        
	        for(int i=midRow;i>0;i--)
	        {
	        	for(int j=1;j<=i;j++)
	        	{
	        		System.out.print(" ");
	        	}
	        	
	        	for(int j=0;j<row;j++)
	        	{
	        		System.out.print("* ");
	        	}
	        	
	        	 System.out.println( );
	 	        row++;
	        }
	       
	        
	        
	        for(int i=0;i<=midRow;i++)
	        {
	        	for(int j=1;j<=i;j++)
	        	{
	        		System.out.print(" ");
	        	}
	        	
	        	for(int j=row;j>0;j--)
	        	{
	        		System.out.print( row+" ");
	        	}
	      
	        System.out.println( );
	        row--;
	        
	        }
		
	}

}

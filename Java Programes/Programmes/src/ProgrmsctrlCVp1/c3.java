package ProgrmsctrlCVp1;

import java.util.Scanner;

public class c3 {

	public static void main(String[] args) {
		
		// program to print american flag

		    System.out.println("* * * * * * ==================================");
	        System.out.println(" * * * * *  ==================================");
	        System.out.println("* * * * * * ==================================");
	        System.out.println(" * * * * *  ==================================");
	        System.out.println("* * * * * * ==================================");
	        System.out.println(" * * * * *  ==================================");
	        System.out.println("* * * * * * ==================================");
	        System.out.println(" * * * * *  ==================================");
	        System.out.println("* * * * * * ==================================");
	        System.out.println("==============================================");
	        System.out.println("==============================================");
	        System.out.println("==============================================");
	        System.out.println("==============================================");
	        System.out.println("==============================================");
	        System.out.println("==============================================");
	        
	        
	        // using for loop american flag printing
	        
	        System.out.println(" ");
	        
	        String f1= "* * * * * * ==================================";
	        
	        String f2 = "==============================================";
	        
	        
	        for (int i = 0; i < 8; i++) {
	        	   System.out.println(f1);
	        	  }
	        	  System.out.println("* * * * * * ==================================");
	        	  for (int i = 0; i < 6; i++) {
	        	   System.out.println(f2);
	}

	        	  // swap two numbers
	        	  
	        	   int a, b;
	        	   a = 15;
	        	   b = 27;
	        	   System.out.println("Before swapping : a, b = "+a+", "+ + b);
	        	   a = a + b;
	        	   b = a - b;
	        	   a = a - b;
	        	   System.out.println("After swapping : a, b = "+a+", "+ + b);

	  // using Scanner
	        	   
	        	   int x, y, z;
	        	   Scanner in = new Scanner(System.in);

	        	   System.out.println("Input the first number: ");
	        	   x = in.nextInt();
	        	   System.out.println("Input the second number: ");
	        	   y = in.nextInt();

	        	   z = x;
	        	   x = y;
	        	   y = z;

	        	   System.out.println(" Swapped values are:" + x + " and " + y);
	        	  
	    // print out a face
	        	   
	        	   
	        	   System.out.println(" +\"\"\"\"\"+ ");
	               System.out.println("[| o o |]");
	               System.out.println(" |  ^  | ");
	               System.out.println(" | '-' | ");
	               System.out.println(" +-----+ ");
	        	  
	        	  
	        	  
	    // using array and for loop
	               
	               String[] arra = new String[5];

	               arra[0] = "  +\"\"\"\"\"+  ";
	               arra[1] = "   [| o o |]" ;
	               arra[2] = "    |  ^  |" ;
	               arra[3] = "    | '-' |" ;
	               arra[4] = "    +-----+" ;

	               for (int i = 0; i < 5; i++) {
	                System.out.println(arra[i]);
	               
	               
	               
	     //addition of two binary numbers 
	                
	                long binary1, binary2;
	                int j = 0, remainder = 0;
	                int[] sum = new int[20];
	                Scanner ni = new Scanner(System.in);

	                System.out.print("Input first binary number: ");
	                binary1 = ni.nextLong();
	                System.out.print("Input second binary number: ");
	                binary2 = ni.nextLong();

	                while (binary1 != 0 || binary2 != 0) 
	                {
	                 sum[j++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
	                 remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
	                 binary1 = binary1 / 10;
	                 binary2 = binary2 / 10;
	                }
	                if (remainder != 0) {
	                 sum[j++] = remainder;
	                }
	                --j;
	                System.out.print("Sum of two binary numbers: ");
	                while (j >= 0) {
	                 System.out.print(sum[j--]);
	                }
	                 System.out.print("\n");  
	               }

	   // multiply two binary numbers
	               
	               
	               long binary1, binary2, multiply = 0;
	               int digit, factor = 1;
	               Scanner ini = new Scanner(System.in);
	               System.out.print("Input the first binary number: ");
	               binary1 = ini.nextLong();
	               System.out.print("Input the second binary number: ");
	               binary2 = ini.nextLong();
	               while (binary2 != 0)
	               {
	                digit = (int)(binary2 % 10);
	                if (digit == 1) 
	                {
	                 binary1 = binary1 * factor;
	                 multiply = binaryproduct((int) binary1, (int) multiply);
	                } 
	                else
	                {
	                 binary1 = binary1 * factor;
	                }
	                binary2 = binary2 / 10;
	                factor = 10;
	               }
	               System.out.print("Product of two binary numbers: " + multiply+"\n");
	              }
	              static int binaryproduct(int binary1, int binary2) 
	              {
	               int i = 0, remainder = 0;
	               int[] sum = new int[20];
	               int binary_prod_result = 0;

	               while (binary1 != 0 || binary2 != 0) 
	               {
	                sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
	                remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
	                binary1 = binary1 / 10;
	                binary2 = binary2 / 10;
	               }
	               if (remainder != 0)
	               {
	                sum[i++] = remainder;
	               }
	               --i;
	               while (i >= 0) 
	               {
	                binary_prod_result = binary_prod_result * 10 + sum[i--];
	               }
	               return binary_prod_result;
	               
	               
	               
	              }
	              
	              
	             
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
	        	  
}


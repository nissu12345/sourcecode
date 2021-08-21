package ProgrmsctrlCVp1;

import java.util.Scanner;

public class programscont {
	
	private static final double radius =7.5;

	public static void main(String[] args) {

//		// print sum,subtraction,div,mulp,remainder of two numbers
//		
//		
//		int n1=125;
//		int n2=24;
//		
//	
//		
//		
//		
//		
//		
//		
//		
//		// using scanner we do the following operations 
//		
//	
//		
//		
//		System.out.println(".....................given.......................................");
//		
//		System.out.println(n1 + " + " + n2 + " = " + 
//				  (n1 + n2));
//				   
//				  System.out.println(n1 + " - " + n2 + " = " + 
//				  (n1 - n2));
//				   
//				  System.out.println(n1 + " x " + n2 + " = " + 
//				  (n1 * n2));
//				   
//				  System.out.println(n1 + " / " + n2 + " = " + 
//				  (n1 / n2));
//				 
//				  System.out.println(n1 + " mod " + n2 + " = " + 
//				  (n1 % n2));
//		
//		System.out.println(" ");
//		
//		// second method
//				  
//				  
//				  int sum2 = n1 + n2;
//				  int minus = n1 - n2;
//				  int multiply = n1 * n2;
//				  int subtract = n1 + n2;
//				  int divide = n1 / n2;
//				  int rnums = n1 % n2;
//				  
//				  
//				  System.out.printf(" sum2 = %d\n minus = %d\n multiply = %d\n subtract=%d\n divide =%d\n",sum2,minus,multiply,subtract,divide);
//		
//		
//		// take a number and print its table
//				  System.out.println("\n");
//				  
//				  Scanner tb = new Scanner(System.in);
//				  
//				  System.out.println("enter a num to print table: ");
//				  
//				  int numb = tb.nextInt();
//				  
//				  
//				 
//		
//				  for (int i=0; i< 10; i++)
//				  {
//
//System.out.println(numb + "*" + (i+1) + "=" + (numb * (i+1)));
//				  }
//		
//		
//		
//		// print the given pattern 
//				  
///*
//				  J    a   v     v  a                                                  
//				   J   a a   v   v  a a                                                 
//				J  J  aaaaa   V V  aaaaa                                                
//				 JJ  a     a   V  a     a
//*/				  
//
//System.out.println( "       J      a      v     v     a   "    );
//System.out.println(  "      J     a a      v   v     a a      ");
//System.out.println(  " J    J    aaaaa      v v     aaaaa      ");
//System.out.println(  "  JJJJ    a     a      v      a    a      ")
//;
//		
//		
//	//Write a Java program to compute the specified expressions and print the output.Specified Expression :
////(25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)
//
//	System.out.println("\n");
//		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
//		
//		//print the following pattern: double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
//        
//		
//		
//		 double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
//	        System.out.println(pi);
//		
//		
//		
//		// area and perimeter of a circle
//	        
//	        
//	        double perimeter =  2 * Math.PI * radius;
//	        
//	        double area = Math.PI * radius * radius;
//	        
//	        
//	        System.out.println("Perimeter is: " + perimeter);
//	        System.out.println("Area is: " + area);
//	        
//	      
//		
//		// using scanner method
//	        
//	        
//	        Scanner cir = new Scanner(System.in);
//	        
//	        System.out.println("Enter the radius of the circle:");
//	        
//	        double rad = cir.nextDouble();
//	        
//	        
//	        System.out.println("Perimeter of the circle is: "+ (2 * Math.PI * rad) );
//	        
//	        System.out.println("Area of the Circle is: " + (Math.PI * rad* rad));
//	        
//	        
//	        
//		// find the avg of the 5 numbers
//	        
//	        
//	        Scanner in = new Scanner(System.in);
//	        
//	        System.out.print("Input first number: ");
//	        int num1 = in.nextInt();
//	         
//	        System.out.print("Input second number: ");
//	        int num2 = in.nextInt();
//	         
//	        System.out.print("Input third number: ");
//	        int num3 = in.nextInt();
//	         
//	        System.out.print("Input fourth number: ");
//	        int num4 = in.nextInt();
//	        
//	        System.out.print("Enter fifth number: ");
//	        int num5 = in.nextInt();
//	         
//	         
//	        System.out.println("Average of five numbers is: " + 
//	        ( (num1 + num2 + num3 + num4 + num5) / 5));
//		
//		// using the loops
//	        
//	        
//	        double sum=0,k=1;
//			  
//	        Scanner avg = new  Scanner(System.in);
//	       
//	        System.out.println("enter the range to find the avg:");
//	        
//	       double n = avg.nextDouble();
//	       
//	       while(k<=n)
//	       {
//	    	   System.out.println("the number" + "(" + (int)k + ")" + ":" );
//	    	   
//	    	   sum = sum + avg.nextDouble();
//	    	   k =k + 1;
//	    	   
//	       }
//	       
//	       
//	        double avreg = (sum/n);
//	        System.out.println("Average:" + avreg);
//	        
	        // find the are and perimeter of the rectangle
	        
	        
	        
	        final double width = 5.6;
	        final double height = 8.5;

	        double peri = 2*(height + width);
			
	        double areaa= width * height;		
	        
	        System.out.printf("The perimeter is %f and the areaa is %f", peri ,areaa );
	        
	        System.out.println(" ");
			
//			System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, peri);
//
//	        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, areaa);
	        
	        System.out.printf("perimeter is 2*(%.1f + %.1f) = %.2f \n", height,width,peri);
	        
	        System.out.printf("Area is %.1f * %.1f = %.2f\n",height,width,areaa);
	        
	        
	        //dought what is %.if and %.2f
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}

}

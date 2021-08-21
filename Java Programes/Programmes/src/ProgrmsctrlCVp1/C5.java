package ProgrmsctrlCVp1;

import java.io.Console;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Scanner;

public class C5 {
	 public static int hex_to_decimal(String s)
	    {
	             String digits = "0123456789ABCDEF";
	             s = s.toUpperCase();
	             int val = 0;
	             for (int i = 0; i < s.length(); i++)
	             {
	                 char c = s.charAt(i);
	                 int d = digits.indexOf(c);
	                 val = 16*val + d;
	             }
	             return val;
	    }
	 
	 public static int sumDigits(long n) {
	        int sum = 0;
	        while (n != 0) {
	            sum += n % 10;
	            n /= 10;
	        }
	        return sum;
	    }
	 
	 public static double hexagonArea(double s)
	 {
	        return (6*(s*s))/(4*Math.tan(Math.PI/6));
	    }
	 public static double polygonArea(int ns, double side)
	 {
	        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
	    }
	 
	 public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
	        lat1 = Math.toRadians(lat1);
	        lon1 = Math.toRadians(lon1);
	        lat2 = Math.toRadians(lat2);
	        lon2 = Math.toRadians(lon2);

	        double earthRadius = 6371.01; //Kilometers
	        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
	    }
	 
	 public static void count(String x){
			char[] ch = x.toCharArray();
			int letter = 0;
			int space = 0;
			int num = 0;
			int other = 0;
			for(int i = 0; i < x.length(); i++){
				if(Character.isLetter(ch[i])){
					letter ++ ;
				}
				else if(Character.isDigit(ch[i])){
					num ++ ;
				}
				else if(Character.isSpaceChar(ch[i])){
					space ++ ;
				}
				else{
					other ++;
				}
			}
			System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("other: " + other);
				}
	 
	 
	 public static boolean sumoftwo(int p, int q, int r)
     {	
        return ((p + q) == r || (q + r) == p || (r + p) == q);	//  nai samja
	   }
	 
	 
	 public static boolean test(int p, int q, int r, boolean xyz)
     {
	   if(xyz)
		  return (r > q);
	   return (q > p && r > q);
     }
	 
	 
	 public static boolean test_last_digit(int p, int q, int r, boolean xyz)
     {
	     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
     }
	 
	 public static int result(int x, int y, int p) {	
			if (x%p == 0)
				return( y/p - x/p + 1); // nai samja
			return(y/p - x/p);
		}

	 public static int result(int num) {	
			int ctr = 0;
	        for(int i=1; i<=(int)Math.sqrt(num); i++) {
	            if(num%i==0 && i*i!=num) {
	                ctr+=2;
	            } else if (i*i==num) {  // nai samja
	                ctr++;
	            }
	        }
	        return ctr;
		}
	 
	 
	 
	 public static int result(int x, int y)
     {  
	if(x == y)
		return 0;
	    if(x % 6 == y % 6)
		    return (x < y) ? x : y;
	    return (x > y) ? x : y;
     }
	 
	 
		public static boolean is_Prime(int n) {
			for (int i = 3; i * i <= n; i+= 2) {
				if (n % i == 0) {
					return false; 
				}
			}
			return true;
		}
	 
	 
	 
	public static void main(String[] args) {


   String hexdec_num;
   int dec_num, i=1, j;
   int bin_num[] = new int[100];
   Scanner scan = new Scanner(System.in);
	
   System.out.print("Enter Hexadecimal Number : ");
   hexdec_num = scan.nextLine();
   
   /* convert hexadecimal to decimal */        
   dec_num = hex_to_decimal(hexdec_num);
   
   /* convert decimal to binary */        
   while(dec_num != 0)
   {
       bin_num[i++] = dec_num%2;
       dec_num = dec_num/2;
   }
	
   System.out.print("Equivalent Binary Number is: ");
   for(j=i-1; j>0; j--)
   {
       System.out.print(bin_num[j]);
   }
   System.out.print("\n");
		
  // left the 29 nad 30 progrm of the octa 
   
   System.out.println("\nJava Version: "+System.getProperty("java.version"));
   System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
   System.out.println("Java Home: "+System.getProperty("java.home"));
   System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
   System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
   System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
   
   
   // compare two numbers 
   
   
   Scanner input = new Scanner(System.in);
   int number1; // first number to compare       
   int number2; // second number to compare  
 
   System.out.print( "Input first integer: " ); // prompt        
   number1 = input.nextInt(); // read first number from user   

   System.out.print( "Input second integer: " ); // prompt        
   number2 = input.nextInt(); // read second number from user               
   
   if ( number1 == number2 )           
       System.out.printf( "%d == %d\n", number1, number2 );  
   if ( number1 != number2 )          
       System.out.printf( "%d != %d\n", number1, number2 );  
   if ( number1 < number2 )          
       System.out.printf( "%d < %d\n", number1, number2 );  
   if ( number1 > number2 )          
       System.out.printf( "%d > %d\n", number1, number2 );  
   if ( number1 <= number2 )          
       System.out.printf( "%d <= %d\n", number1, number2 );  
   if ( number1 >= number2 )          
       System.out.printf( "%d >= %d\n", number1, number2 );  
   
   
   //find the sum of the digits of a number
   
   
   Scanner input1 = new Scanner(System.in);
   System.out.print("Input an integer: ");
   long n = input1.nextLong();
   System.out.println("The sum of the digits is: " + sumDigits(n));

		
		// Arer of regular hexagon.
   
   Scanner input11 = new Scanner(System.in);
   System.out.print("Input the length of a side of the hexagon: ");
   double s = input11.nextDouble();
   System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
		
   
   //  area of polygon
   
   Scanner input111 = new Scanner(System.in);
   System.out.print("Input the number of sides on the polygon: ");
   int ns = input111.nextInt();
   System.out.print("Input the length of one of the sides: ");
   double side = input111.nextDouble();
   System.out.print("The area is: " + polygonArea(ns, side)+"\n");
		
   
		// distance between two points
   
   
   Scanner input1111 = new Scanner(System.in);
   System.out.print("Input the latitude of coordinate 1: ");
   double lat1 = input1111.nextDouble();
   System.out.print("Input the longitude of coordinate 1: ");
   double lon1 = input1111.nextDouble();
   System.out.print("Input the latitude of coordinate 2: ");
   double lat2 = input1111.nextDouble();
   System.out.print("Input the longitude of coordinate 2: ");
   double lon2 = input1111.nextDouble();

   System.out.print("The distance between those points is: " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");
		
	// reverse a string
   
   Scanner scanner = new Scanner(System.in);
   System.out.print("Input a string: ");
   char[] letters = scanner.nextLine().toCharArray();
   System.out.print("Reverse string: ");
   for (int i1 = letters.length - 1; i1 >= 0; i1--) 
   {
       System.out.print(letters[i1]);
   }
		
   //  count numbers,spaces,char AND others in the given string
   
   String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
	count(test);
	
	// print 3 digit uniqie numbers using 1,2,3,4
	
	
  
  int amount =0;
  
  for(int i1=1; i1<=4;i1++)
  {
	  for(int j1=1;j1<=4;j1++)
	  {
		  for(int k=1;k<=4 ;k++)
		  {
			  
			  if(k != i && k !=j && i != j)
			  {
				  amount ++;
				  System.out.println(i + "" + j + "" + k);
			  }
			  
		  }
	  }
  }
   
   System.out.println("the number of unique numbers: " + amount);
   
   
   // list out the charaacter sets available in the character list
   
   
   System.out.println("List of available character sets: ");  
  for (String str : Charset.availableCharsets().keySet())
  {
	  System.out.println(str);
  }
   
   //Print the ascii value
  
  int chr = 'Z';
  System.out.println();
   
   
   // input and display your password
  
  Console cons;
	if ((cons = System.console()) != null)
	{
		char[] pass_ward = null;
		try {
			pass_ward = cons.readPassword("Input your Password:");
			System.out.println("Your password was: " + new String(pass_ward));
		} 
		finally 
		{
			if (pass_ward != null) 
			{
				java.util.Arrays.fill(pass_ward, ' ');
			}
		}
	} 
	else 
	{
		throw new RuntimeException("Can't get password...No console");
	}
   
   
   // output rym in required format 
   
   
   
	 System.out.println("\nTwinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are!\n\n");
   
   
   // take n and display n + nn +nnn
	 
	 
	 int n1;
	  
	  Scanner in = new Scanner(System.in);
	  System.out.print("Input number: ");
	  n1 = in .nextInt();
	  System.out.printf("%d + %d%d  + %d%d%d\n", n1, n1, n1, n1, n1, n1);
   
   // getting the size of file 
	  
	  
	  System.out.println("/home/students/abc.txt  : " + new File("abc.txt").length() + " bytes");
	  System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
   
	  System.out.println(new File("hs_err_pid14096.log").length());
   
   
   // program to display the current time in the system
	  
	  System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
   
   
   //print the odd numberds between 1 to 99 in new line
	  
	  for(int o=1;o<100;o++)
	  {
		if(o%2 != 0)
		{
			System.out.println(o);
		}
	  }
   
   // check entered number is even or odd,and print 1 if even and 0 if odd
	  
	  Scanner eo = new Scanner(System.in);
	  
	  System.out.println("Enter a number: ");
	  
	  int num = eo.nextInt();
	  
	  
	  if(num%2==0)
	 {
		  
		  System.out.println("1");
	  }
	  else
	  {
		  System.out.println("0");
	  }
   
   // check the num divisible by 3,5 and both.
	  
	  System.out.println("\nDivided by 3: ");	
	  
		for (int i1=1; i1<100; i1++) 
		{
			if (i1%3==0) 
			System.out.print(i1 +", ");			
		}			
				
		System.out.println("\n\nDivided by 5: ");
		
		for (int i1=1; i1<100; i1++) 
		{
			if (i1%5==0) System.out.print(i1 +", ");			
		}
				
		System.out.println("\n\nDivided by 3 & 5: ");			
		for (int i1=1; i1<100; i1++) 
		{
			if (i1%3==0 && i1%5==0) 
				System.out.print(i1 +", ");			
		}
		System.out.println("\n");
   
   
   // ..........................alhamdulilla 50 programs reached..............................................................................
   
   
   // convert a String into a integer
		
		
		 Scanner in1 = new Scanner(System.in);
	        System.out.print("Input a number(string): ");
	        String str1 = in1.nextLine();
			int result = Integer.parseInt(str1);
	        System.out.printf("The integer value is: %d",result);
			System.out.printf("\n");
   
   // find if sum of two num is equal to the third num,and if so return true
			
			
			Scanner in11 = new Scanner(System.in);
	        System.out.print("Input the first number : ");
	        int x = in11.nextInt();  
			System.out.print("Input the second number: ");
			int y = in11.nextInt(); 
			System.out.print("Input the third number : ");
	        int z = in11.nextInt(); 
	        System.out.print("The result is: "+sumoftwo(x, y, z));
			System.out.print("\n");
   
   /*
    * Write a Java program that accepts three integers from the user and 
    * return true if the second number is greater than first number and third number is 
    * greater than second number. If another variable "abc" is true second number does
    *  not need to be greater than first number.
    * 
    */
   
			 Scanner in111 = new Scanner(System.in);
		        System.out.print("Input the first number : ");
		        int x1 = in111.nextInt();  
				System.out.print("Input the second number: ");
				int y1 = in111.nextInt(); 
				System.out.print("Input the third number : ");
		        int z1 = in111.nextInt(); 
		        System.out.print("The result is: "+test(x1, y1, z1,true));
				System.out.print("\n");
   
				
				/*
				 * Write a Java program that accepts three integers from the user and return true
				 *  if two or more of them (integers ) have the same rightmost digit. 
				 *  The integers are non-negative.
				 */
   
   
   
				 Scanner inr = new Scanner(System.in);
			        System.out.print("Input the first number : ");
			        int x1r = inr.nextInt();  
					System.out.print("Input the second number: ");
					int yr= inr.nextInt(); 
					System.out.print("Input the third number : ");
			        int zr = inr.nextInt(); 
			        System.out.print("The result is: " + test_last_digit(x1r, yr, zr,true));
					System.out.print("\n");
   
   
   //		Write a Java program to convert seconds to hour, minute and seconds.
					
					
					Scanner ints = new Scanner(System.in);
			        System.out.print("Input seconds: ");
					int seconds = ints.nextInt();
					int p1 = seconds % 60;
					int p2 = seconds / 60;
				    int	p3= p2 % 60;
					 p2 = p2 /60;
			        System.out.print( p2 + ":" + p3 + ":" + p1);
					System.out.print("\n");
					 

   // Write a Java program to find the number of integers within the range of two specified numbers and
					//that are divisible by another number.
					
					
							int xd = 5;
							int yd = 20;
							int pd = 3;
							System.out.println(result(xd,yd,pd));
							
							
	/*
	 * 			Write a Java program to accepts an integer and count the factors of the number.			
	 */
							 Scanner inf = new Scanner(System.in);
						      System.out.print("Input an integer: ");
						      int xf = inf.nextInt(); 
						      System.out.println(result(xf));
					
		/*
		 * Write a Java program to capitalize the first letter of each word in a sentence.			
		 */
					
					
			Scanner u = new Scanner(System.in);
			
			System.out.println("enter a sentence: ");
			
			String line = u.nextLine();
			
			
			String upper_case = "";
			
			Scanner linesc = new Scanner(line);
			
			while(linesc.hasNext())
			{
				String word = linesc.next();
				upper_case = upper_case + Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
			}
			System.out.println(upper_case.trim());		
					
					
		// convert string to lower case
			
			  Scanner inp = new Scanner(System.in);
			     System.out.print("Input a String: ");
				 String lin = inp.nextLine();
				 line = lin.toLowerCase();
				 System.out.println(line); 
				 
		/*
		 *Write a Java program to find the penultimate (next to last) word of a sentence. 			
		 */
					
				 Scanner iny = new Scanner(System.in);
			     System.out.print("Input a Sentence: ");
				 String liney = iny.nextLine();
				 
				 String[] words = liney.split("[ ]+");
				 System.out.println("Penultimate word: "+words[words.length - 2]);	
				 
		/*
		 * 			Reverse a string 
		 */
					
				  Scanner ing = new Scanner(System.in);
				     System.out.print("\nInput a word: ");
					 String word = ing.nextLine();
					 word = word.trim();
					 String empts = ""; 
				     char[] ch=word.toCharArray();  
					 for (int i1 = ch.length - 1; i1 >= 0; i1--) {
							 empts += ch[i1];
						 }
					 System.out.println("Reverse word: "+empts.trim()); 
					 }				
				
	/*
	 * Write a Java program that accepts three integer values and return true if one of them is 20 or
	 *  more and less than the substractions of others.
	 */
					
//	 Scanner in = new Scanner(System.in);
//     System.out.print("Input the first number : ");
//     int x = in.nextInt();  
//		System.out.print("Input the second number: ");
//		int y = in.nextInt(); 
//		System.out.print("Input the third number : ");
//     int z = in.nextInt(); 
//     System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
		
	
	/*Write a Java program that accepts two
	 *  integer values from the user and return the larger values. 
	 *  However if the two values are the same, return 0 and 
	 *  return the smaller value if the two values have the same remainder when divided by 6.'
	 * 
	 * 
	 */
			
//	Scanner in = new Scanner(System.in);
//    System.out.print("Input the first number : ");
//    int a = in.nextInt();  
//	System.out.print("Input the second number: ");
//	int b = in.nextInt(); 
//	System.out.println("Result: "+ result(a, b));
			
	
		
	/*
	 * Write a Java program that accepts two integer values between 25 to 75 and 
	 * return true if there is a common digit in both numbers.
	 */
					
	/* Scanner in = new Scanner(System.in);
     System.out.print("Input the first number : ");
     int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		System.out.println("Result: "+common_digit(a, b));				
		*/			
					
	/*
	 * find modules of the number
	 * 				
	 */
					
					
//		Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number : ");
//        int a = in.nextInt();  
//		System.out.print("Input the second number: ");
//		int b = in.nextInt(); 
//		int divided = a / b;
//		int result = a - (divided * b);
//		System.out.println(result); 			
//					
					
					
		/*
		 * sum of prime numbers upto 100			
		 */
					
					
	/* int sum = 1,n=0,ctr = 0;
	 

    	
		while (ctr < 100) {
			n++; 
			if (n % 2 != 0) { 
			// check if the number is even
				if (is_Prime(n)) {
					sum += n; 					
				}
			}
                    ctr++; 	
		}
		System.out.println("\nSum of the prime numbers till 100: "+sum); 	             
	*/				
					
					
		//Write a Java program to insert a word in the middle of the another string.
	//Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0			
					
//	 String main_string = "Python 3.0"; // Strings concept
//	   String word = "Tutorial";
//	   System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));
//					
					
					
		//	left the string programs
	
	
	/*
	 * Write a Java program to test if 10 appears as either the first or last element of an array of integers. 
	 * The length of the array must be greater than or equal to 2.
	 * 
	 */
					
//					
//	  int[] num_array = {10, -20, 0, 30, 40, 60, 10};
//	    System.out.println((num_array[0] == 10 && num_array[num_array.length-1] == 10));
		
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
   
   
   
   
   
   
   
   
   
   
   
	}



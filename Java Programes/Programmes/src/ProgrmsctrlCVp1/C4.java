package ProgrmsctrlCVp1;

import java.util.Scanner;

public class C4 {
	

	public static void main(String[] args) {
		
//	
//// decimal to binary 
////		int dec_num, quot, i=1, j;
////		
////        int bin_num[] = new int[100];
////        
////        Scanner scan = new Scanner(System.in);
////        System.out.print("Input a Decimal Number : ");
////        
////        dec_num = scan.nextInt();
////		
////        quot = dec_num;
////		
////        while(quot != 0)
////        {
////            bin_num[i++] = quot%2;
////            quot = quot/2;
////        }
////		
////        System.out.print("Binary number is: ");
////        for(j=i-1; j>0; j--)
////        {
////            System.out.print(bin_num[j]);
////        }
////        
////        System.out.print("\n");
////        
////        
////        
////       // decimal to hexadecimal
////        
////        
////        int dec_num1, rem;
////        String hexdec_num="";
////        
////        /* hexadecimal number digits */
////        
////        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
////        
////        Scanner in = new Scanner(System.in);
////		
////        System.out.print("Input a decimal number: ");
////        dec_num1 = in.nextInt();
////		
////        while(dec_num1>0)
////        {
////            rem = dec_num1%16;
////            hexdec_num = hex[rem] + hexdec_num;
////            dec_num1 = dec_num1/16;
////        }
////        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");         
////    
////      // decimal to octa decimal
////        
////        int dec_num11, rem1, quot1, i1=1, j1;
////        int oct_num[] = new int[100];
////        Scanner scan1 = new Scanner(System.in);
////		
////        System.out.print("Input a Decimal Number: ");
////        dec_num11 = scan1.nextInt();
////		
////        quot1 = dec_num11;
////		
////        while(quot1 != 0)
////        {
////            oct_num[i1++] = quot1%8;
////            quot1 = quot1/8;
////        }
////		
////        System.out.print("Octal number is: ");
////        for(j1=i1-1; j1>0; j1--)
////        {
////            System.out.print(oct_num[j1]);
////        }
////		System.out.print("\n");
////    }
////        
////	
//
//    // binary number to decimal number 
//	
//	
//		 Scanner sc = new Scanner(System.in);
//		  long binaryNumber, decimalNumber = 0, j = 1, remainder;
//		  System.out.print("Input a binary number: ");
//		  binaryNumber = sc.nextLong();
//
//		  while (binaryNumber != 0) 
//		  {
//		   remainder = binaryNumber % 10;
//		   decimalNumber = decimalNumber + remainder * j;
//		   j = j * 2;
//		   binaryNumber = binaryNumber / 10;
//		  }
//		  System.out.println("Decimal Number: " + decimalNumber);
//		 
//        /*
//         * where is j increasing here
//         */
//        
//        //binary to octa decimal
//	  
//		  int[] hex = new int[1000];
//		  int i = 1, j1 = 0, rem, dec = 0, bin;
//		  Scanner in = new Scanner(System.in);
//		  System.out.print("Input a Binary Number: ");
//		  bin = in.nextInt();
//		  while (bin > 0) {
//		   rem = bin % 2;
//		   dec = dec + rem * i;
//		   i = i * 2;
//		   bin = bin / 10;
//		  }
//		   i = 0;
//		  while (dec != 0) {
//		   hex[i] = dec % 16;
//		   dec = dec / 16;
//		   i++;
//		  }
//		  System.out.print("HexaDecimal value: ");
//		  for (j1 = i - 1; j1 >= 0; j1--)
//		  {
//		   if (hex[j1] > 9) 
//		   {
//		    System.out.print((char)(hex[j1] + 55)+"\n");
//		   } else
//		   {
//		    System.out.print(hex[j1]+"\n");
//		   }
//		  }
//
//        
//      // binary to octadecimal  
//        
//        
//		  int binnum, binnum1,rem1, decnum=0, quot, i1=1, j1;
//	        int octnum[] = new int[100];
//	        Scanner scan = new Scanner(System.in);
//			System.out.print("Input a Binary Number : ");
//	        binnum = scan.nextInt();
//	        binnum1=binnum;
//	     
//	      while(binnum > 0)
//	        {
//	            rem1 = binnum % 10;
//	            decnum = decnum + rem1*i1;
//	            //System.out.println(rem);
//	            i1 = i1*2;
//	            binnum = binnum/10;
//	        }   
//
//			i1=1;
//	        quot = decnum;
//			
//	        while(quot > 0)
//	        {
//	            octnum[i1++] = quot % 8;
//	            quot = quot / 8;
//	        }
//			
//	        System.out.print("Equivalent Octal Value of " +binnum1+ " is :");
//	        for(j1=i1-1; j1>0; j1--)
//	        {
//	            System.out.print(octnum[j1]);
//	        }
//	 System.out.print("\n");
//        
//        
//        // octa number to decimal number
//	 
//	 int binum11, binnum111,rem11, decnum1=0, quot1, i11=1, j11;
//     int octnum1[] = new int[100];
//     Scanner scan1 = new Scanner(System.in);
//		System.out.print("Input a Binary Number : ");
//     binum11 = scan1.nextInt();
//     binnum111=binum11;
//  
//   while(binnum111 > 0)
//     {
//         rem11 = binnum111 % 10;
//         decnum1 = decnum1 + rem11*i11;
//         //System.out.println(rem);
//         i11 = i11*2;
//         binnum111 = binnum111/10;
//     }   
//
//		i11=1;
//     quot1 = decnum1;
//		
//     while(quot1 > 0)
//     {
//         octnum1[i11++] = quot1 % 8;
//         quot1 = quot1 / 8;
//     }
//		
//     System.out.print("Equivalent Octal Value of " +binnum111+ " is :");
//     for(j11=i11-1; j11>0; j11--)
//     {
//         System.out.print(octnum1[j11]);
//     }
//System.out.print("\n");
//
//
////octa to binary
//
//Scanner in1 = new Scanner(System.in);
//int[] octal_numvalues = {0, 1, 10, 11, 100, 101, 110, 111};
//long octal_num, tempoctal_num, binary_num, place;
//int rem111;
//System.out.print("Input any octal number: ");
//octal_num = in1.nextLong();
//tempoctal_num = octal_num;
//binary_num = 0;   							//dought in some points :palce * 1000?
//place = 1;
//while (tempoctal_num != 0)
//{
// rem111 = (int)(tempoctal_num % 10);
// binary_num = octal_numvalues[rem111] * place + binary_num;
// tempoctal_num /= 10;
// place *= 1000;
//}
//System.out.print("Equivalent binary number: " + binary_num+"\n");
//}
   
	// octa to hexa decimal
        
	 String octal_num, hex_num;
     int decnum;
     Scanner in = new Scanner(System.in);
		
     System.out.print("Input a octal number : ");
     octal_num = in.nextLine();
		
     decnum = Integer.parseInt(octal_num, 8);
     hex_num = Integer.toHexString(decnum);
		
     System.out.print("Equivalent hexadecimal number: "+ hex_num+"\n");
        
        
        
        
    //hexa decimal to binary
     
 



        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
		

	}

}

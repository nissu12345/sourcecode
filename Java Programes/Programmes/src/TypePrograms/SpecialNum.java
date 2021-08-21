package TypePrograms;

import java.util.Scanner;

public class SpecialNum {

	public static void main(String[] args) {

int n,p=1,s=0,t,d=10,c;

Scanner sc = new Scanner(System.in);

System.out.println(" Enter a number to check its a special number or not: ");

n = sc.nextInt();

int temp =n;

while(n>0)
{
	c = n % d;
	s = s + c;
	 p= p * c;
	 
	 n= n/d;
}
 t = s + p;
 
 if(t==temp)
 {
	 System.out.println(temp + " is a special number..");
 }




	}

}

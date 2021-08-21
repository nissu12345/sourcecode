package FiftyPrograms;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		
		int n;

Scanner s = new Scanner(System.in);

System.out.println("Enter a number to find square root of it: ");

n = s.nextInt();

System.out.println("The square root of the number " + n + " is " + SquareRoots(n));

	}
	
	
	public static double SquareRoots(int num)
	{
		double t;
		double Squareroot = num/2;
		do
		{
			t= Squareroot;
			Squareroot= (t+(num/t))/2;
		}
		while((t-Squareroot)!=0);
		return Squareroot;
	}
}

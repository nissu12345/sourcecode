package FiftyPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

int year;
boolean flag = true;

Scanner s = new Scanner(System.in);

System.out.println("Enter a year: ");

year = s.nextInt();

if(year%400==0)
{
	flag=true;
}
else if(year%4==0)
{
	flag = true;
}
else if(year%100==0) 
{
	flag = false;
}

else {
	flag = false;
}

if(flag == true)
{
	System.out.println("Year " + year + " is a leap year ");
}
else
{
	System.out.println("Year " + year + " is a not a leap year ");
}

	}

}

package Arrayscase;



public class CopyArray {

	public static void main(String[] args) {
		
		int []  a = {1,2,3,4,5};
		
		
		
		
		int [] b = a;
		
		
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]);
		
		}
		
		
		
		System.out.println();
		
		for(int c : b)
		{
			System.out.print(c);
		}
		
// here a possiblity of the chage in the b value as we chage the value of the a array

	}

}

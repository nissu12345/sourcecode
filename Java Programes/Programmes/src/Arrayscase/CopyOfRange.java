package Arrayscase;

import java.util.Arrays;

public class CopyOfRange {

	public static void main(String[] args) {

int[] a = { 1,2, 3,4,5,6,7,8,9,10,11};




int[] b = Arrays.copyOfRange(a, 4, 10);

System.out.println(Arrays.toString(b));


int[] b2 = Arrays.copyOfRange(a, 3, 10);
System.out.println(Arrays.toString(b2));
		
	}

}

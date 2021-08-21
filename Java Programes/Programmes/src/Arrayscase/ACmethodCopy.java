package Arrayscase;

import java.util.Arrays;
public class ACmethodCopy {

	public static void main(String[] args) {

int[] a = {48,1,2,3,4,5,6,7,8,9,10,11,12,13,14};


int[] b = new int[a.length];


for(int i=0;i<a.length;i++)
{
	System.arraycopy(a, 10, b, 5, 3);
}

System.out.println(Arrays.toString(b));

for(int c :a )
{
System.arraycopy(a, 0, b, 2, 10);
}

System.out.println(Arrays.toString(b));









		
	}

}

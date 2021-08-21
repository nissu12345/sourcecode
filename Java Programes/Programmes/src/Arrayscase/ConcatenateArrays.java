package Arrayscase;

import java.util.Arrays;

public class ConcatenateArrays {

	public static void main(String[] args) {
		
		// concatenate using AC method
		
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		

int h1 = a.length;
int h2 = b.length;

int tlen = h1 + h2;

int[] conca = new int[tlen];
		
System.arraycopy(a,0,conca,0,h1);
System.arraycopy(b,0,conca,h1,h2);

System.out.print(Arrays.toString(conca));

System.out.println(" ");

// concatenate using for method

int[] c = {1,2,3,};
int[] d = {6,7,8,};


int p1 = c.length;
int p2 = d.length;

int Tlen = p1 + p2;

int[] f = new int[Tlen];

int k =0;
for(int i =0;i<p1;i++)
{
	f[k] = c[i];
	k++;
}
for(int j=0;j<p2;j++)
{
		f[k] = d[j];
		k++;
}


System.out.println(Arrays.toString(f));

	}
	

}

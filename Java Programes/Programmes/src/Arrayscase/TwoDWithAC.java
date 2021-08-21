package Arrayscase;

import java.util.Arrays;

public class TwoDWithAC {

	public static void main(String[] args) {

int[][] a = {  {40,41,42,43,44,45,46,47,48}, {51,52,53,54,55,56,57,58}, {406,416,426,436,6,446,456,466,476,486}    };

int[][] b = new int [a.length][]; 

for(int i =0;i<a.length;i++)
{
	b[i] = new int[a[i].length];
	
//	for(int j=0;j<a[i].length;j++)
//	{
//		b[i][j ]=a[i][j];
//	}
//	 
	System.arraycopy(a[i],4, b[i],2,4 );
	
	

}


System.out.println(Arrays.deepToString(b));
System.out.println();

	}

}

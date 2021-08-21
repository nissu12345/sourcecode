package Arrayscase;

import java.util.Arrays;

public class twodArraycopy {

	public static void main(String[] args) {



int[][] a = {  {1,2,3},{4,5,6},{7,8,9}  };


int [][] b = new int[a.length][];


for(int i=0;i<a.length;i++)
{
	b[i] = new int[a[i].length];// creating space for the rows in the new 2d array
	for(int j=0;j<a[i].length;j++)
	{
	b[i][j]=a[i][j];		
	}
}
 System.out.println(Arrays.deepToString(b));
	}

}

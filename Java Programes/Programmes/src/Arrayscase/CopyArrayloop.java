package Arrayscase;

import java.util.Arrays;

public class CopyArrayloop {

	public static void main(String[] args) {

int[]  a = {4,8,6,9,7,6,54,6};


int[] b =new int[a.length];


for(int i =0;i<a.length;i++)
{
	b[i] = a[i];
}

System.out.println(Arrays.toString(b));




	}

}

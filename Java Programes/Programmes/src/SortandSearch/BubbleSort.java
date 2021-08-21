package SortandSearch;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {2,5,1,9,8,3};
		
		int l = a.length;
		
		for(int i= 0;i<l;i++)
		{
			for(int j = i+1;j<l;j++)
			{
				
			if(a[j]<a[i])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;			
				}
			}	
		}
		System.out.println(Arrays.toString(a));

	}

}

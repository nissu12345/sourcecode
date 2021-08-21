package SortandSearch;

import java.util.Arrays;

public class InsertionSort {
	
	
void Insort(int[] ar)
{
	int j,key,i;
	
	for( i=1;i<ar.length;i++)
	{
		 key = ar[i];
		 
		 j = i-1;
		 
		 while(j>=0 && key < ar[j])
		 {
			 
		 ar[j+1]= ar[j];
		 --j;
		 }
		 
	ar[j+1] =key;
	}
}

	public static void main(String[] args) {
		
		
		int[] a = {99,48,56,22,16,77};
		
		
		InsertionSort is = new InsertionSort();
	
		is.Insort(a);
		
		System.out.println("The sorted Array is:");
System.out.println(Arrays.toString(a));

	}

}

package SortandSearch;

import java.util.Arrays;

public class QuickSort {
	
	int partition(int[] ar, int low, int high) {
		int pivot = ar[high];
		int i = (low -1);
		for(int j=low;j<high;j++)
		{
			if( ar[j] <= pivot)
			{
				i++;
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
		
		int temp = ar[i+1];
		ar[i+1] = ar[high];
		ar[high] = temp;
		return (i+1);
	}
	
	
	
	
	
	
	void Sortit(int[] ar,int low, int high) 
	{
		if(low<high)
		{
			int pi =partition(ar,low,high);
			
			Sortit(ar,low,pi-1);
			Sortit(ar,pi+1,high);
		}
	}
	
	public static void main(String[] args) {


		int[] a = {10,5,20,89,56,23,0,598};
		
		
		int high = a.length;
	
		
		QuickSort qs = new QuickSort();
		
		qs.Sortit(a,0,high-1);
		
		System.out.println("The sorted arry is: ");
		
		System.out.println(Arrays.toString(a));
		
		

	}

}

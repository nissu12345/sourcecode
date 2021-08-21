package SortandSearch;



public class SelectionSort {
	
	
void SelectSort(int[] arr)
{
	int min,temp=0;
	
	for(int i=0;i<arr.length;i++)
	{
		min =i;
		
		for(int j=i+1;j<arr.length;j++)
		
		
		
			
			if(arr[j]< arr[min]) 
					
	
				min =j;
			
		
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			
		
		
		
	}
}
	



	void Display(int[] array) 
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + ",");
			

		}
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		int[] a = {22,55,36,48,75};
		
		SelectionSort  ss = new SelectionSort();
		
		ss.Display(a);
		
		
		ss.SelectSort(a);
	
		System.out.println();

		ss.Display(a);
		
		
	}

}

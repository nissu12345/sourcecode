
public class qst2 {
	
	
	int Partition(int[] ar,int lw,int hg)
	{
		
		int pivot = ar[lw],i=lw,j=hg;
		
		while(i<j)
		{
			do 
			{
				i++;
			}while(ar[i]<=pivot);
			
			do
			{
				j--;
			}
			while(ar[i]>pivot);
			
			if(i<j)
				swap(ar,ar[i],ar[j]);
		}
		
		swap(ar,ar[lw],ar[j]);
		return j;
		
		
	}
	
	
	private void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] =arr[j];
		arr[j] =temp;
		
	}


	void QuickSt(int[] arr,int l,int h)
	{
		if(l<h) 
		{
			int j = Partition(arr,l,h);
			
			QuickSt(arr,l,j-1);
			QuickSt(arr,j+1,h);
			
		}
	}

	public static void main(String[] args) {
		
		int[] a = {4,5,6,0,10,66,48,16,1,22,44,11};
		
		for(int ar :a)
		{
			System.out.print(ar + ",");
		}
		int low=0,high=a.length-1;
		
		qst2 qs = new qst2();
		
		qs.QuickSt(a, low, high);
		
		System.out.println();
		
		for(int ar :a)
		{
			System.out.print(ar + ",");
		}
		
		
		

	}

}

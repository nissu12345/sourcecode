
public class sel {

	public static void main(String[] args) {
		//selection sort
		
	//	first value is comsidered as min and other elem are comprd and sorted
		
		
		int[] a = {10,8,9,6,4,1};
		
		for(int ar :a) 
		{
			System.out.print(ar + ",");
		}
		
		int temp;

		for(int i =0;i<a.length;i++)
		{
			int min = i;
		
		for(int j=i+1;j<a.length;j++)
			if(a[j]<a[min])
			min =j;
		
		temp=a[min];
		a[min]=a[i];
		a[i] =temp;
		
		}
		
		System.out.println();
		for(int ar :a) 
		{
			System.out.print(ar + ",");
		}
		
	}

}

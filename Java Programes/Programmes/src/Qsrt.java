
public class Qsrt {
	
	int Partition(int[] ar,int l,int h)
	{
		int pivot = ar[l],i = l,j = h, temp = 0;
		
		while(i<j)
		{
			do {
				i++;
			}
			while(ar[i]<=pivot);
			do {
				j--;
			}while(ar[j]>pivot);
			
			if(i<j) 
				
				/*			 temp =ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				*/
				swap(ar,i,j);
		}
		swap(ar,i,j);

	/*	 temp =ar[l];
			ar[l]=ar[j];
			ar[j]=temp;
		*/
		return j;	
	}

	private void swap(int[] ar,int i, int j) {
	int	temp =ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
	
	}


void Quicksrt(int[] ar,int lw,int hig)
{
	
	if(lw<hig)
	{
	int j= Partition(ar,lw,hig);
		Quicksrt(ar,lw,j-1);
		Quicksrt(ar,j+1,hig);
	}
}



	public static void main(String[] args) {

int[] a = {7,1,6,10,5,11,3,45,84,22,65,44,45,89,66};

for(int ar :a)
{
	System.out.print(ar + ",");
}

int low=0,high =a.length-1;

Qsrt qs = new Qsrt();

//qs.Partision(a,low,high);

qs.Quicksrt(a, low, high);
System.out.println();
System.out.println("sorted list");
for(int ar :a)
{
	System.out.print(ar + ",");
}




	}

}

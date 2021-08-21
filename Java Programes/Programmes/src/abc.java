import java.util.HashMap;

public class abc {

	public static void main(String[] args) {
		
		// insertion sort
		

		
		//first elent is sortesd and second is taken as ky and compared with left sid elements 
		
		
		int[] a = {2,5,3,10,7};
		
		for(int ar :a) 
		{
			System.out.print(ar);
		}
		
		int key,j;
		
		for(int i =1;i<a.length;i++)
		{
			key = a[i];
			j = i-1;
		while(j>=0 && key<a[j])
		{
			a[j+1] =a[j];
			--j;
		}
		
		a[j+1]=key;
			
		}
		
		System.out.println();
		
		for(int ar :a) 
		{
			System.out.print(ar);
		}
		
		
		
}

}


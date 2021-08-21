package TypePrograms;

import java.util.ArrayList;

public class UniqueNum {

	public static void main(String[] args) {
		
		
		int[] a = {4,5,6,7,8,4,5,6}; 
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			int k =0;
			
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]==a[i])
				{
					k++;
				}
			}
		}
			
			if(k==1)
			{
				System.out.println(a[i] + " is unique ");
			}
				
		}
	
	}

}

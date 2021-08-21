package InterviewPreparation;

public class PairsSumEqlsX {

	public static void main(String[] args) {


		int a[] = {-40, -5, 1, 3, 6, 7, 8, 20};
		
		int rnum = 15;
		
		for(int i =0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				//int temp = a[i] + a[j];
			//	if(temp==rnum)
				
				if((a[i] + a[j])==rnum)
				{
					System.out.println("index are: " + i + "," + j);
					System.out.println("values are: " + a[i] + "," + a[j]);
				}
				
			}
		
		}
	

	}

}

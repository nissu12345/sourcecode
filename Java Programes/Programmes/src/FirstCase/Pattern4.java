package FirstCase;

public class Pattern4 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			int value =1;
			for(int j=i;j<5;j++)
			{
				
				if(j==i)
				{
					System.out.print(value);
				}
				else
				{
					value++;
					System.out.print(value);
				}
				
			}
			System.out.println( );
			
		}
		
		
		
		

	}

}

package FirstCase;

public class Pattern3 {
	
	public static void main(String args[])
	{
		
		
		for(int i=0;i<7;i++)
		{
			int value=7;
			
		
			for(int j=i;j<7;j++)
			{
				if(j==i)
				{
					System.out.print(value);
				}
				else
				{
					value--;
					System.out.print(value);
				}
				
			}
			System.out.println( );
		}
		
		
		
		
	}

}

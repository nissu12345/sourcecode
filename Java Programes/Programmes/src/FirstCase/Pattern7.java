package FirstCase;

public class Pattern7 {

	public static void main(String[] args) {
	
		for(int i =0;i<7;i++)
		{
			int value  =7;
			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					System.out.print(value);
				}
				else 
				{
				value --;
				System.out.print(value);
				}
			}
			
			System.out.println( );
		}

		
		
	}

}

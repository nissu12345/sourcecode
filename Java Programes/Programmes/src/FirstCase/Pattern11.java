package FirstCase;

public class Pattern11 {

	public static void main(String[] args) {
		
		
		int value=1;
		for(int i=0;i<6;i++)
		{	
			for(int j=0;j<6;j++)
				if(j==i)
				{
					System.out.print(value);
				}
				else
				{
					int x =0;
					System.out.print(x);
				}
			
			System.out.println( );
			value++;
		}

	}

}

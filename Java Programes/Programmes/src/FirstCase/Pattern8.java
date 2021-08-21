package FirstCase;

public class Pattern8 {

	public static void main(String[] args) {
	
		for (int i=0;i<6;i++)
		{
			int v = 1;
			for(int j=0;j<=i;j++)
			{
				if(j==0)
				{
					System.out.print(v);
				}
				else
				{
					v++;
					System.out.print(v);
				}
			}
			
			for(int j=i;j>0;j--)
			{
				v--;
				System.out.print(v);
			}
			
			System.out.println( );
			
		}
			

	}

}

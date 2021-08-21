package FirstCase;

public class Pattern13 {

	public static void main(String[] args) {
		
		
		
		for(int i=0;i<7;i++)
		{
			int v =i+1;
		for(int j=0;j<=6;j++)
		{
			if(j==i)
			{
				System.out.print(v);
			}
			else if(j<i)
			{
				
				System.out.print(" ");
			}
			else
			{
				v++;
				System.out.print(v);
			}
		}
		
		
		System.out.println( );
		
		}
	
	
	
	
	}

}

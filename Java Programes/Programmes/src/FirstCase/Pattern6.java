package FirstCase;

public class Pattern6 {

	public static void main(String[] args) {
		
		
		for(int i=0;i<5;i++)
		{
			int value = 1;
  	for(int j=i;j<7;j++)
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

		
		

		for(int i=0;i<7;i++)
		{
			
			int value = 1;	
			for (int j=0;j<=i;j++)
			{
				if(j<=0)
				{
					
					System.out.print(value);	
				}
				
				else 
				{
					value++;
					System.out.print(value);	
				}
				
				}
			
			System.out.println(   );
	
			
		        }
		
		
		
	}

}

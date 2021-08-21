package Arrayscase;

public class TwoDimensional {

	public static void main(String[] args) {
		
		int[][] a2 = {{1,3},{1,2}};
		
//		 for(int i =0;i< 2;i++)
//		 {
//			 for(int j=0;j<2;j++)
//			 {
//				 System.out.print(a2[i][j]);
//			 }
//			 
//			 System.out.println();
//		 }

		for(int[] i : a2  )
		{
			for (int j: i)
			{
			System.out.print(j);	
			}
			System.out.println();
		}
		
		System.out.println("....................................................................");
		double[][] d = new double[5][6];
		
		d[0][0] = 12.326;
		
		d[0][1] = 45.364;
		
		d[0][2] = 56.563;
						
        d[1][0] = 54635.4565;
		
		d[1][1] = 48.2584;
		
		d[1][2] = 54.2558;
		
		for(double[] d2 : d)
		{
			
			for(double dd : d2) {
				System.out.print( " " + dd);
			}
		System.out.println();	
		}
						

		
		
	}

}

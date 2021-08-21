package FirstCase;

public class Pattern10 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)
		{
			int a=1,b=4;
			for(int j=0;j<=i;j++)
			{
				int s = i + a;
				System.out.print(s + " " );
				a = a+b;
				b--;
			}
			System.out.println( );
		}

	}

}

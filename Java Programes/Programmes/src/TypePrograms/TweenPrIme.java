package TypePrograms;

public class TweenPrIme {

	public boolean Isprime(int n)
	{
		boolean flag = true;
		int m = (int) Math.sqrt(n);
		
		for(int i=2;i<=m;i++) {
		
			if(n%i==0)
		{
			flag = false;
			break;
		}
		
		}
		
		return flag;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		TweenPrIme tp = new TweenPrIme();
		
		for(int n=2;n<=1000;n++)
		{
			if(tp.Isprime(n)  && tp.Isprime(n + 2)) 
			{
				System.out.println(n + "," + (n+2));
			}
		}
			
			
		
	}

}

package TypePrograms;

public class Automorphic10to1k {

	public static void main(String[] args) {


		
		int i,d=10,k,p=0;
		
		for(i=10;i<1000;i++)
		{
			k=i*i;
			p=0;
			d=10;
			while(p<i)
			{
			p=k%d;
			d =d*10;
			}
			
			if(p==i)
			{
				System.out.println("automorphic number is ... " + i);
			}
			
		}
		
		
		
		

	}

}

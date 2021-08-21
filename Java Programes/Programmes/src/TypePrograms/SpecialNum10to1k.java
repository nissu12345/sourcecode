package TypePrograms;

public class SpecialNum10to1k {

	public static void main(String[] args) {


		int c,t,d=10,s =0,p =1,temp=0;
		
		for(int n=10;n<=1000;n++)
		{
			temp=n;
			s=0;
			p=1;
			
			while(temp>0)
			{
				c = temp%d;
				s =s + c;
				p = p * c;
				temp = temp/d;
			}
			
			t = s + p;
			if(t==n)
			{
				System.out.println("The special number is: " + n);
			}
			
		}

	}

}

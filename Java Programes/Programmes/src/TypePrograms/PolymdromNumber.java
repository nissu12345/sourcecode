package TypePrograms;

public class PolymdromNumber {

	public static void main(String[] args) {
		
		
		int i=454,r =0,temp =0,sum =0;
		temp = i;
		
		while(temp>0)
		{
			r = temp %10;
			temp =temp /10;
			sum = r + (sum * 10);
		}
		
		if(sum==i)
		{
			System.out.println("polyndrom");
		}
		else
		{
			System.out.println("non-polyndrem");
		}
	}

}

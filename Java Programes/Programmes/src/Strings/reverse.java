package Strings;

public class reverse {
	
	public static void main(String[] args)
	{
		String sa = "nissar";
		String r = "";
		
		for(int i =sa.length()-1;i>=0;i--)
		{
			r =r +sa.charAt(i);
		}
		
		System.out.println(r);
	}

}

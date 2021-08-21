package TypePrograms;

public class ReverseString {

	public static void main(String[] args) {


		String n = "madam";
		
		
		
		String r = "";
		
		for(int i=n.length()-1;i>=0;i--)
		{
			r = r + n.charAt(i);
			
		}
		
		if(r.equals(n))
		{
			System.out.println("polyndrome..!");
		}
		else
		{
			System.out.println(" not a polyndrome..>");
		}
	}

}

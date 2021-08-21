package TypePrograms;



public class UniqueStringElement {

	public static void main(String[] args) {
		String n = "Nissar";
		
		int count =0,i;
		
		char[] ch = n.toCharArray();
		
		for(i=0;i<ch.length;i++)
		{
		count=1;
		for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j] && ch[i] != ' ')
			{
				count++;
				ch[j]=0;
			}
		}
		
	
		
		
		if(count>1 && ch[i] !=0)
		{
			System.out.println("The duplicate elements is: " + ch[i]) ;
		}
		
		}
		
		}

	
}

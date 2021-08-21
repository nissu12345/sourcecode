package FiftyPrograms;

public class FibinociiSeries {

	public static void main(String[] args) {


int n1=0,n2=1,n3,n,count=11;

System.out.print(n1 + " " + n2);

for(n=2;n<=count;n++)
{
	n3 = n1 +n2;
	System.out.print( " " + n3);
	n1=n2;
	n2=n3;
}
		
	}

}

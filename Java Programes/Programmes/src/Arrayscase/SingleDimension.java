package Arrayscase;

public class SingleDimension {

	public static void main(String[] args) {
		
		long[] l = {564,486,864,564,6565};
		
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]);
		}
		
		int[] a = new int[5];
		a[0] = 1;
		a[1] =2;
		a[2] =3;
		a[3] =4;
		a[4] =5;
		
		for(int A : a)
		{
			System.out.println(A);
		}
		
		double[] b =new double[10];
		b[0] = 1.152;
		b[1] = 2.167;
		b[2] = 5.658;
		b[3] = 7.1613;
		b[4] = 8.1235;
		
		
		for(double B : b)
		{
			System.out.println(B);
		}
		

	}

}

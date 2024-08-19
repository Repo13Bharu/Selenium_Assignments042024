package week1.ass1;

public class FibSeries {
	public static void main(String[] args) {
		int a=-0,b=1;
		
		for(int i=0;i<=8;i++)
		{
			System.out.println(a);
			int add=a+b;
			a=b;
			b=add;
		}
	}
	
}

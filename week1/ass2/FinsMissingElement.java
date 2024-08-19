package week1.ass2;

public class FinsMissingElement {
	public static void main(String[] args) {
		int a[]={1, 4,3,2,8, 6, 7};
		int b[]={1, 4,3,2,8, 6, 7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int temp;
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int k=0; k<a.length;k++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(b[k]==a[j])
					break;
				
			}
			System.out.println();
		}
		
	}
}

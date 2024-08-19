package week3.day1;

public class StringMethods {
	public static void main(String[] args)
	{
		String str="New String Methods12345";
		String str1="new string methods";
		char[] ch= str.toCharArray();
		System.out.println(ch);
		
		System.out.println(str.length());
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		
		for(int i=str1.length()-1; i<=0;i--)
		{
			System.out.print(ch[i]);
		}
	}
}

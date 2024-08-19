package week3.day1.methodoverrid;

public class SubClass extends SuperClass {
	public void supInst()
	{
		System.out.println("Now, Its ia a Sub class");
	}
	public static void main(String[] str)
	{
		SubClass sub= new SubClass();
		sub.supInst();
		
		SuperClass sup=new SuperClass();
		sup.supInst();
		
	}
}

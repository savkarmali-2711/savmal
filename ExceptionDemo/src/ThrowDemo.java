
public class ThrowDemo {
	
	private static CustomExceptionDemo c;
	private static CustomExceptionDemo c1=new CustomExceptionDemo("aaa");

	public static void m1(int age)
	{
		if(age<18)
		{
			throw c;
	//		System.out.println("gg");
		}
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String[] args) {
		
		try
		{
			m1(11);
		}
		catch(CustomExceptionDemo c)
		{
			System.out.println(c);
		}
		catch(NullPointerException c)
		{
			System.out.println("KKKK");
		}
		
		System.out.println("asdf");
	}
}

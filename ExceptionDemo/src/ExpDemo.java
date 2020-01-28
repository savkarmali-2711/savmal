
public class ExpDemo {

	public static void main(String[] args) throws ArithmeticException {
		
		try {
			int i=10/0;
		}
		catch(Exception e)
		{
			System.out.println("Exc");
		}
	}
}

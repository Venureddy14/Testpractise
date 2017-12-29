package inheritance;

public class Mulitple
{

	public static void main(String args[])
	{
			try
			{
				int a=10;
				a=a/0;
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae);
			}
			try
			{
				int a[] ={3};
				System.out.println(a[2]);
			}
			catch(ArrayIndexOutOfBoundsException aio)
			{
				System.out.println(aio);
			}
			
			
	}
	
	
}

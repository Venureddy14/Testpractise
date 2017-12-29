package testCases;

public class ExceptionHandling {
	static int z;
	static char c;
	public static void main(String[] args) {
		
		System.out.println(z);
		System.out.println(c);
		try{
	 		int a=10;
			System.out.println(a/0);
		}catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
		try{
			int a[]={23};
			System.out.println(a[25]);
		}catch(ArrayIndexOutOfBoundsException aib)
		{
			System.out.println(aib);
		}
		try
		{
			String s=null;
			System.out.println(s.length());
		}catch(NullPointerException npe){
			System.out.println(npe);
		}
		try{
			String s="hdvcueh";
			int i=Integer.parseInt(s);
		}catch(NumberFormatException nfe)
		{
			System.out.println(nfe);
		}
		try{
			String st="table";
			System.out.println(st.charAt(6));
		}catch(Exception as){
			System.out.println(as);
		}
		
	}

}

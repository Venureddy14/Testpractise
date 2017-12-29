package testCases;

public class UserdefinedExe extends Exception {
	static void agreed(int age) throws Exception{
		if(age<18)
			throw new Exception("Invalid age");
		else
			System.out.println("welcome");
	}
public static void main(String args[]) throws Exception{
	
	agreed(14);
	System.out.println("rest code");
}
}

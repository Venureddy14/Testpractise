package inheritance;

public class SingleInht extends Vehicle
{
	void run()
	{
		System.out.println("vehicle is running...");
	}


public static void main(String args[]){
	SingleInht st=new SingleInht();
	st.start();
	st.run();
}
}
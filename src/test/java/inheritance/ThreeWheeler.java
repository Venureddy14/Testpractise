package inheritance;

public class ThreeWheeler extends Vehicle{
	void transportTypes(){
		System.out.println("Three wheelers are public transports");
	}
public static void main(String args[]){
	ThreeWheeler threeWheeler=new ThreeWheeler();
	threeWheeler.start();
	threeWheeler.transportTypes();
	
}
}

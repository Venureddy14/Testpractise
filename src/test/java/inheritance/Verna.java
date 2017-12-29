package inheritance;

public class Verna extends FourWheelers
{
void vernaFeatures(){
	String colour="White";
	int speed=90;
	System.out.println("colour is "+colour+"&&"+"Speed is "+speed);
}
public static void main(String args[]){
	Verna vf=new Verna();
	
	vf.start();
	vf.cars();
	vf.vernaFeatures();
	vf.stop();
	
}
}

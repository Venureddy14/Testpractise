package testCases;

import interfaceAndabstractPractise.Bank;


public class Sbi extends Bank{
	int intrest;
	int principleAmount=5000;
	int time=30;
	int rateofIntrest=4;
	static int total;
	public int rateOfIntrest()
	 {
		 intrest=(principleAmount*time*rateofIntrest)/100;
		 return intrest;
	 }
	public int getdeposits()
	{
		int intrested=rateOfIntrest();
		total=principleAmount+intrested;
		 return total;
	}
public static void main(String args[]){
	Bank bank=new Sbi();
	System.out.println(bank.rateOfIntrest());
	System.out.println(bank.getdeposits());
}
}

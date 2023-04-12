package Abstration;

abstract class Bank{
	abstract int rateOfInterest();
}
class RBI extends Bank{
	int rateOfInterest() {
		return 7;		
	}
}
class SBI extends Bank{
	int rateOfInterest() {
		return 8;		
	}
}
class PNB extends Bank{
	int rateOfInterest() {
		return 9;		
	}
}
class BOB extends Bank{
	int rateOfInterest() {
		return 6;		
	}
}
public class Abstract_eg {
public static void main(String[] args) {
	Bank bank;
	bank=new RBI();
	System.out.println(bank.rateOfInterest());
	
	bank=new SBI();
	System.out.println(bank.rateOfInterest());
	
	bank=new PNB();
	System.out.println(bank.rateOfInterest());
	
	bank=new BOB();
	System.out.println(bank.rateOfInterest());
}
}

package week3.day1.Assignment3;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit");
	}

	public void commondeposit() {

		super.deposit();
	}
	
	public static void main(String[] args) {
		
		AxisBank ob=new AxisBank();
		ob.deposit();
		

	}

}

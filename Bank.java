public class Bank{
	
	 int balance,remaningBalance, set=500;
	 String title;
	 
	
	
	
	public Bank(String tn){
		title = tn;
		balance = set;
	}
	
	public Bank(String tn, int bal){
		title = tn;
		balance = bal;
	}
	
	
	public void printBalance(){
		System.out.println("Balance = " + balance);
	}
	
	public void deposited(int bal){
		System.out.println("You balance deposited");
		balance = bal;
		System.out.println("Balance = " + balance);

		
	}
	
	public void withDraw(int bal){
		System.out.println("You withDraw");
	    remaningBalance = balance - bal;
		System.out.println("Remaining Balance = " + remaningBalance);
	}
	
	
}
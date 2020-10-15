import java.util.Scanner;
public class Account{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your name: ");
		String name = input.nextLine();
		
		Bank nameObject = new Bank(name);
		nameObject.printBalance();
		
		System.out.println("Enter amount to Desposit: ");
		int depoBalance = input.nextInt();
		nameObject.depositBalance(depoBalance);
		
		System.out.println("Enter amount to Withdraw: ");
		int withDraw = input.nextInt();
		nameObject.withDrawBalance(withDraw);
		
	}
}
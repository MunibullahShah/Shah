import java.util.Scanner;
public class AccountClass{
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter your name here ");
		Scanner input = new Scanner(System.in);
		String enter_your_name = input.nextLine();
		Bank obj = new Bank(enter_your_name);
		obj.printBalance();
		System.out.println("Enter Deposite ");
		int db = input.nextInt();
		obj.deposited(db);
		
		System.out.println("Enter withDraw ");
		int wd = input.nextInt();
		obj.withDraw(wd);
		
	}
}
import java.util.Scanner;
public class Table{
	
	public static void main(String[] args){
		
		int number;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number or 0 to exit: ");
		number = scan.nextInt();

		// this loop will run until user enters 0;
		while(number != 0){
			// To print table till x10
			for(int i=1; i<=10; i++)
			{
				System.out.println(number + " X " + i + " = " + (number*i)  );
			}
			
			System.out.println("Enter number or 0 to exit: ");
			number = scan.nextInt();
		}
		
	}
	
}
import java.util.Scanner;
public class Table{
	
	public static void main(String[] args){
		
		int input;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number: ");
		input = in.nextInt();

		while(1==1)
		{
			if(input == 0){
				System.exit(0);
			}
			for(int i=1; i<=10; i++)
			{
				System.out.println(input + " * "+i +" = "+ (input*i));
			}
			
			System.out.println("Enter number again: ");
			input = in.nextInt();
		}
		
	}
	
}
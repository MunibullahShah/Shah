
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int input, flag;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number ");
		input = in.nextInt();
		
			System.out.println("1");
			System.out.println("2");
	
		for(int i=3; i<=input; i++) { 
			flag = 0;
	
			for(int j=2; j<i; j++) { 
				
				if(i%j==0) { 
					flag = 1;
					break;
				}	
			}
			
			if(flag!=1) { 
				System.out.println(i);
			}
		}
		
	}
}

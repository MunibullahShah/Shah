import java.util.*;


public class MainPrice {
	
public static void main(String[] args){

Scanner scanner = new Scanner (System.in);
FuturePrice rateObject = new FuturePrice();

int numberOfYears;
double rateOfInflation, cost;

System.out.print("Enter the current cost of the item = ");
cost = scanner.nextInt();

System.out.print("Enter inflation rate per year = ");
rateOfInflation = (scanner.nextDouble() * .01);

System.out.print("Enter number of years = ");
numberOfYears = scanner.nextInt();

rateObject.calcMethod(cost, numberOfYears, rateOfInflation);



}

}
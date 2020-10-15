public class FuturePrice {
	
public void calcMethod(double cost, int numberOfYears, double rateOfInflation)
{
	
	double solution;
	
	for (int i = 1; i <= numberOfYears ; i++) {
		solution = cost + (rateOfInflation*cost);
		cost = solution;
	}
	
	System.out.printf("Price after %d Years with %.2f%s inflation rate = %.2f",numberOfYears, rateOfInflation/.01,"%", cost );
	
}
}

public class OdometerDriver {

	public static void main(String[] args) {


		Odometer odometer = new Odometer();
		odometer.milesDrive = 120;
		odometer.fuelEfficency = 6;
		
		//setting Odometer to zero miles.
		//odometer.setOdometer();
		
		
		//setting fuelEfficency.
		//odometer.setFuelEfficency(fuelEfficency);
		
		
		System.out.printf("Total %.2f Gallons used at %.2f Fuel Efficency  \n", odometer.getGallons(), odometer.fuelEfficency);
		
		odometer.setFuelEfficency(10);
		System.out.printf("Total %.2f Gallons used at %.2f Fuel Efficency  \n", odometer.getGallons(), odometer.fuelEfficency);
		
		odometer.setFuelEfficency(63);
		System.out.printf("Total %.2f Gallons used at %.2f Fuel Efficency  \n", odometer.getGallons(), odometer.fuelEfficency);
		
		odometer.setFuelEfficency(30);
		System.out.printf("Total %.2f Gallons used at %.2f Fuel Efficency  \n", odometer.getGallons(), odometer.fuelEfficency);


	}

}

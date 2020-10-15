
public class Odometer {
	
	public double milesDrive, fuelEfficency;
	
	public Odometer() {
		
	}
	
	public void setOdometer() {
		milesDrive = 0.0;
	}
	
	public void setFuelEfficency(double fuelEfficency) {
		this.fuelEfficency = fuelEfficency;
	}
	
	public void setTotal(double milesDrive) {
		this.milesDrive += milesDrive;
	}
	
	
	public double getGallons() {
		double gallons = milesDrive/fuelEfficency;
		return gallons;
	}
	
}

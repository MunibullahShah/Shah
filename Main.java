import java.util.*;

public class Main {
    public static void main(String[] args){
        
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\tCalulate Cylinder Area and Volume\n\n");
		
		System.out.println("Enter Height: ");
		double height = input.nextDouble();
		System.out.println("Enter Radius: ");
		double radius = input.nextDouble();
		
		//Cylinder cylinder1 = new Cylinder();
		//Cylinder cylinder2 = new Cylinder(height);
	
		Cylinder cylinder3 = new Cylinder(radius,height);
		
		cylinder3.computeArea();
		cylinder3.computeVolume();
		
		cylinder3.displayInfo();
    }
}
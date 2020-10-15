import java.util.Scanner;

public class TestClass{
    public static void main(String[] args){
        
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter cylinder Height  ");
		double cylinder_h = input.nextDouble();
		System.out.println("Enter cylinder Radius ");
		double cylinder_r = input.nextDouble();
	
		CylinderClass cylinder = new CylinderClass(cylinder_r,cylinder_h);
		
		cylinder.computeArea();
		cylinder.computeVolume();
		cylinder.displayInfo();
    }
}
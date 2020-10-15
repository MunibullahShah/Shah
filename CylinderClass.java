public class CylinderClass{

	
		 double cylinder_radius;
		 double cylinder_height;
		 double cylinder_area;
		 double cylinder_volume;
		 double pi = 3.14;

		
		
		public CylinderClass()
		{
			
		}
		
		public CylinderClass(double h)
		{
			cylinder_height = h;
			cylinder_radius = 1;
		}
		
		public CylinderClass( double r, double h)
		{
			cylinder_radius = r;
			cylinder_height = h;
		}	
	
	
	
	
	
	public void set_Radius(double r)
	{
		cylinder_radius = r;
	}
	
	public void set_Height(double h)
	{
		cylinder_height = h;
	}
	
	
	public double get_Radius()
	{
		return cylinder_radius;
	}
	
	public double get_Height()
	{
		return cylinder_height;
	}
	public void computeVolume()
	{
		cylinder_volume = pi*(cylinder_radius*cylinder_radius)*cylinder_height;
	}
	
	public void computeArea()
	{
		
		cylinder_area = 2*pi*(cylinder_height * cylinder_radius);
	}
	
	public void displayInfo()
	{
		
		System.out.println("Radius of cylinder is  "+ cylinder_radius);
		System.out.println("Height of cylinder is "+ cylinder_height);
		System.out.println("Area of cylinder is "+ cylinder_area);
		System.out.println("Volume of cylinder is  "+ cylinder_volume);
	
	}
	
	
	


}
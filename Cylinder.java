public class Cylinder{


	
		private double radius;
		private double height;
		private double area;
		private double volume;

		
		
		public Cylinder()
		{
			
		}
		
		public Cylinder(double height)
		{
			this.height = height;
			this.radius = 1;
		}
		
		public Cylinder( double radius, double height)
		{
			this.radius = radius;
			this.height = height;
		}	
	
	
	
	
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public void computeArea()
	{
		
		area = 2*3.14*(radius * height);
	}
	
	public void computeVolume()
	{
		volume = 3.14*(radius*radius)*height;
	}
	
	public void displayInfo()
	{
		System.out.println("Height: "+ height);
		System.out.println("Radius: "+ radius);
		System.out.println("Area: "+ area);
		System.out.println("Volume: "+ volume);
	}
	
	
	


}
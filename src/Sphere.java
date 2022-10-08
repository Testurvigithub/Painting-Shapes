
public class Sphere extends Shape
{
	int radius;
	String shapeName = "Shpere";

	public float area() 
	{
		return 4*PI*radius*radius;
	}

	@Override
	public String toString() 
	{
		return  shapeName ;
	}
	
	
}




public class Cylinder extends Shape
{
	int radius;
	int height;
	String shapeName = "Cylinder";
	
	public float area()
	{
		return PI*radius*radius*height;
	}

	@Override
	public String toString() {
		return  shapeName ;
	}
	
	
}


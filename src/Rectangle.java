
public class Rectangle extends Shape
{
	int length;
	int width;
	String shapeName = "Ractangle";
	
	public float area()
	{
		return length*width;
	}

	@Override
	public String toString() {
		return  shapeName;
	}
}




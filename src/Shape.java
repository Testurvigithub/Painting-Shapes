
public abstract class Shape
{
	String shapeName;
	final float PI = 3.14f; 
	
	abstract float area();
	@Override
	public String toString()
	{
		return   shapeName ;
	}
	
	
}
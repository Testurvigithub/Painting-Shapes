
public class Paint   
{
	final float COVERAGE = 350; // 1 unit of paint can cover 350 square-feet area. 
	
	public float amount(Shape s)
	{
		System.out.println("Comput the amount of paint needed for " +s.toString());
		
		return (s.area()/COVERAGE);
	}
}
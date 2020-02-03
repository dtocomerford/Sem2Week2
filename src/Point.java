
public class Point 
{
	double x;
	double y;
	
	void set(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	double distance(Point other)
	{
		double distance = 0;
		
		double result1 = Math.pow(other.x - this.x, 2);
		double result2 = Math.pow(other.y - this.y, 2);
		
		double answer = result1 + result2; 
		
		distance = Math.sqrt(answer);
		
		return distance;
	}

	void add(Point other)
	{
		double answerA = other.x + this.x;
		double answerB = other.y + this.y;
		
	}
	
}

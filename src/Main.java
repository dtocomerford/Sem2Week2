
public class Main {

	public static void main(String[] args) 
	{
		Point a = new Point();
		a.set(4.1, 5.6);
		
		Point b = new Point();
		b.set(9.6, 10.7);
		
		Point c = new Point();
		c.set(105.9, 87.1);
		
		System.out.println("a is " + a.x + " " + a.y);
		System.out.println("b is " + b.x + " " + b.y);
		System.out.println("c is " + c.x + " " + c.y);
		
		Point d = b;
		//d.set(5.2, 10.9);
		
		System.out.println();
		
		
		System.out.println(a.distance(b));
		
	}
	
	

}

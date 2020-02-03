
public class Bar {

	public static void main(String[] args) 
	{
		Foo f = new Foo();
		f.x = 42;
		f.y = 9;
		f.same();
		
		System.out.println(f.sum());
		System.out.println(f.difference());
		
		Foo g = new Foo();
		g.x = 16;
		g.y = 33;
		g.same();
		System.out.println(g.sum());
	}
}

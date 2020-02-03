import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SetTest {

	@Test
	void test() 
	{
		Point a = new Point();
		Point b = new Point();
		
		a.set(4.1, 5.6);
		b.set(9.6, 10.7);
		
		assertEquals(7.500666637039671, a.distance(b));
		
		//fail("Not yet implemented");
	}

}

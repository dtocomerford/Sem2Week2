
public class Colour {

	int red;
	int green;
	int blue;
	
	Colour(int _red, int _green, int _blue)
	{
		red = _red;
		green = _green;
		blue = _blue;
	}
	
	Colour(String input)
	{
		if(input.contentEquals("black"))
		{
			red =0;
			green =0;
			blue = 0;
		}
		if(input.contentEquals("red"))
		{
			red =255;
			green =0;
			blue = 0;
		}
		if(input.contentEquals("green"))
		{
			red =0;
			green =255;
			blue = 0;
		}
		if(input.contentEquals("blue"))
		{
			red =0;
			green =0;
			blue = 255;
		}
		if(input.contentEquals("white"))
		{
			red =255;
			green =255;
			blue = 255;
		}
		
		
	}
	
	void darker()
	{
		this.red *= 0.8;
		this.green *= 0.8;
		this.blue *= 0.8;
		
	}
	
	void lighter()
	{
		this.red *= 1.2;
		this.green *= 1.2;
		this.blue *= 1.2;
	}
	
	
	
}


public class Time 
{
	int hour;
	int minute;

	Time(int _hour, int _minute	)
	{
		hour = _hour;
		minute = _minute;
		
	}
	
	void addMinutes(int _minute)
	{
		
		minute = _minute;
		
		if(minute >= 60)
		{
			hour++;
			minute = minute + _minute - 60;
		}
	}
	
	void addTime(Time other)
	{
		this.hour += other.hour;
		this.minute += other.minute;
		
		if(minute >= 60)
		{
			hour++;
			this.minute = this.minute + other.minute - 60;
		}
		 
	}
	
	void subtractTime(Time other)
	{
		this.hour -= other.hour;
		this.minute -= other.minute;
		
		if(minute < other.minute)
		{
			hour--;
			minute = 60;
			minute -= other.minute;
		}
	}
	
	String _toString()
	{
		String answer = Integer.toString(this.hour);
		if(this.hour < 10)
		{
			answer = "0" + answer + ":" + Integer.toString(this.minute);
		}
		else
		{
			
			answer = answer + ":" + Integer.toString(this.minute);
			
		}
		return answer;
	}
	
}

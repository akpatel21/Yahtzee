import java.util.Random;

public class Die 
{
	Random rand = new Random();
	private int value;
	
	public Die()
	{
		value = 0;
	}
	
	public int roll()
	{
		value = rand.nextInt(6) + 1;
		return value;
	}
	
	public int getValue()
	{
		return value;
	}
	
}

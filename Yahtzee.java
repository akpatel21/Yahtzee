
public class Yahtzee 
{
	private Die[] dice;
	
	public Yahtzee()
	{
		dice = new Die[5];
		
		for(int i = 0; i < 5; i++)
			dice[i] = new Die();
	}
	
	public void rollAllDice()
	{
		for(int i = 0; i < 5; i++)
			dice[i] = new Die();
	}
	
	public void rollADice(int dieNumber)
	{
		
	}
	
	public int getADie(int dieNumber)
	{
		
	}
	
	public String showDice()
	{
		
	}
}

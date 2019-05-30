
public class Yahtzee 
{
	Die die = new Die();
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
			dice[i].roll();
	}
	
	public void rollADice(int dieNumber)
	{
		dice[dieNumber - 1].roll();
	}
	
	public int getADie(int dieNumber)
	{
		return dice[dieNumber - 1].getValue();
	}
	
	public String showDice()
	{
		return "+------+---+---+---+---+---+\n| Dice | 1 | 2 | 3 | 4 | 5 |\n+------+---+---+---+---+---+\n| Face | " + dice[0].getValue() + " | " + dice[1].getValue() + " | " + dice[2].getValue() + " | " + dice[3].getValue() + " | " + dice[4].getValue() + " |\n+------+---+---+---+---+---+";
	}
}

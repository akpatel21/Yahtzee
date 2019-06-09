
public class Yahtzee 
{
	Die die = new Die();
	private Die[] dice;
	private int[] count;
	
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
		updateCount();
	}
	
	public void rollADie(int dieNumber)
	{
		dice[dieNumber - 1].roll();
		updateCount();
	}
	
	public int getADie(int dieNumber)
	{
		return dice[dieNumber - 1].getValue();
	}
	
	public String showDice()
	{
		return "+------+---+---+---+---+---+\n| Dice | 1 | 2 | 3 | 4 | 5 |\n+------+---+---+---+---+---+\n| Face | " + dice[0].getValue() + " | " + dice[1].getValue() + " | " + dice[2].getValue() + " | " + dice[3].getValue() + " | " + dice[4].getValue() + " |\n+------+---+---+---+---+---+";
	}
	
	private int countUp(int value)
	{
		int num = 0;
		for(int i = 0; i < 5; i++)
		{
			if(dice[i].getValue() == value)
			{
				num++;
			}
		}
		return num;
	}
	
	private void updateCount()
	{
		count = new int[6];
		for(int i = 0; i < 6; i++)
		{
			count[i] = countUp(i + 1);
		}
	}
	
	public int getScoreOnes()
	{
		return count[0];
	}
	
	public int getScoreTwos()
	{
		return 2 * count[1];
	}
	
	public int getScoreThrees()
	{
		return 3 * count[2];
	}
	
	public int getScoreFours()
	{
		return 4 * count[3];
	}
	
	public int getScoreFives()
	{
		return 5 * count[4];
	}
	
	public int getScoreSixes()
	{
		return 6 * count[5];
	}
	
	public int getScoreThreeOfAKind()
	{
		for(int i = 0; i < 6; i++)
		{
			if(count[i] >= 3)
			{
				return getScoreOnes() + getScoreTwos() + getScoreThrees() + getScoreFours() + getScoreFives() + getScoreSixes();
			}
		}
		return 0;
	}
	
	public int getScoreFourOfAKind()
	{
		for(int i = 0; i < 6; i++)
		{
			if(count[i] >= 4)
			{
				return getScoreOnes() + getScoreTwos() + getScoreThrees() + getScoreFours() + getScoreFives() + getScoreSixes();
			}
		}
		return 0;
	}
	
	public int getScoreFullHouse()
	{
		for(int i = 0; i < 6; i++)
		{
			if(count[i] != 3)
			{
				return 0;
			}
			if(count[i] != 2)
			{
				return 0;
			}
		}
		return 25;
	}
	
	public int getScoreSmallStraight()
	{
		for(int i = 1; i < 3; i++)
		{
			if(dice[i].getValue() - dice[i + 1].getValue() != 1 && dice[i].getValue() - dice[i + 1].getValue() != -1)
			{
				return 0;
			}
		}
		
		if(dice[0].getValue() - dice[1].getValue() == 1 || dice[0].getValue() - dice[1].getValue() == -1)
		{
			return 30;
		}
		else if(dice[3].getValue() - dice[4].getValue() == 1 || dice[3].getValue() - dice[4].getValue() == -1)
		{
			return 30;
		}
		else
		{
			return 0;
		}
	}
	
	public int getScoreLargeStraight()
	{
		for(int i = 0; i < 4; i++)
		{
			if(dice[i].getValue() - dice[i + 1].getValue() != 1 && dice[i].getValue() - dice[i + 1].getValue() != -1)
			{
				return 0;
			}
		}
		return 40;
	}
	
	public int getScoreChance()
	{
		return getScoreOnes() + getScoreTwos() + getScoreThrees() + getScoreFours() + getScoreFives() + getScoreSixes();
	}
	
	public int getScoreYahtzee()
	{
		for(int i = 0; i < 6; i++)
		{
			if(count[i] == 5)
			{
				return 50;
			}
		}
		return 0;
	}
	
	public String getScoreCard()
	{
		return showDice() + "\n\n           Ones: " + getScoreOnes() + "\n           Twos: " + getScoreTwos() + "\n         Threes: " + getScoreThrees() + "\n          Fours: " + getScoreFours() + "\n          Fives: " + getScoreFives() + "\n          Sixes: " + getScoreSixes() + "\n\nThree of A Kind: " + getScoreThreeOfAKind() + "\n Four of A Kind: " + getScoreFourOfAKind() + "\n     Full House: " + getScoreFullHouse() + "\n Small Straight: " + getScoreSmallStraight() + "\n Large Straight: " + getScoreLargeStraight() + "\n         Chance: " + getScoreChance() + "\n        Yahtzee: " + getScoreYahtzee();
	}
}

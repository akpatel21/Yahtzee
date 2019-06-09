import java.util.Scanner;

public class YahtzeeGame 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Yahtzee yahtzee = new Yahtzee();
		yahtzee.rollAllDice();
		System.out.println(yahtzee.getScoreCard());
		System.out.print("Enter die number(s) to keep (separated by a space): ");
		String userKeep = scan.nextLine();
		if(!userKeep.contains("1"))
		{
			yahtzee.rollADie(1);
		}
		if(!userKeep.contains("2"))
		{
			yahtzee.rollADie(2);
		}
		if(!userKeep.contains("3"))
		{
			yahtzee.rollADie(3);
		}
		if(!userKeep.contains("4"))
		{
			yahtzee.rollADie(4);
		}
		if(!userKeep.contains("5"))
		{
			yahtzee.rollADie(5);
		}
		System.out.println(yahtzee.getScoreCard());
		System.out.print("Enter die number(s) to keep (separated by a space): ");
		userKeep = scan.nextLine();
		if(!userKeep.contains("1"))
		{
			yahtzee.rollADie(1);
		}
		if(!userKeep.contains("2"))
		{
			yahtzee.rollADie(2);
		}
		if(!userKeep.contains("3"))
		{
			yahtzee.rollADie(3);
		}
		if(!userKeep.contains("4"))
		{
			yahtzee.rollADie(4);
		}
		if(!userKeep.contains("5"))
		{
			yahtzee.rollADie(5);
		}
		System.out.print(yahtzee.getScoreCard());
	}

}

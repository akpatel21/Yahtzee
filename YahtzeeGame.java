
public class YahtzeeGame 
{

	public static void main(String[] args) 
	{
		Die d = new Die();
		
		for(int i = 0; i < 10; i++)
			System.out.println("roll(): " + d.roll());
			
		System.out.println("getValue(): " + d.getValue());
		
		Yahtzee yahtzee = new Yahtzee();
		yahtzee.rollAllDice();
		System.out.println(yahtzee.showDice());
		System.out.println("Get value of die number 3 is " + yahtzee.getADie(3));
		System.out.println(yahtzee.getADie(3));
		System.out.println(yahtzee.showDice());
		System.out.println("After re-roll the die number 3: " + yahtzee.getADie(3));
	}

}

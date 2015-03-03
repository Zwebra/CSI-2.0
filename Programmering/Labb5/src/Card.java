public class Card
{
	private String rank;
	private String suit;
/*Constructor for objects of class Card. Each card has a
rank and a suit. No checks are made for invalid values */
	public Card(int valor, int farg){
		if(farg == 0)
		{
			suit = "Spades";
		}
		else if(farg == 1)
		{	
			suit = "Diamonds";
		}
		else if(farg ==2)
		{
			suit = "Clubs";}
		else
		{
			suit = "Hearts";
		}
// must convert the integer value of rank to an appropriate String
		if (valor == 1)
		{
			rank = "Ace";
		}
		else if (valor == 11)
		{
			rank = "Jack";
		}
		else if (valor == 12)
		{
			rank = "Queen";
		}
		else if (valor == 13)
		{
			rank = "King";
		}	
		else
		{
			rank = "" + valor;
		}
}
	public String getSuit()
	{
		return suit;
	}

	public int getRank()
	{
		if (rank.equals( "Ace"))
		{
			return 1;
		}
		else if (rank.equals( "Jack"))
		{
			return 11;
		}
		else if (rank.equals( "Queen")){
			return 12;
		}
		else if (rank.equals( "King"))
		{
			return 13;
		}
		else
		{
			return Integer.parseInt(rank);
		}
}
	public String toString()
	{
		return rank+ " " +suit;
	}
}
import java.util.Random;

public class CardGen {

	public static void main(String [] args){
		
		Random rng = new Random();
		Card card1 = new Card(rng.nextInt(13)+1, rng.nextInt(4));
		Card card2 = new Card(rng.nextInt(13)+1, rng.nextInt(4));
		Card card3 = new Card(rng.nextInt(13)+1, rng.nextInt(4));
		Card card4 = new Card(rng.nextInt(13)+1, rng.nextInt(4));
		Card card5 = new Card(rng.nextInt(13)+1, rng.nextInt(4));
		
		System.out.println("First card is " + card1.toString());
		System.out.println("Second card is " + card2.toString());
		System.out.println("Third card is " + card3.toString());
		System.out.println("Fourth card is " + card4.toString());
		System.out.println("Fith card is " + card5.toString());
	}

}

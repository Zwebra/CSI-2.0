import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class BlackJack3 
{
	public static void main (String [] args)
	{
		
		Card [] deck = new Card [52];
		String [] p1 = new String [10];
		String [] p2 = new String [10];
		
		
		fillArray(deck);
		printArray(deck);
		shuffle(deck);
		System.out.println("\n\n\n");
		printArray(deck);

		
	}
	
	public static void fillArray(Card []array)
	{
		
		Random rng = new Random();
		
		for(int i = 0; i<array.length; i++)
		{
			
			Card newcard = new Card(rng.nextInt(13)+1, rng.nextInt(4));
			
				while(search(array, newcard))
				{
					newcard = new Card(rng.nextInt(13)+1, rng.nextInt(4));
				}
				
				array[i]= newcard;
		}
	}
	
	public static void printArray(Card[] deck)
	{
		
		for(int i = 0; i < deck.length;i++)
		{
		System.out.println(deck[i]);
		}
		
	}
	
	public static boolean search(Card[] array, Card x)
	{	
		for(int i = 0;i < array.length - 1;i++)
		{	
			if(array[i] == null)
			{
				return false;
			}else{
			String deckcard = array[i].toString();
			String newcard = x.toString();
			
				if (deckcard.matches(newcard))
				{
				return true;
				}
			}
		}
		return false;


	}
	
	public static void shuffle(Card[] deck){
		
		Collections.shuffle(Arrays.asList(deck));
		
	}

}

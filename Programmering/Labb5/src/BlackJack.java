import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class BlackJack {

	private static int bet;
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		Card [] deck = new Card [52];
		Card [] p1 = new Card [8];
		Card [] p2 = new Card [8];
		
		int deckcounter = 0;
		int p1counter = 0;
		int p2counter = 0;
		
		
		fillArray(deck);
		System.out.println("Hello and welcome to Black Jack!\n********************************\n");
		
		
	boolean again = true;

	while(again=true){	
		bet = 0;
		System.out.println("How much would you like to bet? Betting 0 will end the game.");
		bet = input.nextInt();
		if(bet == 0){
			System.out.println("Game over!");
			break;
		}
		
		
		resetArray(p1);
		resetArray(p2);
		shuffle(deck);
		while(deckcounter < 4){
			p1[p1counter] = deck[deckcounter];
			deckcounter++;
			p1counter++;
				
			p2[p2counter] = deck[deckcounter];
			deckcounter++;
			p2counter++;
		}
		

		System.out.println("*******Your current hand********");
		System.out.println( p1[0] + ", " + p1[1] +"\n********************************" );
		
		boolean run = true;
		while(run == true){
			System.out.println("\nChoose an action:");
			System.out.println("1. Hit me.");
			System.out.println("2. Stop.");
			
			int n =  input.nextInt();
			switch(n){
			
			case 1: System.out.println("You've made your choice, may rngJesus be with you! \n");
					p1[p1counter] = deck[deckcounter];
					deckcounter++;
					p1counter++;
					System.out.println("*******Your current hand********");
					printArray(p1);

				break;
			case 2: run=false;
				break;
			
			
			default: System.out.println("Error Error Error!");
			
			
			}		
		}
		

		run=true;
		
		while(run == true){

			if (sumCard(p2)>= 17){
				run=false;
			}else{
				p2[p2counter] = deck[deckcounter];
				deckcounter++;
				p2counter++;
			}
		}

		winner(p1,p2);
		
		
		System.out.println("Wanna play again? (Yes/No)"); // Frågar om användar vill spela igen om svaret är "yes" så nollställs deck/p1/p2counter till noll.
		String answer = input.next();
		answer = answer.toUpperCase();
		if(answer.matches("NO")){
			again=false;
		}else{
			deckcounter = 0;
			p1counter = 0;
			p2counter = 0;
		}

		
		}
		input.close();
	}
	
	public static void fillArray(Card []array){
		Random rng = new Random();
			
		for(int i = 0; i< array.length;i++){
			
			Card newcard = new Card(rng.nextInt(13)+1, rng.nextInt(4));
			
				while(search(array, newcard)){
					newcard = new Card(rng.nextInt(13)+1, rng.nextInt(4));
				}
				array[i]= newcard;  
				
			
		}	
	}
	
	public static void resetArray(Card []array){
		
		for(int i = 0; i <= 7;i++){
			
			array[i]=null;
			
		}
		
	}
	
	public static void printArray(Card [] array ){
		for(int i=0; i<array.length;i++){
			if(array[i] == null){
				break;
			}else{
			System.out.print(array[i] + ", ");
			}
		}
		System.out.println("\n********************************");
	}

	public static boolean search(Card []array, Card x){

		
		
			for(int i = 0; i  < array.length - 1; i++){
				

				
				if(array[i] ==null){
					return false;
				}else{
					String one = array[i].toString();
					String two = x.toString();
					
					if(one.matches(two)){
					return true;
					}
				}
			}return false;

	}
	
	public static void shuffle(Card[]array){
		
		Collections.shuffle(Arrays.asList(array));
		
	}

	public static int sumCard(Card [] array){
		
		int sum = 0;
		
		for(int i = 0; i < array.length -1; i++){
			if(array[i]== null){
				break;
			}else{
				int card = array[i].getRank();
				
				sum = sum +  card;
				
			}
		}

		return sum;
		
	}
	
	public static void winner(Card [] player, Card [] computer){
		
		int playersum = 0;
		int computersum = 0;
		
		for(int i =0; i < player.length -1;i++){
			if(player[i]== null){
				break;
			}else{
				int card = player[i].getRank();

				playersum = playersum +  card;
				

			}
		}

		
		for(int i =0; i < computer.length -1;i++){
			if(computer[i]==null){
				break;
			}else{
			int card = computer[i].getRank();
			
			computersum = computersum +  card;
			
			
			}
		}

		if(computersum >= playersum && computersum <= 21){
			System.out.println("The bank wins with a score of " +  computersum + ".");
		}else if( playersum <= 21){
			System.out.println("You win with a score of " +  playersum + ".");
			System.out.println("Congratulations you won " + bet*2 +"$.");
		}else{
			System.out.println("Both got fat");
		}
	}
}



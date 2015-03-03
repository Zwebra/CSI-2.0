import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class BlackJack2 {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		Card [] deck = new Card [52];
		Card [] p1 = new Card [10];
		Card [] p2 = new Card [10];
		
		int deckcounter = 0;
		int p1counter = 0;
		int p2counter = 0;
		
		
		fillArray(deck);
		System.out.println("Hello and welcome to Black Jack!\n********************************\n");
		
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
			System.out.println("Choose an action:");
			System.out.println("1. Hit");
			System.out.println("2. Stop");
			
			int n =  input.nextInt();
			switch(n){
			
			case 1: System.out.println("You've made your choice, may rngJesus be with you! ");
					p1[p1counter] = deck[deckcounter];
					deckcounter++;
					p1counter++;
				break;
			case 2: run=false;
				break;
			
			
			default: System.out.println("Error Error Error!");
			
			
			}		
		}
		
		winner(p1,p2);
		run=true;
		while(run == true){
		
			int n =  input.nextInt();
			switch(n){
			
			case 1: 
					p2[p2counter] = deck[deckcounter];
					deckcounter++;
					p2counter++;
				break;
			case 2: run=false;
				break;				
			}		
		} 
		
		
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
	
	public static void printArray(Card [] array ){
		for(int i=0; i<array.length;i++){
			
			System.out.println(array[i]);

		}	
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
		System.out.println("Player score:" + playersum);
		System.out.println("Computer Score:" + computersum);
	}
}



import java.util.Scanner;
public class GameProgram {
	
	public static void main(String[] args){
		//Variabler
		String GamerOne, GamerTwo;
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Gamers
		
		
		System.out.println("Write the first Gamers name: ");
			GamerOne = input.nextLine();
		Gamer Gamer1 = new Gamer(GamerOne);
			
		System.out.println("Write the second Gamers name: ");
			GamerTwo = input.nextLine();
		Gamer Gamer2 = new Gamer(GamerTwo);
		
		//mer Variabler
		int dice = 0;
		int rounds = 0;
		int winsp1 = 0;
		int winsp2 = 0;
		while(rounds < 3){
			 playerOne(dice, GamerOne, Gamer1, input);
			 playerTwo(dice, GamerTwo, Gamer2, input);
			 if(Gamer1.getPoints() == Gamer2.getPoints()){
				 System.out.println("dont blame the game, but you tied");
			 }
			 
			 if(Gamer1.getPoints()>Gamer2.getPoints() && Gamer1.getPoints()<22){
				 System.out.println("Player one wins the round!");
				 winsp1++;
			 }
			 
			 
			 if(Gamer2.getPoints()>Gamer1.getPoints() && Gamer2.getPoints()<22){
				 System.out.println("player two wins the round!");
				 winsp2++;
			 }
			 rounds++;
			 System.out.println("This was round " + rounds);
			 Gamer1.reset();
			 Gamer2.reset();
			 
		}
		
		if(winsp1>winsp2){
			System.out.println("Player one wins! You won a total of: " + winsp1 + " rounds!");
		}else{
			System.out.println("Player two wins! You won a total of: " + winsp2 + " rounds!");
		}

	}	
	//Player one!
	public static int playerOne(int dice,String GamerOne, Gamer Gamer1, Scanner input){
		
		String Answer;
		
		
		// For loop för spelare 1.
		for (int i=1; i<4; i++)
		{
			
			System.out.println("How many dices do you want to throw "+ GamerOne +"?");
			
			dice = input.nextInt();
			Gamer1.play(dice);
			
			System.out.println("This was your " +i+ " throw");
			System.out.println("You got "+Gamer1.getPoints()+" points this round");
			
			if(Gamer1.getPoints()>22){
				System.out.println("You are Fat!");
				break;
			}
			
			if(Gamer1.getPoints()==21){
				System.out.println("DING DING DING \n YOU WON!");
			}
			
			if (i < 3){
				System.out.println("Do you want to play again Y/N");
			}
			
			Answer = input.next();
			
			if(Answer.matches("[Yy]")){
				System.out.println("Here we go again!");
			}else{
				System.out.println("Okay! Your finally score is " + Gamer1.getPoints());
				break;
			}
			
		}
		
		return dice;
		
	}
	//Player two!
	public static int playerTwo(int dice,String GamerTwo, Gamer Gamer2, Scanner input){
		
		String Answer;
		
		
		// For loop för spelare 1.
		for (int i=1; i<4; i++)
		{
			
			System.out.println("How many dices do you want to throw "+ GamerTwo +"?");
			
			dice = input.nextInt();
			Gamer2.play(dice);
			
			System.out.println("This was your " +i+ " throw");
			System.out.println("You got "+Gamer2.getPoints()+" points this round");
			
			if(Gamer2.getPoints()>22){
				System.out.println("You are Fat!");
				break;
			}
			
			if(Gamer2.getPoints()==21){
				System.out.println("DING DING DING \n YOU WON!");
			}
			
			if (i < 3){
				System.out.println("Do you want to play again Y/N");
			}
			
			Answer = input.next();
			
			if(Answer.matches("[Yy]")){
				System.out.println("Here we go again!");
			}else{
				System.out.println("Okay! Your finally score is " + Gamer2.getPoints());
				break;
			}
			
		}
		
		return dice;
		
	}
	
}


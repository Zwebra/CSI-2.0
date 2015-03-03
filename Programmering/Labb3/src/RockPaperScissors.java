import java.util.*;
public class RockPaperScissors {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		 String personPlay; //User's play -- "R", "P", or "S"
		 System.out.println("Rock, paper and scissor? (R, P, S)");
		 personPlay = input.nextLine();
		 String computerPlay = "0"; 
		 int computerInt = rand.nextInt(3); 
		 switch (computerInt){
		 case 0: computerPlay = "R";
		 	break;
		 case 1: computerPlay = "P";
		 	break;
		 case 2: computerPlay = "S";
		 	break;
		 }
		 System.out.println("The computer played " + computerPlay);
		 if (personPlay.equals(computerPlay)){
			 System.out.println("It's a tie!");
		 }
		 else if (personPlay.equals("R")){
			 if (computerPlay.equals("S")){
				 System.out.println("Rock crushes scissors. You win!!");
			 }
			 else{
				 System.out.println("Paper beats rock. You lose!");
			 }
		 }
		 else if(personPlay.equals("S")){
			 if(computerPlay.equals("R")){
				 System.out.println("Rock crushes scissors. You lose!!");
			 }
			 else{
				 System.out.println("Scissors cuts paper. You win!!");
			 }
		 }
		 else if(personPlay.equals("P")){
			 if(computerPlay.equals("S")){
				 System.out.println("Scissors cuts paper. You lose!!");
			 }
			 else{
				 System.out.println("Paper catches rock. You win!!");
			 }
		 }
		

	}
}

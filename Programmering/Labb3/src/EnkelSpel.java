import java.util.Random;
import java.util.Scanner;

public class EnkelSpel {

	public static void main(String[]args){


		
		Random slumpare = new Random();
		Scanner input=new Scanner(System.in);
		
		int tal;
		int mintal;
		int counter=0;
		
		tal = slumpare.nextInt(6)+1;

		
		System.out.println("gissa r�tt din j�vel");
			mintal = input.nextInt();
			
		while (tal != mintal){
			System.out.println("FEL, DU SUGER!");
			System.out.println("gissa r�tt din j�vel haha");
			mintal = input.nextInt();
			
			counter++;
		}

		System.out.println("r�tt ditt svin! Det tog bara " + counter + " f�rs�k!");

	}
}

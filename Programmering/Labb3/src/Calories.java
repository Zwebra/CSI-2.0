import java.util.Scanner;

public class Calories {

	public static void main(String [] args){
		Scanner input=new Scanner (System.in);
		final int run = 10, bask = 8, sleep = 1;
		System.out.print("Skriv in din vikt: ");
		double kilo = input.nextInt();
		System.out.print("Mata in hur l�nge du l�per: ");
		double loper = input.nextInt();
		System.out.print("Mata in hur l�nge du spelar basket");
		double basket = input.nextInt();
		System.out.print("Mata hur m�nga timmar du sover (i timmar): ");
		double sover = input.nextInt();
		sover = sover*60;
		double kalorier;
		kalorier = (0.0175*run*kilo)*loper;
		
		kalorier += (0.0175*bask*kilo)*basket;
	
		kalorier += (0.0175*sleep*kilo)*sover;
		System.out.println("Totalt antal kalorier som br�nnts: "+kalorier);
		input.close();

		
	}
}

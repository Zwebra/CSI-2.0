import java.util.Scanner;

public class Invest {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double money;
		int ranta, NrAr;
		
		System.out.println("Hur mycket pengar har du l�nat?");
			money = input.nextDouble();
			
		System.out.println("Vilken r�nta?");
			ranta = input.nextInt();
			
		System.out.println("Hur m�nga �r?");
			NrAr = input.nextInt();
			
		double calc = money * Math.pow((1 + ranta/100.0), NrAr);
		
		System.out.println((int)calc + " calc");

		
		
	}

}

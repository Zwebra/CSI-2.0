import java.util.Scanner;

public class BuyHouse {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double money;
		int ranta, NrAr;
		
		System.out.println("Hur mycket pengar har du lånat?");
			money = input.nextDouble();
				
		System.out.println("Vilken ränta?");
			ranta = input.nextInt();
				
		System.out.println("Hur många år?");
			NrAr = input.nextInt();
				
		calculateLoan(money, ranta, NrAr);
		
			
		}
	public static double calculateLoan( double money, int ranta, 
			int NrAr)
			{
		double calc = money * Math.pow((1 + ranta/100.0), NrAr);
		
		System.out.println((int)calc + " calc");
		
		return calc;
			}
	
	}

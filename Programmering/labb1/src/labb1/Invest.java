package labb1;
import java.util.*;
public class Invest {
	public static void main (String []args){
		Scanner input = new Scanner(System.in);
		
	
		double P,R,N;

		double sum;
		
		System.out.println("Ange storleken på din investering: (sek)");
		P = input.nextInt();
		
		System.out.println("Ange hur länge du har tänkt att låta din investering växa: (år)");		
		N = input.nextInt();
		
		System.out.println("Ange räntan på din investeringen: (procent)");
		R = input.nextDouble();
		
		sum = P * Math.pow((1+ R/100.0), N );
		
		System.out.println((int)sum  + "kr.");
		input.close();	
	}
}

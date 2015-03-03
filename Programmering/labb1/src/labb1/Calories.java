package labb1;
import java.util.*;
public class Calories {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		double weight, aktivf, aktivs, aktivt, calories;
		final int run = 10;
		final int basket = 8;
		final int sleep = 1;
		
		
		System.out.println("Ange din vikt?");
		weight = input.nextDouble();
		System.out.println("Ange längden på din längden på din löprunda (min):");
		aktivf = input.nextDouble();
		System.out.println("Ange längden på din basketmatch (min):");
		aktivs = input.nextDouble();
		System.out.println("Ange hur länge du sov (min):");
		aktivt = input.nextDouble();
		input.close();	
		calories = (0.0175 * run * weight) * aktivf;
		calories += (0.0175 * basket * weight) * aktivs;
		calories += (0.0175 * sleep * weight) * aktivt;
		System.out.println(calories);
	}
	
}

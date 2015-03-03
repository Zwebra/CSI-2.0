package uppgifterurboken;
import java.util.Scanner;
public class Chaptertwo {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		double firstnumber;
		double secondnumber;
		
		double sum;
		/*
		double diff;
		double prod;
		/*
		System.out.print("First number: ");
			firstnumber = keyboard.nextDouble();
			
		System.out.print("Second number: ");
			secondnumber = keyboard.nextDouble();
			
		sum = firstnumber + secondnumber;
		diff = firstnumber - secondnumber;
		prod = firstnumber * secondnumber;
		
		System.out.println("Summan av talen är " + sum + ", diffen är " + diff + " proden är " + prod);
		*/
		
		System.out.println("tempen i F: ");
			firstnumber = keyboard.nextDouble();
			
		sum = ((firstnumber - 32) * 5)	/ 9;
		
		System.out.println(firstnumber + " grader i F är " + sum + " grader C.");
		
		
		
		
		
		
	}

}

package labb1;
import java.util.Scanner;

public class TimeFirst {
	public static void main (String[]args){
		
			Scanner input = new Scanner(System.in);
			int hr, min, sec, total;
			System.out.println("Skriv in hur m�nga timmar?");
			hr = input.nextInt();
			System.out.println("Skriv in hur m�nga minuter?");
			min = input.nextInt();			
			System.out.println("Skriv in hur m�nga sekunder?");
			sec = input.nextInt();
			
			input.close();
			
			total = hr * 3600 + min * 60 + sec;
			System.out.println("Antal sekunder:" + total + "s.");
	}
}

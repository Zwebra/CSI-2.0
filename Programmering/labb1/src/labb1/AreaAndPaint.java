package labb1;

import java.util.Scanner;
public class AreaAndPaint{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		final int coverage = 3;
		int fside;
		int sside;
	
		System.out.println("Ange l�ngd p� f�rsta sidan:");
		fside = input.nextInt();
		System.out.println("Ange l�ngd p� andra sidan:");
		sside = input.nextInt();
		
		input.close();
		
		int area = fside * sside;
		int paint = area / coverage;
		
		System.out.println("Du beh�ver " + paint + " liter m�larf�rg.");
	}
}
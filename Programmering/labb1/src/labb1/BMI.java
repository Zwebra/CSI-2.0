package labb1;

import java.util.Scanner;
public class BMI {
	public static void main(String []args){
		try(Scanner input = new Scanner(System.in)){
		double height;
		int weight;
		
		System.out.println("Ange din vikt:");
		weight = input.nextInt();
		System.out.println("Ange din längd(m)");
		height = input.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("Ditt bmi är " + bmi + ".");
		
		if (bmi >= 25){
			System.out.println("Tjockis!");}
		else { 
			System.out.println("Du är en fullt normal hälsosam person!");
		}
		}

	}
}

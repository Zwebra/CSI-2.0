package labb1;

import java.util.Scanner;
public class Rea {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		int price;
		double sale;
		double percent;
		double sum;
		
		System.out.println("Skriv priset h�r:");
		price = input.nextInt();
		System.out.println("Skriv rea procent h�r:");
		sale = input.nextDouble();
		
		percent = 1 - (sale / 100);
		sum = percent * price;
		
		System.out.println("Det nya priset blir:" + sum + " kr.");
		input.close();	
		
	}
}











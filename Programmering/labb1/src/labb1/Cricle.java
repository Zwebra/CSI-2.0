package labb1;
import java.util.Scanner;

public class Cricle {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;
		int radius;
		System.out.println("Ange circlens radie:");
		radius = input.nextInt();
		input.close();
		double area = PI * radius * radius;
		System.out.println("The area of the cricle with radien " + radius + " har arean " + area );
	}
}

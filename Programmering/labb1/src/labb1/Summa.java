package labb1;
import java.util.Scanner;

public class Summa {
	public static void main(String []args){
		Scanner keyboard = new Scanner(System.in);
		int age;
		String name;
		System.out.println("Vad heter du?");
		name = keyboard.nextLine();
		System.out.println("Hur gammal är du?");
		age = keyboard.nextInt();
		keyboard.close();
		
		System.out.println("Så, ditt namn är " + name + " och du är " + age + " år gammal." );
		
	}
}

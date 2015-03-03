import java.util.Scanner;
import java.util.Random;


public class CardGame {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Random rng = new Random();
		
		int [] talen = new int [5];
		int [] random = new int [100];
		
		talen [0] = 10; talen[1] = 17; talen[3] = 6;
		
		for(int i=0; i<random.length; i++){
			random[i] = rng.nextInt(100);
			System.out.println(random[i]);
		}
		
		/*for(int i=0; i<talen.length; i++){
			System.out.println(talen[i]);
		}*/
		/*
		System.out.println(talen[0]+ " " + talen[1] + " "+ talen[2] +" " + talen[3]);
		*/
	}
}

import java.util.*;


public class RandomDemo {

	public static void main(String [] args){
		
		Random randomno = new Random();
			System.out.println("Next int value: " + randomno.nextInt(100));
		
		int tarning = randomno.nextInt((6)+1);
			System.out.println(tarning);
				
	}
}
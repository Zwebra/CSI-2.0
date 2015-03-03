import java.util.Random;
public class RollingDice {
	public static void main(String [] args){
		
		Random randomNo = new Random();
		
		int t1 = randomNo.nextInt(6)+1;
		int t2 = randomNo.nextInt(6)+1;
		
		System.out.println("dina två tärning slog: " + t1 + " och " + t2);
		System.out.println("tillsamans ger det: " + (t1 + t2));
		
		
	}

}

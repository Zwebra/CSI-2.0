package labb1;
import java.util.*;
public class RandomDem{
	public static void main(String args []){
		Random randomno = new Random();
		int tarning = randomno.nextInt(6) + 1;
		System.out.println("Du slog en " + tarning + ".");
		 
	}

}

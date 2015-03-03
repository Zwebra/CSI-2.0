import java.util.*;

public class Lotto {
	
	public static void main(String[]args){
		
		System.out.println("DAGS FÖR LOTTO!");
		
		Random rng = new Random();
		Scanner input = new Scanner(System.in);
		
		int rights = 0;
		
		int [] lotto_rad = new int [7];
		
		for(int i=0; i<lotto_rad.length; i++){
			System.out.println(" Skriv ett Lottonummer ");
			lotto_rad[i] = input.nextInt();
		}
		
		printArray(lotto_rad);
		
		int [] lotteri = new int [15];
		
		fillArray(lotteri, 36);
		System.out.println();
		printArray(lotteri);

		
	}
	
	public static void printArray(int [] array){
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i] + "");
		}
	}
	
	public static boolean search (int [] array, int x){
		for (int i=0; i<array.length; i++){
			if(array[i] == x);
			return true;
		}
		return false;
	}
	
	public static void fillArray(int [] array, int max){
		Random rng= new Random();
		
		for(int i = 0; i<array.length; i++){
			array[i] = rng.nextInt(max);
		}
		
		
	}

}

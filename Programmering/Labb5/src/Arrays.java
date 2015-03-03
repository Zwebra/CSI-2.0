import java.util.Scanner;

public class Arrays {
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hur m�nga nummer vill du skriva in: ");
			int aPoster = input.nextInt();
			
		int array [] = new int[aPoster];
		int counter = 0;

		while( aPoster>counter){
			System.out.println("Ange ditt v�rde: ");
			array[counter] = input.nextInt();
			counter++;			
		}
		System.out.println();
		printArray(array);
		System.out.println();
		reverseArray(array);
		System.out.println();
		sumArray(array);
		input.close();
		
	}
	
	public static void printArray(int []array){
		
		for(int i = 0; i < array.length;i++){
		System.out.println(array[i]);
		}
		
	}
	
	public static void reverseArray(int []array){

		for(int i = array.length - 1; i >= 0; i--){
			System.out.println(array[i]);
		}
	}
	
	public static void sumArray(int[]array){
		int summa = 0;
		
		for(int i = 0; i < array.length; i++){
			summa += array[i];
		}
		
		System.out.println(summa);
	}
	
}
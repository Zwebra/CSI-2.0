import java.util.Scanner;
import java.io.File;

public class Browser2 {
	public static void main(String []args){
		try{
			Scanner input = new Scanner(System.in);
			Scanner filescan = new Scanner(new File("new.txt"));
			
			System.out.println("Enter your search word: ");
				String searchword = input.nextLine();
			input.close();
			
			int counter = 0;
			
			while(filescan.hasNext()){
				String word = filescan.next();
				boolean check = searchword.contains(word);
				
				if(check == true){
					counter++;
				}
			}
				
			if(counter >= 1){
				System.out.println("Vi hittade ditt ord " + counter + " g�nger");
			}else{
				System.out.println("Vi hittade inte ditt ord! f�rs�k igeeeen");
			}
			filescan.close();

		}catch(Exception e){}
	}
}
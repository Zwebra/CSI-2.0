import java.util.*;

public class CesarCrypt {

	public static void main(String [] args)
	{	
		
		String sentence;
		
		Scanner input = new Scanner(System.in);

			
		int [] key = new int [6];
		
		System.out.println("skriv in din nyckel");
			String keyInput = input.nextLine();
			
		for(int i=0; i < keyInput.length(); i++) //loopen g�r om siffror i en str�ng, till int, genom char conversion.
		{
			String temp = "" + (char)keyInput.charAt(i); //g�r en str�ng med namnet temp av varje grej i str�ngen keyInput
			int numtemp = Integer.parseInt(temp); //g�r om str�ngen temp till int
			key[i] = numtemp; // l�gger in numtemp i arrayen key.
		}
		
		System.out.println("Write the sentence you want to crypt");
		sentence = input.nextLine();
		
		String encrypted = encrypt_message(sentence, key);  //skickar meningen som ska krypteras till metoden, och nyckelen.
		
		System.out.println(encrypted);
		
		String dekrypt = decrypt_message(encrypted, key); //skickar den krypterade meningen till metoden f�r dekrypt, �ven nycklen.
		
		System.out.println(dekrypt);
		
		input.close();
	}
	
	public static String encrypt_message ( String msg, int[] key) //krypt metod
	{
		String krypt = "";
		int currentKey =0;
		
		for(int i=0;i<msg.length(); i++){
			int chr = msg.charAt(i);
			
			if(chr==32){
				krypt = krypt+(char)chr; //hoppar �ver mellanslag
			}else{
				chr = (int)chr+key[currentKey]; //l�gger till v�rdet i arrayen key p� ascii v�rdet.
				currentKey++;
				if(currentKey == 6){
					currentKey = 0; //s�tter arrayen till pos 0.
				}
				krypt = krypt+(char)chr;
			}
		}
		return krypt;
		
		
	}	
public static String decrypt_message ( String msg, int[] key) //dekrypt metod.
{
	String dekrypt = "";
	int currentKey =0;
	
	for(int i=0;i<msg.length(); i++){
		int chr = msg.charAt(i);
		
		if(chr==32){
			dekrypt = dekrypt+(char)chr; //magi.
		}else{
			chr = (int)chr-key[currentKey]; //g�r tillbaka till de ursprungliga ascii-v�rdet.
			currentKey++;
			if(currentKey == 6){ 
				currentKey = 0; //s�tter arrayen till pos 0.
			}
			dekrypt = dekrypt+(char)chr;
		}
	
	
}
	return dekrypt;
} 
}

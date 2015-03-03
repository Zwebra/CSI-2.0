import java.util.*;

public class CesarCrypt {

	public static void main(String [] args)
	{	
		//HEJ JOHAN!!!
		String sentence;

		Scanner input = new Scanner(System.in);


		int [] key = new int [6];

		System.out.println("skriv in din nyckel");
		String keyInput = input.nextLine();

		for(int i=0; i < keyInput.length(); i++) //loopen gör om siffror i en sträng, till int, genom char conversion.
		{
			String temp = "" + (char)keyInput.charAt(i); //gör en sträng med namnet temp av varje grej i strängen keyInput
			int numtemp = Integer.parseInt(temp); //gör om strängen temp till int
			key[i] = numtemp; // lägger in numtemp i arrayen key.
		}

		System.out.println("Write the sentence you want to crypt");
		sentence = input.nextLine();

		String encrypted = encrypt_message(sentence, key);  //skickar meningen som ska krypteras till metoden, och nyckelen.

		System.out.println(encrypted);

		String dekrypt = decrypt_message(encrypted, key); //skickar den krypterade meningen till metoden för dekrypt, även nycklen.

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
				krypt = krypt+(char)chr; //hoppar över mellanslag
			}else{
				chr = (int)chr+key[currentKey]; //lägger till värdet i arrayen key på ascii värdet.
				currentKey++;
				if(currentKey == 6){
					currentKey = 0; //sätter arrayen till pos 0.
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
				chr = (int)chr-key[currentKey]; //går tillbaka till de ursprungliga ascii-värdet.
				currentKey++;
				if(currentKey == 6){ 
					currentKey = 0; //sätter arrayen till pos 0.
				}
				dekrypt = dekrypt+(char)chr;
			}


		}
		return dekrypt;
	} 
}

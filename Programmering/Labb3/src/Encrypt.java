import java.util.*;

 	public class Encrypt
 	{

 		public static void main (String [] arg)
 		{

 			Scanner scan= new Scanner( System.in);
 			System.out.println (" Write a text to enkrypt");
 			
 			String text =scan.nextLine();
 			
 			String crypto =encrypt(text);
 			decrypt(crypto);

 			scan.close();
 			}
 			
 			public static String encrypt (String karl_text) {
 				
 				String krypt_text="";
 				
 				String text = karl_text;

 	 			for(int i=0;i<text.length();i++){

 	 				int ascii_ny=(int)text.charAt(i)+1;

 	 			krypt_text=krypt_text+((char)ascii_ny);
 	 			
 	 			}
 	 				
 	 				System.out.println(krypt_text);
 	 	 	
				return krypt_text;

 			}
 			public static String decrypt(String krypt_text){
 				
 				String text = krypt_text;
 				String decrypt ="";
 				
 				for(int i=0;i<text.length();i++){
 					int ascii_ny=(int)text.charAt(i)-1;
 					
 					decrypt= decrypt + ((char)ascii_ny);
 				}
 				System.out.println(decrypt);
 				return decrypt;
 			}
 			
}
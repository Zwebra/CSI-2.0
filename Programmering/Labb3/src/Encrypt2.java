import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;




 	public class Encrypt2{
 		public static void main (String [] arg) throws IOException{


			try {
				BufferedReader reader = new BufferedReader(new FileReader("ordlista_sv.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));

				while(reader.ready()){
					String text =encrypt(reader.readLine());
					System.out.println(text);
					encrypt(text);
					
					writer.append(text);
					writer.newLine();
				}
				writer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}


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
 			
}
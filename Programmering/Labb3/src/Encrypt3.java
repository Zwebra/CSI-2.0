import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Encrypt3 {

 public static String crypt(String line){
  String encrypted = "";
  for(int i = 0; i<line.length(); i++){
   char c = line.charAt(i);
   c = (char) ((int) c+1);
   encrypted += c;
  }
  
  return encrypted;
 }
 
 public static void main(String[] args) {
  
  try {
   BufferedReader reader = new BufferedReader(new FileReader("ordlista_sv.txt"));
   BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
   
   while(reader.ready()){
    String encrypted = crypt(reader.readLine());
    writer.append(encrypted);
    writer.newLine();
   }
   
   reader.close();
   writer.close();
   
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
 
}
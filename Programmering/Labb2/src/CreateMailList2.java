import java.io.File;
import java.util.Scanner;

public class CreateMailList2 {
 public static String create_email(String line){
  String email = "";
  String dela = "[  ]+";//Mellan [] står tecken som delar strängen, +  gör att man hoppar över konsekutiva delimiters
  String[] ord = line.split(dela); /*split kallar på klassen String som kallar på StringTokenizer
             split delar på strängen vid alla delimiters i strängen line*/
  
  for(int i1 = 0; i1 < 2; i1++){ //gå igenom första och andra ordet
   for(int i2 = 0; i2 < 3; i2++){ //gå igenom de första 3 bokstäverna
    email += ord[i1].charAt(i2); //skriv in bokstäverna i email
   }
  }
  
  return email+"@email.com";
 }
 
 public static void main(String[] args) {
  try{
      Scanner filscan = new Scanner (new File("klasslista.txt"));
           
      // nedan kod läser från filen rad för rad och 
      // skriver ut den till output. 
       
       while(filscan.hasNext())
       {  
          String line = filscan.nextLine();
          String email = create_email(line);
          System.out.println(line+ "    email:    " +email);
       }        
  }
  catch(Exception e){
   
  }
 }
}
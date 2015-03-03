import java.io.File;
import java.util.Scanner;

public class CreateMailList2 {
 public static String create_email(String line){
  String email = "";
  String dela = "[  ]+";//Mellan [] st�r tecken som delar str�ngen, +  g�r att man hoppar �ver konsekutiva delimiters
  String[] ord = line.split(dela); /*split kallar p� klassen String som kallar p� StringTokenizer
             split delar p� str�ngen vid alla delimiters i str�ngen line*/
  
  for(int i1 = 0; i1 < 2; i1++){ //g� igenom f�rsta och andra ordet
   for(int i2 = 0; i2 < 3; i2++){ //g� igenom de f�rsta 3 bokst�verna
    email += ord[i1].charAt(i2); //skriv in bokst�verna i email
   }
  }
  
  return email+"@email.com";
 }
 
 public static void main(String[] args) {
  try{
      Scanner filscan = new Scanner (new File("klasslista.txt"));
           
      // nedan kod l�ser fr�n filen rad f�r rad och 
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
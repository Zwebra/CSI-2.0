
	import java.util.*;
import java.io.*;
   
	 
	public class CreateMailList
   {
   
       @SuppressWarnings("resource")
	public static void main ( String []  str)
      {
         try{
			
            
				Scanner filscan = new Scanner (new File("klasslista.txt.txt"));
         
            // nedan kod läser från filen rad för rad och 
				// skriver ut den till output. 
				 
				   while(filscan.hasNext())
					{  
					String line = filscan.nextLine();
					
					String email= create_email(line);
               
					System.out.println(line+ "    email:    " +email+ "@student.hh.se");
										
					}
            	
           }
         
             catch(Exception e){}
				 
				 
				 

		  
}// slut main

// obs, ej färdig 
       public static String create_email(String name)
       {
     String yourname=name;
     int pos1;
     String first3;
     String last4;
     String fullname;

     pos1=yourname.indexOf('\t');//Måste hitta " "; "alm alm"
     
     if(pos1 <= 4){//tar de 3 första CHARs i yourname och sätter till stirngVar
      first3=yourname.substring(0,pos1-1);
     }else{
      first3=yourname.substring(0, 3);
     }
     
     if(yourname.length()-pos1 <= 4){// hittar först " " och sen positionen,börjar vid +1 och slutar vid ´+4 pga 3 CHARS där imellan
      last4 = yourname.substring(pos1+1,yourname.length());
     }else{
      last4=yourname.substring(pos1+1,pos1+5);
     }
     
     fullname = first3+last4+"@hh.student.se";
     return fullname;
    }
   }
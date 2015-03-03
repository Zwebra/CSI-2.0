//Programmet skall du göra färdig. 
//Nedan ser du koden som du kan använda för att läsa in fil 

	
	import java.util.*;
   import java.io.*;
   
	 
	public class CreateMailList
   {
   
       public static void main ( String []  str)
      {
         try{
			
            
				Scanner filscan = new Scanner (new File("klasslista.txt"));
         
            // nedan kod läser från filen rad för rad och 
				// skriver ut den till output. 
				 
				   while(filscan.hasNext())
					{  
					String line = filscan.nextLine();
					String email=create_email(line);
               
					System.out.println(line+ "    ****    " +email);
										
					}
            	
           }
         
             catch(Exception e){}

		  
}// slut main
      
   	
   // obs, ej färdig 
     public static String create_email( String name)
      {
               
			return name; 		
					
		}
   
   }
	
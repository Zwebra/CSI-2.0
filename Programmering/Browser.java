// Hur kan vi bearbeta strängar 
import java.util.Scanner;

public class Browser{


public static void main (String [] arg)
{
          	
  String text= "dada hej sasa hej rasa hej tasa hej";
  String sokord="hej";
  String ord="dddddddddd hej";
  
  System.out.println(text.contains(sokord));
  
  System.out.println(text.indexOf(sokord));
	
  System.out.println(ord.indexOf(sokord));
  int counter=0;
  int index=text.indexOf(sokord);
  
  while(index!=-1)
  {
     counter++;
	  index=text.indexOf(sokord, index+sokord.length());
  }
  
  System.out.println(counter);
  }

	
	  
  }
  
  
  
  
  /* Browser 
  String text= "dada hej sasa hej rasa hej";
  String sokord="hej";
  int counter=0;
  int index=text.indexOf(sokord);
  
  while(index!=-1)
  {
     counter++;
	  index=text.indexOf(sokord, index+sokord.length());
  }
  
  System.out.println(counter);

  }

*/


 /*try{
         Scanner scan = new Scanner (new File("Visa.txt"));
         
            while (scan.hasNextLine()) {
               String line = scan.nextLine();
               System.out.println(line);       	
            }
				
				 }
         
             catch(Exception e){}





/*int index=0;
    
  while ( index!=text.length()){
   System.out.print((int)text.charAt(index)+ " ");
	index++;
  
//double tal=1.333333333333;
 //   System.out.printf("%.2f\n", tal);
 //   System.out.println(Math.round(tal));


 String persnr= "19880307-5678";
	   String år =persnr.substring(0, 4);
		
		int årtal  =Integer.parseInt("4325435sdsaf");
		
		int ålder= 2013-årtal;
	   System.out.println(ålder);



// hur lång är strängen ?
  // innehåller bara siffror?
  // innehåller bara bokstäver 
 
 StringBuilder str= new StringBuilder(text);
	str.append("nina");
   System.out.println(str);
	str.replace("data");
	String s=str.toString();


StringBuilder str= new StringBuilder("Itf 2013 är bäst ");
	
	str.append("nina");
   System.out.println(str);
	
	str.replace( 4, 8, "2014");
	
	System.out.println(str);

	String s=str.toString();



*/
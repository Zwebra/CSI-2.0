import java.util.Scanner;

//Hej Johan!
public class morseArray {
		    public static void main(String[]args){
		        Scanner input = new Scanner(System.in);
		        String morse="";
		        System.out.println("Enter text");
		        String message = input.nextLine();
		        input.close();
		         
		        message = message.toUpperCase();
		         
		        String [] morseArray =new String [29];
		         
		                morseArray[0] = ".-";    //A
		                morseArray[1] = "-..."; //B
		                morseArray[2] = "-.-."; //C
		                morseArray[3] = "-..";  //D
		                morseArray[4] = ".";    //E
		                morseArray[5] = "..-."; //F
		                morseArray[6] = "--.";  //G
		                morseArray[7] = "...."; //H
		                morseArray[8] = "..";   //I
		                morseArray[9] = ".---"; //J
		                morseArray[10] ="-.-";  //K
		                morseArray[11] =".-.."; //L
		                morseArray[12] ="--";   //M
		                morseArray[13] ="-.";   //N
		                morseArray[14] ="---";  //O
		                morseArray[15] =".--."; //P
		                morseArray[16] ="--.-"; //Q
		                morseArray[17] =".-.";  //R
		                morseArray[18] ="...";  //S
		                morseArray[19] ="-";    //T
		                morseArray[20] ="..-";  //U
		                morseArray[21] ="...-"; //V
		                morseArray[22] =".--";  //W
		                morseArray[23] ="-..-"; //X
		                morseArray[24] ="-.--"; //Y
		                morseArray[25] ="-..";  //Z
		                morseArray[26] =".--.-";//Å
		                morseArray[27] =".-.-"; //Ä
		                morseArray[28] ="---."; //Ö
		                 
		                char ch =0;
		                int counter =0;
		                 
		                while(counter<message.length()){
		                     
		                    ch=message.charAt(counter);
		                 
		                    switch(ch){
		                    case 'A': morse = morse + " " + morseArray[0];
		                        break;
		                    case 'B': morse = morse + " " + morseArray[1];
		                        break;
		                    case 'C': morse = morse + " " + morseArray[2];
		                        break;
		                    case 'D': morse = morse + " " + morseArray[3];
		                        break;
		                    case 'E': morse = morse + " " + morseArray[4];
		                        break;
		                    case 'F': morse = morse + " " + morseArray[5];
		                        break;
		                    case 'G': morse = morse + " " + morseArray[6];
		                        break;
		                    case 'H': morse = morse + " " + morseArray[7];
		                        break;
		                    case 'I': morse = morse + " " + morseArray[8];
		                        break;
		                    case 'J': morse = morse + " " + morseArray[9];
		                        break;
		                    case 'K': morse = morse + " " + morseArray[10];
		                        break;
		                    case 'L': morse = morse + " " + morseArray[11];
		                        break;
		                    case 'M': morse = morse + " " + morseArray[12];
		                        break;
		                    case 'N': morse = morse + " " + morseArray[13];
		                        break;
		                    case 'O': morse = morse + " " + morseArray[14];
		                        break;
		                    case 'P': morse = morse + " " + morseArray[15];
		                        break;
		                    case 'Q': morse = morse + " " + morseArray[16];
		                        break;
		                    case 'R': morse = morse + " " + morseArray[17];
		                        break;
		                    case 'S': morse = morse + " " + morseArray[18];
		                        break;
		                    case 'T': morse = morse +  " " + morseArray[19];
		                        break;
		                    case 'U': morse = morse +  " " + morseArray[20];
		                        break;
		                    case 'V': morse = morse +  " " + morseArray[21];
		                        break;
		                    case 'W': morse = morse +  " " + morseArray[22];
		                        break;
		                    case 'X': morse = morse +  " " + morseArray[23];
		                        break;
		                    case 'Y': morse = morse +  " " + morseArray[24];
		                        break;
		                    case 'Z': morse = morse + " " + morseArray[25];
		                        break;
		                    case 'Å': morse = morse +  " " + morseArray[26];
		                        break;
		                    case 'Ä': morse = morse + " " + morseArray[27];
		                        break;
		                    case 'Ö': morse = morse + " " + morseArray[28];
		                        break;
		                     
		                    default: morse = morse + " / ";
		                        break;
		                 
		                    }
		                    counter++;
		                }
		                System.out.println(morse);
		    }
		}

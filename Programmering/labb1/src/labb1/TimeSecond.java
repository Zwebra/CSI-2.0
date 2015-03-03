package labb1;
import java.util.*;
public class TimeSecond {
	public static void main(String[]args){
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Variabler
		int tid, hr, min, sec;
		
		//Input
		System.out.println("Ange tid i sekunder:");
		tid = input.nextInt();
		
		//Timmar
		hr = (tid-tid%3600)/3600;
		tid = tid - hr * 3600;		
		
		//Minuter
		min = (tid-tid%60)/60;
		tid = tid - min * 60;
	
		//Sekunder
		sec = tid;
		
		//Output
		System.out.println("Timmar:" + hr + " Minuter:" +  min + " Sekunder:" + sec);
				
		input.close();		
	}
}

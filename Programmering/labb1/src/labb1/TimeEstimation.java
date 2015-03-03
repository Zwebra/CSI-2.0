package labb1;
import java.util.*;
public class TimeEstimation {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		
		int cap;
		int speed;
		int time;
		int hr;
		int min;
		int sec;
		System.out.println("Matta in lagringsmediets kapacitet (GB):");
		cap = input.nextInt();
		System.out.println("Ange läshastighet(mbit):");
		speed = input.nextInt();
		int realcap = (cap*1000)*8;
		time = realcap/speed;
			
		//Timmar
		hr = (time-time%3600)/3600;
		time = time - hr * 3600;		
		
		//Minuter
		min = (time-time%60)/60;
		time = time - min * 60;
	
		//Sekunder
		sec = time;
		
		//Output
		System.out.println("Det kommer ta " + hr + " timmar," +  min + " minuter och " + sec + " sekunder.");
		
		input.close();
		
		
	}
}

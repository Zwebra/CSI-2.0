import java.util.Random;
public class Gamer {
	
	private String name;
	private int points;
	
	
	//constructor
	
	public Gamer( String nm){
		name=nm;
		points=0;
		}
	// returns name
	
	public String getName( ){
		return name;
	}
	
	public void play (int n){
		Random rnd = new Random();
		int d1,d2,d3;
		
		switch(n){
		
		case 1: 
			d1 = rnd.nextInt(6)+1;
			System.out.println("Your roll is: "+d1);
			points += d1;
		break;
		
		case 2: 
				d1 = rnd.nextInt(6)+1;
				d2 = rnd.nextInt(6)+1;
				System.out.println("Your dices rolled: "+d1+" "+d2);
				points += d1+d2;
		break;
		
		case 3: 
				d1 = rnd.nextInt(6)+1;
				d2 = rnd.nextInt(6)+1;
				d3 = rnd.nextInt(6)+1;
				System.out.println("Your dices rolled: "+d1+" "+d2+" "+d3);
				points += d1+d2+d3;
		break;
		
		default: System.out.println("No dices thrown.");
		}

		System.out.println(points);
		
	}
	
	public int getPoints(){
		return points;
		
	}
	
	public void reset(){
		points=0;
	}
	

}


import java.util.Scanner;

public class TestRectangle {
	public static void main(String []args){
		Rectangle rekt = new Rectangle(5,5);
		Scanner input = new Scanner(System.in);
		System.out.println("skriv höjden: ");
			double newH = input.nextDouble();
		System.out.println("skriv bredden: ");
			double newW = input.nextDouble();
		
		rekt.changeHeight(newH);
		rekt.changeWidth(newW);
		
		double area = rekt.getArea();
		
		System.out.println(area);
		input.close();
	}
}

package uppgifterurboken;

import java.util.Scanner;



public class Chaptertwothree {

	public static void main(String[] args) {
		
		Scanner keyboard; 
		
		keyboard = new Scanner(System.in);
		
		String name;
		int age;
		String collage;
		String pet;
		
		System.out.print("Hello what is your name? YOUR NAME HERE: ");
			name = keyboard.next();
			
		System.out.print("OH Hello! " + name + " how old are you? YOUR AGE HERE: ");
			age = keyboard.nextInt();
			
		System.out.print("Ah so you are in collage? Which one? YOUR SCHOOL HERE: ");
			collage = keyboard.next();
			
		System.out.println("Do you have a pet? what it's name? PETSNAME HERE: ");
			pet = keyboard.next();
			
		System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I'm enjoying my time at " + collage + ", though I miss my pet " + pet + " very much!"); 
				


	}

}

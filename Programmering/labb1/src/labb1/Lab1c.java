package labb1;
import java.util.Scanner;
public class Lab1c
{
public static void main(String[] args)
{
 Scanner tangentbord = new Scanner (System.in);
 
 double price, rea, sum, first, second;
 
 System.out.println("Write the price here: ");
 price = tangentbord.nextDouble();
 System.out.println("Write the realisation here: ");
 rea = tangentbord.nextDouble();
 
 tangentbord.close();
 first = price/100;
 sum = first*rea;
 second = price-sum;
 
 System.out.println ("The price will be " + second);
}
}
/*
 *  @Cruz G
 *  Date: 2/5/20
 *  Takes in 3 numbers as given by the user and returns the product. 
 */
import java.util.Scanner;;
public class PracticeProblem {
	public static void main(String[] args){
	Scanner scnr = new Scanner(System.in);
	
	double inputUser1 = 0.0;
	double inputUser2 = 0.0;
	double inputUser3 = 0.0;
	
	System.out.println("Welcome to this calculator that takes 3 numbers and gives you their product");
	
	System.out.println("Enter your first number: ");
	inputUser1 = scnr.nextDouble();
	
	System.out.println("Enter your second number: ");
	inputUser2 = scnr.nextDouble();
	
	System.out.println("Enter your first number: ");
	inputUser3 = scnr.nextDouble(); 
			
	double product = inputUser1 * inputUser2 * inputUser3;
	
	System.out.println("Total is: " + product);
			
	}
}

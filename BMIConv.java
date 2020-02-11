import java.util.Scanner;

public class BMIConv {
	public static void main(String[] arguments) {
		Scanner scnr = new Scanner(System.in);
		
		//Getting Names
		System.out.println("Hello enter your name person 1: ");
		String name1 = scnr.next();
		System.out.println("Hello enter your name person 2: ");
		String name2 = scnr.next();
		System.out.println("Hello enter your name person 3: ");
		String name3 = scnr.next();
		
		//1ST PERSON
		System.out.println("Enter Weight in pounds, " + name1 + " : ");
		double givenWeight1 = scnr.nextDouble();
		System.out.println("Enter Height in inches, " + name1 + " : ");
		double givenHeight1 = scnr.nextDouble();
		
		//2ND PERSON
		System.out.println("Enter Weight in pounds, " + name2 + " : ");
		double givenWeight2 = scnr.nextDouble();
		System.out.println("Enter Height in inches, " + name2 + " :");
		double givenHeight2 = scnr.nextDouble();
		
		//3RD PERSON
		System.out.println("Enter Weight in pounds, " + name3 + " : ");
		double givenWeight3 = scnr.nextDouble();
		System.out.println("Enter Height in inches, " + name3 + " : ");
		double givenHeight3 = scnr.nextDouble();
		
		
		//CALC FOR P1
		double calcBMI1 = (givenWeight1 * 703) / (Math.pow(givenHeight1, 2));
		System.out.printf("%s, your BMI is %.2f\n", name1, calcBMI1);
		
		//CALC FOR P2
		double calcBMI2 = (givenWeight2 * 703) / (Math.pow(givenHeight2, 2));
		System.out.printf("%s, your BMI is %.2f\n", name2, calcBMI2);
		
		//CALC FOR P3
		double calcBMI3 = (givenWeight3 * 703) / (Math.pow(givenHeight3, 2));
		System.out.printf("%s, your BMI is %.2f\n", name3, calcBMI3);
		
		
	}
	
}

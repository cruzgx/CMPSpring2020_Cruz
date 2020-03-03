import java.util.Scanner;
public class LoopClassProblems {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a number you wish to raise 2 by");
		
		//POWER OF 2 PROBLEMS; Power Modifier has to be greater than or equal to 1
		int powerModifier = scnr.nextInt();
		int res = 1;
		
		if(powerModifier == 0) {
			res = 1;	
		}
		for(int i = 1; i <= powerModifier; i++) {
			res = res * 2;
		}
		System.out.println(res);
		
		
		
		//FIND THE SUM OF THE FIRST 10 NATURAL NUMBERS
		System.out.println("This line prints the sum of the first 10 natural numbers:");
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;		
		}
		System.out.println(sum);
		
		//Finds the Factorial of a given Number
		System.out.println("Enter the number you wish to get factorial: ");
		int factorialNumber = scnr.nextInt();
		int resultFactorial = 1;
		
		if((factorialNumber == 0) || (factorialNumber == 1) ) {
			resultFactorial = 1;
		}
		for(int i = 2; i <= factorialNumber; i++) {
			
			resultFactorial *= i;
		}
		System.out.println("" + resultFactorial);
		
		//Average of the first 10 numbers 
		System.out.println("Prints out the avg of the first 10 numbers");
		int numSum = 0; 
		int counter = 0;
		int avgFirstTen = 0;
			for(int i = 1; i < 11; i++) {
				numSum += i;
				counter++;
			}
		avgFirstTen = numSum / counter;
		System.out.println("Avg of first 10 numbers is: " + avgFirstTen);
		
	}
	
	
	
}

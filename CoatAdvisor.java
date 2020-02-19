import java.util.Scanner;


public class CoatAdvisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Coat Adviser");
		System.out.println("Enter Weather in fareinheit: ");
		double weather  = sc.nextDouble();
		
		if (weather > 70) {
			System.out.println("Its hot");
		}
		else if (weather > 50) {
			System.out.println("Its warm");
		}
		else if (weather > 30) {
			System.out.println("Its cold, wear a jacket");
		}
		else 
			System.out.println("Its too cold wear a coat");
		
		}
	}



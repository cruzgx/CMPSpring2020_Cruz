import java.util.Scanner;
/*
 *	@Cruz 
 */

public class AgeLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter age in number of days");
		int ageInYears = scnr.nextInt() / 365;
		//int ageInYears = ageInDays / 365;
		
		if (ageInYears <= 1) {
			System.out.println("You are an infant");
		}
		else if(ageInYears <= 3) {
			System.out.println("You are a toddler");
		}
		else if(ageInYears <= 12) {
			System.out.println("You are a child");
		}
		else if(ageInYears <= 19) {
			System.out.println("You are a teenager");
		}
		else if(ageInYears <= 21) {
			System.out.println("You are an adult");
		}
		else if(ageInYears <= 50) {
			System.out.println("You are an adult");
		}
		else if(ageInYears <= 65) {
			System.out.println("You are middle aged");
		}
		else {
			System.out.println("You are a senior citizen");
		}
	}

}

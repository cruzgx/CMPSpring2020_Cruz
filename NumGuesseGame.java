import java.util.Scanner;
import java.util.Random; 

public class NumGuesseGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assume range within 1-10
		int secretNum = (((int) Math.random() * 11) + 1); //FIX ME
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to my Number Guessing Game");
		System.out.println("Enter your guess of the number, between 1 and 10");
		int guessNum = scnr.nextInt();
		
		if (guessNum == secretNum) {
			
			System.out.printf("Victory\nVictory\nVictory\n");
		}
		
		else {
			
			System.out.printf("Game Over\nGame Over\nGame Over\n");
			System.out.printf("Random number was %d", secretNum);
		}
	}

}

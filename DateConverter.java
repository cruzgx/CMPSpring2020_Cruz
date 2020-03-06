import java.util.Scanner;

public class DateConverter {
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter 4 integers representing dayNumber "
				+ "monthNumber date year: ");
		int dayNumber = scnr.nextInt();
		int monthNumber = scnr.nextInt();
		int date = scnr.nextInt();
		int year = scnr.nextInt();
		
		//Day Number Checking
		
		if((dayNumber < 1) || (dayNumber > 7)) {
			
			System.out.println("Invalid day number: " +
			dayNumber + ", please enter a number for 1..7.");
		}
		else if (dayNumber == 1) {
			String day = "Monday";
		}
		else if (dayNumber == 2) {
			String day = "Tuesday";
		}
		else if(dayNumber == 3) {
			String day = "Wednesday";
		}
		else if(dayNumber == 4) {
			String day = "Thursday";
		}
		else if(dayNumber == 5) {
			String day = "Friday";
		}
		else if(dayNumber == 6) {
			String day = "Saturday";
		}
		else {
			String day = "Sunday";
		}
		
		//Month Number Checking
		
		if((monthNumber < 1) || (monthNumber > 12)){
			System.out.println("Invalid month number " + 
		monthNumber + ", please enter a number from 1..12.");
		}
		else if(monthNumber == 1) {
			String month = "January";
		}
		else if(monthNumber == 2) {
			String month = "February";
		}
		else if(monthNumber == 3) {
			String month = "March";
		}
		else if(monthNumber == 4) {
			String month = "April";
		}
		else if(monthNumber == 5) {
			String month = "May";
		}
		else if(monthNumber == 6) {
			String month = "June";
		}
		else if(monthNumber == 7) {
			String month = "July";
		}
		else if(monthNumber == 8) {
			String month = "August";
		}
		else if(monthNumber == 9) {
			String month = "September";
		}
		else if(monthNumber == 10) {
			String month = "October";
		}
		else if(monthNumber == 11) {
			String month = "November";
		}
		else{
			String month = "December";
		}
		
		//DATE CHECKING 
		if((date < 1) || (date > 31)) {
			System.out.println("Invalid date number: " + date
			+ ", please enter a number from 1..31.");
		}
		
		//DATE VALIDITY CHEKCKING 
		if(monthNumber == 2 || date == 30) {
			System.out.println("Invalid date: " + monthNumber +
			", does not have " + date + " days, please enter"
			+ " a valid date.");
		}
		if(monthNumber == 2 || date == 31) {
			System.out.println("Invalid date: " + monthNumber + ", does not have " + date + " days, please enter " +
			"a valid date.");
		}
		if(monthNumber == 4 || date == 31) {
			System.out.println("Invalid date: " + monthNumber + ", does not have " + date + " days, please enter " +
			"a valid date.");
		}
		if(monthNumber == 6 || date == 31) {
			System.out.println("Invalid date: " + monthNumber + ", does not have " + date + " days, please enter " +
			"a valid date.");
		}
		if(monthNumber == 9 || date == 31) {
			System.out.println("Invalid date: " + monthNumber + ", does not have " + date + " days, please enter " +
			"a valid date.");
		}
		if(monthNumber == 11 || date == 31) {
			System.out.println("Invalid date: " + monthNumber + ", does not have " + date + " days, please enter " +
			"a valid date.");
		}
		//YEAR IS ALREADY GIVEN
		
		//Checking for leap year exceptions
		  
		if(monthNumber == 2 || date == 29) {	//FIX ME			
				
			if(year % 100 == 0) {
				System.out.println("Invalid date: " + year + " is not a leap year, February does not have " + date +
				"days, please enter a valid date.");
			}
			
			if ((year % 4 == 0) || (year % 400 == 0)) { //Checks to see if year is every 4 yrs or divisible by 400
				
				System.out.println();
			}

		
		}
		
		
		
	}
}

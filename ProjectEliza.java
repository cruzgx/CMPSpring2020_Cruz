//import java.util.Random;

//BUG: IF USER PUTS 1 WORD SENTENCE PRGRM CRASHES
import java.util.Scanner;

public class ProjectEliza {

	static String userName = "";
	static String[] userResponces = new String[100];
	static int i = 0;
	static boolean isExit = false;

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		PromptBank Eliza = new PromptBank();
		Eliza.populateStatementsArray();
		Eliza.populateQuestionsArray();

		User u = new User();

		System.out.println("ELIZA: Hello, my name is Eliza. What is your name?");
		u.setUserName(scnr);
		System.out.println("USER: " + u.getUserName());

		// Assume user always puts punctuation mark in their responce
		
		//NEXT STEPS!
		//-Errors when putting than a word name
		// which could be remedied with exception handling.
		//-Bug after you run session but runs correctly after one message.
		//-Make responces that make the bot seem more realistic 
		
	
		
		
		
		System.out.println("ELIZA: Hello, " + u.getUserName() + ". Tell me what is on your mind today in 1 sentence.");
		forverLoop:
		while (1 == 1) {
			u.setResponce(scnr, i);
			System.out.println("USER: " + u.getResponce());
			if (isExit != true) {
				u.setFirstWord(i);
				u.setLastWord(i);
				u.setPunctuation(i);

				System.out.println(Eliza.elizaResponce(u));
				i++;
				continue forverLoop;
			}

			if (isExit == true) {
				System.out.println("ELIZA: Do you want to run the session again?");
				u.setResponce(scnr, i);
				if(isExit == true) {
					break forverLoop;
				}
				else {
					System.out.println(Eliza.elizaResponce(u)); //Additions made
					i++;
					continue forverLoop;
				}
			}
		}
		System.out.println("ELIZA: Goodbye, until next time.");
	}

	public static class User {
		private String userName;
		private String responce;
		private String firstWordOfSentence;
		private String lastWordOfSentence;
		private char punctuationMark;

		public User() {
			this.userName = "";
			this.responce = "";
			this.firstWordOfSentence = "";
			this.lastWordOfSentence = "";
			this.punctuationMark = '.';
		}

		// userName
		public void setUserName(Scanner userName) {
			this.userName = userName.next();
		}

		public String getUserName() {
			return this.userName;
		}

		// responce
		public void setResponce(Scanner scnr, int i) {
			userResponces[i] = scnr.next();
			if (userResponces[i].equalsIgnoreCase("Exit") || userResponces[i].equalsIgnoreCase("No") && isExit == true) { //Where I check for is 'exit'
				isExit = true;
				return;
			}
			isExit = false;
			userResponces[i] += scnr.nextLine();
		}

		public String getResponce() {
			return userResponces[i];
		}

		// firstWord
		public void setFirstWord(int i) {
			String first = userResponces[i];
			first = first.substring(0, first.indexOf(" "));

			this.firstWordOfSentence = first;
		}

		public String getFirstWord() {
			return this.firstWordOfSentence;
		}

		// lastWord (setter & getter)
		public void setLastWord(int i) {
			String last = userResponces[i];
			last = last.substring(last.lastIndexOf(" ") + 1);
			last = last.substring(0, last.length() - 1);

			this.lastWordOfSentence = last;
		}

		public String getLastWord() {
			return this.lastWordOfSentence;
		}

		// punctuation (setter)
		public void setPunctuation(int i) {
			char punct;
			punct = userResponces[i].charAt(userResponces[i].length() - 1);

			this.punctuationMark = punct;
		}

		public char getPunctuation() {
			return this.punctuationMark;
		}

	}

	static class PromptBank extends User { // can name Eliza
		String[] questions = new String[8];;
		String[] statements = new String[7];;
		private String responce;

		public PromptBank() {
			// questions = new String[3]; //initialize your array to the correct length to
			// match your number of questions you populate it with
			// statements = new String[3]; //initialize your array to the correct length to
			// match your number of questions you populate it with
			this.responce = "";
		}

		public void populateStatementsArray() {
			statements[0] = "Tell me more about BLANK1 and BLANK2";
			statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
			statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
			statements[3] = "BLANK1 and BLANK2 interesting... You should tell me more.";
			statements[4] = "BLANK1 is interesting but tell me more about BLANK2";
			statements[5] = "Im reading that and BLANK1 seems familar... does it have a connection to BLANK2?";
			statements[6] = "Okay, so you metioned BLANK1 and BLANK2... Lets delve deeper into this.";
			
			/*
			 * complete this method with your other statements using BLANK1 for word1 and
			 * BLANK2 for word2 place holder
			 */
		}

		public void populateQuestionsArray() {
			questions[0] = "Is there anything else about BLANK1 and BLANK2?";
			questions[1] = "Does BLANK1 bother you? How about BLANK2 does it bother you?";
			questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		    questions[3] = "I noticed you mentioned BLANK1 but what so special about BLANK2?";
		    questions[4] = "What are your personal thoughts on BLANK1 or BLANK2. Anthing of particular interest to you?";
		    questions[5] = "How long have you thought out about BLANK1? is BLANK2 important?"; 
		    questions[6] = "Whats the significance of BLANK1 and BLANK2, do they hold sentimental value to you?";
			questions[7] = "Im reading what you said about BLANK1, it seems familar... does it have a connection to BLANK2?";
		    
			/*
			 * complete this method with your other questions using BLANK1 for word1 and
			 * BLANK2 for word2 place holder
			 */

		}

		/*
		 * public String getRandomStatementTrunk(){ //fill in the method so it randomly
		 * selects the statement template //from the questions array ... hint use
		 * Math.random() to get the random index //so you can replace BLANK1 and BLANK2
		 * with the appropriate words
		 * 
		 * HOW TO GET NUM BETWEEN 0-10 int randNum = (int) (Math.random() * 11); creates
		 * a random num between 0-10 since RIGHTMOST is excluded int ranNumGen = (int)
		 * (Math.random() * 3);
		 * 
		 * HOW TO GET NUM BETWEEN 1-10 int randNum = (int) (Math.random() * 10) + 1; }
		 */
		public String getRandomStatementTrunk(User u) {
			int randNumGen = (int) (Math.random() * 7); // Picks a random num between 0-6 -> last num exclusive
			// FIX ME: Add Conditional to check if punctuation contains ! and add prefix of
			// "WOW Dramtic!

			String replacedStatement = statements[randNumGen];
			replacedStatement = replacedStatement.replaceAll("BLANK1", u.getFirstWord());
			replacedStatement = replacedStatement.replaceAll("BLANK2", u.getLastWord());

			if (u.getPunctuation() == '!') {
				replacedStatement = "Eliza: WOW! Dramtic! " + replacedStatement;
				this.responce = replacedStatement;
				return this.responce;
			}

			this.responce = "Eliza: " + replacedStatement;
			return replacedStatement;
		}

		public String getRandomQuestionTrunk(User u) {
			// so you can replace BLANK1 and BLANK2 with the appropriate words
			int randNumGen = (int) (Math.random() * 8); // Picks a random num between 0-7 -> last num exclusive
			String replacedQuestion = questions[randNumGen];
			replacedQuestion = replacedQuestion.replaceAll("BLANK1", u.getFirstWord());
			replacedQuestion = replacedQuestion.replaceAll("BLANK2", u.getLastWord());

			replacedQuestion = "Eliza: " + replacedQuestion;
			return replacedQuestion;
		}

		public String elizaResponce(User u) {
			char userPunct = u.getPunctuation();
			if (userPunct == '.' || userPunct == '!') {
				return getRandomStatementTrunk(u);
			}
			else if (userPunct == '?') {
				return getRandomQuestionTrunk(u);
			} else {
				return getRandomStatementTrunk(u); // "Evaluates any other char and prompts a statement
			}
		}
	}
}

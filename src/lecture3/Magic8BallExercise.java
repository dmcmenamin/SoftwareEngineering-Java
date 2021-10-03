/**
 * 
 */
package lecture3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Darren McMenamin
 *
 */
public class Magic8BallExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String yourAnswer;
		
		System.out.print("What is your question: ");
		String myQuestion = sc.nextLine();
		System.out.printf("You asked %s %n", myQuestion);
		
		int switchNumber = rand.nextInt(8) + 1;
		
		switch (switchNumber) {
		case 1:
			yourAnswer = "As I see it, yes.";
			break;
		case 2:
			yourAnswer = "Ask again later";
			break;
		case 3:
			yourAnswer = "Better not tell you now";
			break;
		case 4:
			yourAnswer = "Cannot predict now.";
			break;
		case 5:
			yourAnswer = "Concentrate and ask again";
			break;
		case 6:
			yourAnswer = "Don't Count on it.";
			break;
		case 7:
			yourAnswer = "It is Certain.";
			break;
		case 8:
			yourAnswer = "IT is Decidedly so.";
			break;
		default:
			yourAnswer = "You have broken the magic 8 ball";
		}
				
		System.out.printf("The magic 8 ball says %s", yourAnswer);

	}

}

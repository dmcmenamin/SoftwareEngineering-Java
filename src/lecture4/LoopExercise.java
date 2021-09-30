/**
 * 
 */
package lecture4;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Darren McMenamin
 *
 */
public class LoopExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int generatedNumber = random.nextInt(10) + 1;
		
		
		System.out.println("Please guess a number in the range 1 - 10: ");
		int myGuess = sc.nextInt();
		
		while(generatedNumber != myGuess) {
			System.out.println("That is not the correct number");
			System.out.println("Please guess a number in the range 1 - 10: ");
			myGuess = sc.nextInt();
		}
		
		System.out.println("Congratulations that is the correct answer");
		sc.close();
	}

}

/**
 * 
 */
package lecture4;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Darren McMenamin
 *
 */
public class ForPracticalExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("What is your Name: ");
		String yourName = sc.nextLine();

		for (int i = 0; i < 10; i++) {
			System.out.printf("Your name is %s %n", yourName);
		}

		sc.close();

		String outputMessage = "";
		for (int i = 0; i < 11; i++) {
			outputMessage += i + ",";

		}
		System.out.println(outputMessage.substring(0, outputMessage.length() - 1));

		outputMessage = "";
		for (int i = 10; i > 0; i--) {
			outputMessage += i + ",";
		}
		System.out.println(outputMessage + "Liftoff!");

		int counter = 11;
		outputMessage = "";
		while (--counter > 0) {
			outputMessage += counter + ",";
		}
		System.out.println(outputMessage + "Liftoff!");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		for (int i = 10; i < 41; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		for (int i = 1000; i > 0; i--) {
			if (i == 333) {
				System.out.println("Liftoff aborted");
				break;
			}
			System.out.println(i);
		}

		outputMessage = "";
		// uses a nested for loop (i.e. a loop inside another)
		// outer loops runs 1 -3 
		for (int outer=1; outer<=3; outer++){
			// runs from 1 - 10
			for (int inner=1; inner<=10; inner++){
				// check if one, two or three stars required
				if (outer==1){
					System.out.print("* "+inner);
				} else if (outer==2){
					System.out.print("** "+inner);
				} else {
					System.out.print("*** "+inner);
				}
				// add the comma ?
				if (inner!=10){
					System.out.print(", ");
				}
			} // end of inner loop
			// line break added
			System.out.println();
		} // end of outer loop
		
	}

}

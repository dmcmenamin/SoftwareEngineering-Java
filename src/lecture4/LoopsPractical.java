/**
 * 
 */
package lecture4;

import java.util.Scanner;

/**
 * @author Darren McMenamin
 *
 */
public class LoopsPractical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int num = 1;
		Scanner sc = new Scanner(System.in);

		while (num < 11) {
			sum += num;
			System.out.printf("The value of sum is %d %n", sum);
			num += 1;
		} // end while loop

		int menuOption;
		do {
			menuOption = 0;
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Save");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.println("Select Option: ");

			menuOption = sc.nextInt();
			String outputMessage;

			switch (menuOption) {
			case 1:
				outputMessage = "File Option Selected";
				break;
			case 2:
				outputMessage = "Edit Option Selected";
				break;
			case 3:
				outputMessage = "Save Option Selected";
				break;
			case 4:
				outputMessage = "Delete Option Selected";
				break;
			case 5:
				outputMessage = "Exit Option Selected";
				break;
			default:
				outputMessage = "Invalid Option";
				break;
			}
			System.out.printf("%s %n", outputMessage);
		} while (menuOption != 5);
		sc.close();
		
		
	}

}

/**
 * 
 */
package lecture6;

import java.util.Scanner;

/**
 * @author Darren McMenamin
 *
 */
public class NameRedactor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String fieldToBeRedacted = sc.nextLine();
		String outputField = "";
		
		for (int i = 0; i < fieldToBeRedacted.length(); i++) {
			if (fieldToBeRedacted.charAt(i) == ' ') {
				outputField += " ";
			}
			else {
				outputField += "*";
			}
			
		}
		System.out.println(outputField);
		sc.close();
	}

}

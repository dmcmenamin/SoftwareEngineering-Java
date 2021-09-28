/**
 * 
 */
package lecturethree;

/**
 * @author Darren McMenamin
 *
 */
public class ConditionalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, num4;
		num1 = 10;
		num2 = 26;
		num3 = 100;
		num4 = 10 ;
		
		if ((num1 == num4) && (num2 > num3)) {
			// Will print if both are true
			System.out.println("Condition is true");
		}
		
		if ((num1 == num4) || (num2 > num3)) {
			// Will print if one of the things is true
			System.out.println("Statement 2 is true");
		}
		
		if (num1 == num4 && num2 > num3 ) {
			System.out.println("If Statement is true");
		}
		else {
			System.out.println("If Statement is false");
		}
		
		System.out.println("End of Program");
	}

}

/**
 * 
 */
package lecturethree;

import java.util.Scanner;

/**
 * @author Darren McMenamin
 *
 */
public class CompareNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("Please input a number: ");
		num1 = sc.nextInt();
		
		System.out.print("Please input a second number: ");		
		num2 = sc.nextInt();
		
		
		if (num1 > num2) {
			System.out.printf("%d is larger than %d", num1, num2);
		}
		else if(num1 < num2) {
			System.out.printf("%d is larger than %d", num2, num1);
			}
		else {
			System.out.printf("%d is the same as %d", num1, num2);
		}

		// Ternary 
		// x = (Condition) ? Value if true : Value if False
		int biggest = (num1 > num2)? num1 : num2 ;
		System.out.println();
		System.out.printf("The biggest number is %d", biggest);
		
		
	}

}

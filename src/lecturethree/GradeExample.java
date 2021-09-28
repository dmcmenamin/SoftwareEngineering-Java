/**
 * 
 */
package lecturethree;

/**
 * @author Darren McMenamin
 *
 */
public class GradeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;
		char grade;
		
		score = 75;
		
		if (score >= 90) {
			grade = 'A';
		}
		else if (score >= 80) {
			grade = 'B';
		}
		else if (score >= 70) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}

		System.out.printf("Your score is %c", grade);
	}

}

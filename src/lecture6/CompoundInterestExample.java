/**
 * 
 */
package lecture6;

/**
 * @author Darren McMenamin
 *
 */
public class CompoundInterestExample {

	/**
	 * @param args
	 */
	
	public static final double INTEREST_RATE = 0.05;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double balance = 1000;
		
		System.out.printf( "%4s %20s \n", "Year", "Amount on Deposit");
		
		for (int year = 1; year <= 15; year++) {
			
			balance *= (1+INTEREST_RATE);
			System.out.printf( "%4d %20.2f \n", year, balance);
			
			
		}

	}

}

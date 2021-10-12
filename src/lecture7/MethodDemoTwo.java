package lecture7;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Method Demo
 * Includes Method for
 * @author Darren McMenamin
 */

public class MethodDemoTwo {

    /**
     * A Void Method that has a hardcoded age value
     * uses the Calendar Method - and prints out the year you will
     * turn 100
     */
    public static void yearTurn100() {
        int currentAge, currentYear, yearTurning100;
        currentAge = 39;
        currentYear = Calendar.getInstance().get(Calendar.YEAR);
        yearTurning100 = 100 - currentAge + currentYear;
        System.out.printf("Year turning 100 is: %d %n", yearTurning100);
    }

    /**
     * A Void Method that takes in Current Age as an Integar
     * uses the Calendar Method - and prints out the year you will
     * turn 100
     * @param currentAge Integer
     */
    public static void whenWillIBe100(int currentAge) {
        int currentYear, yearTurning100;
        currentYear = Calendar.getInstance().get(Calendar.YEAR);
        yearTurning100 = 100 - currentAge + currentYear;
        System.out.printf("Year turning 100 is: %d %n", yearTurning100);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        yearTurn100();
        MethodDemoOne.invokeMe();

        System.out.print("Please input your current age: ");
        int yourAge = sc.nextInt();
        whenWillIBe100(yourAge);

    }
}

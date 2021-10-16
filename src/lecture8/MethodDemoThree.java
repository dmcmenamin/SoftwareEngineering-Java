package lecture8;

import java.util.Scanner;

/**
 * @author Darren McMenamin
 */

public class MethodDemoThree {

    /**
     * Finds and returns the maximum of 2 Integers
     * using a ternary statment
     * @param numberOne - integer
     * @param numberTwo - integer
     * @return - integer - the biggest of the 2 numbers
     */
    public static int biggestNumber(int numberOne, int numberTwo) {

        return (numberOne > numberTwo) ? numberOne : numberTwo;
    }

    /**
     * A Method which returns a String
     * Method will ask for user name which is then returned
     * If No name is entered - then returns Stranger
     * @return - String - Returns Inputted Name or Stranger if blank
     */
    public static String getMyName(String prompt , Scanner scanner){

        System.out.println(prompt);
        String inputtedName = scanner.nextLine();
        String returnName;

        if (inputtedName.isBlank()) {
            returnName =  "Stranger";
        }
        else {
            returnName = inputtedName;
        }
        scanner.close();
        return returnName;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();

        int result = biggestNumber(45, 34);
        System.out.println("The return value is " + result);

        System.out.println("Your name is " + getMyName("What is your name: ", sc));
        sc.close();
    }
}

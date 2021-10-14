package lecture7;

import java.util.Scanner;

/**
 * Method Demo
 * Includes Method for
 *  invokeMe
 *  someOtherMethod
 *  printMyNameTenTimes
 * @author Darren McMenamin
 */

public class MethodDemoOne {

    /**
     *
     * @param num1
     * @param num2
     */
    public static void biggestNumber(int num1, int num2) {

    }// end of biggestNumber

    /**
     * A Void Method which prints a message to show it was called
     */

    public static void invokeMe() {
        System.out.println("A Method has been invoked");
        someOtherMethod();
    }

    /**
     * A Void Method that prints my name
     */
    public static void printMyNameTenTimes() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Darren McMenamin");
        }

    }

    /**
     * A Void Method that prints name a specified number of times
     * @param noOfTimes int - number of times that name is to be printed
     */
    public static void printMyNameMultipleTimes(int noOfTimes) {
        for (int i = 0; i < noOfTimes; i++) {
            System.out.println("Darren McMenamin");
        }

    }

    /**
     * A Void Method which prints a message to the screen
     */
    public static void someOtherMethod(){
        System.out.println("I was called too");
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        invokeMe();
        printMyNameTenTimes();

        System.out.println("How many times do you want to print your name?: ");
        int timesToPrintName = sc.nextInt();
        printMyNameMultipleTimes(timesToPrintName);

    }// end main

}// end class

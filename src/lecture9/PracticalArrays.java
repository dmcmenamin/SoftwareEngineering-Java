package lecture9;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Darren McMenamin
 */
public class PracticalArrays {

    public static final double HOURLYWAGE = 11.50;

    /**
     * A Void Method that calculates the salary for an employee
     * It prints the number of hours worked each day
     * It prints the total hours worked in the week
     * It prints the final weekly salary
     */
    public static void hourAndWages(){
        int [] weeklyHours = {8 , 7 , 9, 7, 4, 11};
        double weeklySalary = 0;
        int totalHoursWorked = 0;

        //Print out headers
        System.out.printf("%9s %3s %12s %n","Day"," ","Hours Worked");

        for (int i = 0; i < weeklyHours.length; i++) {
            // Print out Day & Hours worked from array
            // User built in 'DayofWeek' function to convert an integer to a String
            System.out.printf("%9s %14s %d %n", DayOfWeek.of(i+1).toString(), " ", weeklyHours[i]);
            totalHoursWorked += weeklyHours[i];
            weeklySalary += (weeklyHours[i] * HOURLYWAGE);

        }
        System.out.printf("The total hours worked this week were: %d %n", totalHoursWorked);
        System.out.printf("Your total salary is £%4.2f %n %n", weeklySalary);
    }// end hourAndWages

    /**
     * A method that returns the average of an array
     * Uses the Arrays.stream to calculate the average of the array
     * @return double
     */
    public static double[] temperature(){
        double [] temperatureArray = {3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1};
        double [] averageTemperature = new double[3];

        averageTemperature[0] = Arrays.stream(temperatureArray).average().getAsDouble();
        averageTemperature[1] = Arrays.stream(temperatureArray).max().getAsDouble();
        averageTemperature[2] = Arrays.stream(temperatureArray).min().getAsDouble();
        return averageTemperature;
    }

    public static double[] heights() {
        double [] studentHeights = {1.4, 1.9, 1.31, 1.2};
        double [] returnHeights = new double[3];


        returnHeights[0] = Arrays.stream(studentHeights).average().getAsDouble();
        returnHeights[1] = Arrays.stream(studentHeights).max().getAsDouble();
        returnHeights[2] = Arrays.stream(studentHeights).min().getAsDouble();

/*
        double currentMaximum = 0;
        double currentMinimum = studentHeights[0];
        double currentCount = 0;
        int numberOfElements = studentHeights.length;
        for (int i = 0; i < studentHeights.length; i++) {
            if(studentHeights[i] >= currentMaximum) {
                currentMaximum = studentHeights[i];
            }
            if(studentHeights[i] <= currentMinimum) {
                currentMinimum = studentHeights[i];
            }
            currentCount += studentHeights[i];
        } // end for

        returnHeights[0] = (currentCount / numberOfElements);
        returnHeights[1] = currentMaximum;
        returnHeights[2] = currentMinimum;
*/

        return returnHeights;
    }

    /**
     * Main
     * @param args Main
     */
    public static void main(String[] args) {

        hourAndWages();
        double [] temperatureAverage = temperature();
        System.out.printf("The average temperature is: %4.2f %n", temperatureAverage[0]);
        System.out.printf("The highest temperature is: %4.2f %n", temperatureAverage[1]);
        System.out.printf("The lowest temperature is %4.2f %n %n", temperatureAverage[2]);

        double [] heightOfStudents = heights();
        System.out.printf("The Average height of students is %4.2f %n", heightOfStudents[0]);
        System.out.printf("The tallest students height is %2.2f %n", heightOfStudents[1]);
        System.out.printf("The smallest students height is %2.2f %n", heightOfStudents[2]);

        System.out.printf("Please enter your first name: ");
        Scanner scanner = new Scanner(System.in);
        String userFirstName = scanner.nextLine();

        char [] charArray = assignFirstNameToCharArray(userFirstName);
        System.out.printf("The number of vowels in %s is %d %n", userFirstName, numberOfVowelsInName(charArray));

        evenNumbersFrom1To100();


    }//end Main

    /**
     * Takes in an array and returns the number of vowels in that name
     * @param charArray - Array of characters
     * @return int
     */
    private static int numberOfVowelsInName(char[] charArray) {
        int numberOfVowels = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' ||
            charArray[i] == 'o' || charArray[i] == 'u'){
                numberOfVowels += 1;
            }// end if
        }// end for
        return numberOfVowels;
    }// end numberOfVowelsInName

    /**
     * Takes in a user's name and iterates through it into a Char Array
     * @param passedFirstName String
     * @return Char Array
     */
    private static char[] assignFirstNameToCharArray(String passedFirstName) {
        char[] returnedCharArray = new char[passedFirstName.length()];

        for (int i = 0; i < passedFirstName.length(); i++) {
            returnedCharArray[i] = passedFirstName.charAt(i);
        }//end for
        return returnedCharArray;
    }// end assignFirstNameToCharArray

    public static void evenNumbersFrom1To100(){
      int [] numbersFrom1To100 = new int[49];
      int arrayPosition = 0;
        for (int i = 1; i < 100; i++) {
            if(i % 2 == 0){
                numbersFrom1To100[arrayPosition] = i;
                arrayPosition += 1;
            }// end if
        }//end for

        for (int i = 0; i < numbersFrom1To100.length; i++) {
            System.out.println(numbersFrom1To100[i]);
        }// for

        System.out.println("The total is " + Arrays.stream(numbersFrom1To100).sum());
    }

    public static void printArrayToScreen (int [] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }// end for
    }// endPrintArrayToScreen

}//end Class PracticalArrays

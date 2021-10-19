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
     * Part 1 - Question 1
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
     * Part 1 - Question 2
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

    /**
     * Part 1 - Question 3
     * An Array that calculates:
     *  1. The Average of an Array
     *  2. The Maximum Value
     *  3. The Minumum Value
     * @return - A double Array- where:
     *              value 0 is the average
     *              value 1 is the maximum
     *              value 2 is the minimum
     */
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

        int [] printArray = {1,5,10,5};
        printArrayToScreen(printArray);

        assignmentQuestion();
        questionNine();


    }//end Main

    /**
     * Part 1 - Question 5.1
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
     * Part 1 - Question 5.2
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

    /**
     * Part 1 - Question 6
     * A void array that creates an array with all the even values from 0 - 100
     * It prints these to screen
     * It prints the total of all numbers also
     */
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

    /**
     * Takes in an array, and prints it out to screen
     * @param inputArray
     */
    public static void printArrayToScreen (int [] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }// end for
    }// endPrintArrayToScreen

    /**
     * Part 1 - Question 8
     * Will call arrayAverage to get the average of an array
     * Will call averageOfTwoNumbers to get the average of 2 inputs
     * Will call highestOfTwoNumbers to get the highest average
     */
    public static void assignmentQuestion () {
        int [] assignment1 = {24, 42, 29, 66, 77};
        int [] assignment2 = {79, 68, 31, 22, 42};

        double averageOne = arrayAverage(assignment1);
        double averageTwo = arrayAverage(assignment2);

        System.out.printf("The average of Assignment 1 is %4.1f %n", averageOne);
        System.out.printf("The average of Assignment 2 is %4.1f %n", averageTwo);

        double overallAverage = averageOfTwoNumbers(averageOne, averageTwo);
        System.out.printf("The Average of both Assignments is %4.1f %n", overallAverage);

        double highestNumber = highestOfTwoNumbers(averageOne, averageTwo);
        int assignmentNumber = 0;
        if (highestNumber == averageOne) {
            assignmentNumber = 1;
        }
        else {
            assignmentNumber = 2;
        }
        System.out.printf("Assignment %d has the highest Average %n%n", assignmentNumber);

    }//end assignmentQuestion

    /**
     * Part 1 - Question 8.1
     * Takes in an int array and returns the average of that array
     * @param inputArray int Array
     * @return double Value
     */
    public static double arrayAverage(int [] inputArray) {

        return Arrays.stream(inputArray).average().getAsDouble();
    }// end arrayAverage

    /**
     * Part 1 - Question 8.2
     * Takes in 2 doubles and returns their average
     * @param num1 - double
     * @param num2 - double
     * @return the average of the inputs
     */
    public static double averageOfTwoNumbers (double num1, double num2) {

        return (num1 + num2) / 2;
    }//end averageOfTwoNumbers

    /**
     * Part 1 - Question 8.3
     * @param num1 - double
     * @param num2 - double
     * @return the highest of the two inputs
     */
    public static double highestOfTwoNumbers (double num1, double num2) {
        if (num1 > num2){
            return num1;
        }
        else return num2;
    }//end highestOfTwoNumbers

    /**
     * Part 1 - Question 9
     * Splits a String into a String Array
     * Outputs on screen:
     *          Full Quote
     *          Total Number of Words
     *          Number of letters
     *          Smallest Word
     *          Largest Word
     */
    public static void questionNine (){
        String quote = "Continuous effort not strength nor intelligence is the key for unlocking our potential";

        String [] splitQuote = quoteSplitter(quote);
        displayEachWordOnNewLine(splitQuote);
        long totalNumberOfWords  = Arrays.stream(splitQuote).count();
        System.out.printf("The total number of words is %d %n", totalNumberOfWords);

        int totalNumberOfCharacters = countNumberOfCharacters(splitQuote);
        System.out.printf("The total number of Characters is %d %n", totalNumberOfCharacters);

        String smallestWord = findSmallestWord(splitQuote);
        String largestWord = findLargestWord(splitQuote);

        System.out.printf("The smallest word is %s %n", smallestWord);
        System.out.printf("The largest word is %s %n", largestWord);

    }


    /**
     * Part 1 - Question 9.1
     * Takes in a String and splits it into an array on spaces
     * @param quote String
     * @return String Array split on " "
     */
    public static String[] quoteSplitter(String quote) {

        return quote.split(" ");
    }// end quoteSplitter

    /**
     * Part 1 - Question 9.2
     * Loops through a String and displays each element(word) on a new line
     * @param inputString - String
     */
    private static void displayEachWordOnNewLine(String [] inputString) {
        for (int i = 0; i < inputString.length; i++) {
            System.out.printf("%s %n", inputString[i]);
        }

    }// end displayEachWordOnNewLine

    /**
     * Part 1 - Question 9.3
     * Loops through Array and returns the count of all Characters
     * @param inputQuote - String Array
     * @return int
     */
    private static int countNumberOfCharacters(String[] inputQuote) {

        int counter = 0;
        for (int i = 0; i < inputQuote.length; i++) {
            counter += inputQuote[i].length();
        }// end for

        return counter;
    }// end countNumberOfCharacters

    /**
     * Part 1 - Question 9.4
     * Takes in a String Array and returns the smallest Word
     * @param splitQuote - String Array
     * @return - Smallest Word
     */
    private static String findSmallestWord(String[] splitQuote) {
        int currentSmallest = splitQuote[0].length();
        for (int i = 0; i < splitQuote.length; i++) {
            if(currentSmallest > splitQuote[i].length()){
                currentSmallest = splitQuote[i].length();
            }// end if

        }// end for
        return splitQuote[currentSmallest];
    } //end findSmallestWord

    /**
     * Part 1 - Question 9.5
     * Takes in a String Array and returns the largest Word
     * @param splitQuote - String Array
     * @return - Largest Word
     */
    private static String findLargestWord(String[] splitQuote) {
        int currentLargest = splitQuote[0].length();
        for (int i = 0; i < splitQuote.length; i++) {
            if (currentLargest < splitQuote[i].length()) {
                currentLargest = splitQuote[i].length();
            }//end if

        }// end for
        return splitQuote[currentLargest];
    } // end findLargestWord

}//end Class PracticalArrays

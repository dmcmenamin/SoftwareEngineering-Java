package lecture9;

import java.util.Arrays;

/**
 * @author Darren McMenamin
 */
public class PracticalArrays2 {

    public static void main(String[] args) {

        int [][] practicalArray = populateArray();
        printArray(practicalArray);
        System.out.println("The total number of the array is " + totalArrayValue(practicalArray));
        System.out.println("The Array average is " + arrayAverage(practicalArray));

    }//end Main

    /**
     * A Void Method that creates and populates a 2D Array
     * It then returns this back
     * @return - 2D Int Array
     */
    public static int [][] populateArray(){

        int arrayValue = 0;
        int [] [] twoDimensionalIntArray = new int[4][4];

        for (int outerLoop = 0; outerLoop < twoDimensionalIntArray.length; outerLoop++) {

            for (int innerLoop = 0; innerLoop < twoDimensionalIntArray[outerLoop].length; innerLoop++) {
                arrayValue +=2;
                twoDimensionalIntArray[outerLoop][innerLoop] =arrayValue;
            }// end innerLoop
        }// end outerLoop

        return twoDimensionalIntArray;
    }

    /**
     * A Void Method that prints a 2D array on screen
     * @param inputArray - 2 Dimensional Array
     */
    public static void printArray(int [][] inputArray) {

        for (int outerLoop = 0; outerLoop < inputArray.length; outerLoop++) {

            for (int innerLoop = 0; innerLoop < inputArray[outerLoop].length; innerLoop++) {
                System.out.printf("%d %2s", inputArray[outerLoop][innerLoop], " ");
            }
            System.out.println();
        }// end for
    }// end printArray

    /**
     * An array that loops through a 2D Array and gets a count of all the elements
     * @param inputArray - a 2d Int Array
     * @return - int - total of all array elements
     */
    public static int totalArrayValue(int [][] inputArray){

        int returnTotalValue = 0;
        for (int outerLoop = 0; outerLoop < inputArray.length; outerLoop++) {

            for (int innerLoop = 0; innerLoop < inputArray[outerLoop].length; innerLoop++) {
                returnTotalValue += inputArray[outerLoop][innerLoop];
            }
        }// end for
        return returnTotalValue;
    }// end totalArrayValue

    /**
     * Gets the average of the array
     * Calls the totalArrayAverage to get the total of the array
     * Then loops through to get the element count
     * @param inputArray - a 2d int Array
     * @return - double - average of the Array
     */
    public static double arrayAverage(int [][] inputArray) {
        int arrayTotal = totalArrayValue(inputArray);

        int arrayElements = 0;
        for (int outerLoop = 0; outerLoop < inputArray.length; outerLoop++) {

            for (int innerLoop = 0; innerLoop < inputArray[outerLoop].length; innerLoop++) {
                arrayElements += 1;
            }
        }// end for

        double averageOfArray = arrayTotal / arrayElements;

        return averageOfArray;
    }
}

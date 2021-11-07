package practice;

import java.util.Arrays;

/**
 * @author Darren McMenamin
 */

public class BinaryFinary {

    public static void main(String[] args) {
        boolean [] providedArray = { true, false, false, true, false, true, false, true };

        int [] converted = convertArray(providedArray);
        System.out.println(Arrays.toString(converted));

        int intValue = convertBinaryToInt(converted);
        System.out.println("The converted value is "+ intValue);
    }

    /**
     * Takes in a boolean array and converts it to an Int Array
     * Where false = 0 and true = 1
     * @param inputArray - boolean Array
     * @return - Int Array
     */
    public static int[] convertArray(boolean [] inputArray) {

        int [] returnArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == false) {
                returnArray[i] = 0;
            }
            else {
                returnArray[i] = 1;
            }
        }
        return returnArray;
    }

    /**
     * Convert a Binary Array into an Integer
     * Loop through each value - multiply value * 2 the power of length - 1 - current position
     * @param intArray int Array
     * @return int value
     */
    public static int convertBinaryToInt(int [] intArray) {

        int totalValue = 0;
        for (int i = 0 ; i < intArray.length; i++) {
            totalValue += intArray[i] * Math.pow(2, intArray.length-1-i);
        }
        return totalValue;
    }
}

package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Darren McMenamin
 * Input a String
 * Encoder will change a string to an ASCII Array for each Character
 * Decode will change an ASCII Array converting it to a String
 */

public class AsciiEncoderDecoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputtedLine = getUserInput(scanner);
        int [] encodedValue = AsciiEncoder(inputtedLine);
        String decodedValue = AsciiDecoder(encodedValue);

        System.out.println("The value " + inputtedLine + " is: " + Arrays.toString(encodedValue));
        System.out.println("The decoded value of: " + Arrays.toString(encodedValue) + " is: " + decodedValue);

    }

    /**
     * Takes in a Scanner - and gets a String from the user
     * @param sc - Scanner
     * @return - Returns back a String that the user inputted
     */
    public static String getUserInput (Scanner sc) {
        System.out.print("Please input a string: ");
        return sc.nextLine();
    }

    /**
     * Takes in a string and converts (casts) the values to int and stores in an array
     * @param userString - input String
     * @return - an Int Array
     */
    public static int[] AsciiEncoder (String userString) {

        int [] returnArray = new int [userString.length()] ;
        for (int i = 0; i < userString.length(); i++) {
            returnArray[i] = (int) userString.charAt(i);
        }
        return returnArray;
    }

    /**
     * Takes in an int Array and converts (casts) these values to Chars and adds them to a string
     * @param userArray - Passed in Int Array
     * @return - String
     */
    public static String AsciiDecoder (int [] userArray) {
        String returnArray = "";

        for (int j : userArray) {
            returnArray += (char) j;
        }

        return returnArray;
    }

}

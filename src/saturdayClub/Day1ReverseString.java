package saturdayClub;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Darren McMenamin
 */
public class Day1ReverseString {

    /**
     * A Method that takes in a String and returns back it's reverse
     * @param inputString
     * @return reversed String
     */
    public static String reverseString(String inputString){
        String outputString = "";
        int stringLength = inputString.length() - 1;

        for (int i = stringLength; i >= 0; i--) {
            outputString += inputString.charAt(i);
        }

        return outputString;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Please input a String: ");
        String userString = sc.nextLine();
        sc.close();
        System.out.printf("The reverse of %s is %s %n", userString, reverseString(userString));

        // Print Current File Location
//        File file = new File(".");
//        for(String fileNames : file.list()) System.out.println(fileNames);

        // Take in a file and pass it to the Reverse String Method
        File myFile = new File("src/saturdayClub/Day1ReverseString.txt");
        Scanner scanner = new Scanner(myFile);
        userString = scanner.nextLine();
        scanner.close();
        System.out.printf("The reverse of %s is %s %n", userString, reverseString(userString));



    }


}

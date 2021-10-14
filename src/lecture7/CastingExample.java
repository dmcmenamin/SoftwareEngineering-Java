package lecture7;

import java.util.Scanner;

public class CastingExample {

    /**
     * A Void Method that prints out the Menu
     */
    public static void presentMenu(){
        System.out.println("\nASCII Convertor Menu................");
        System.out.println("1. Show ASCII Table");
        System.out.println("2. Convert a Character to ASCII");
        System.out.println("3. Convert your name to ASCII");
        System.out.println("4. Quit");

        System.out.println("Enter a number and return");

    }

    /**
     * A Void Method that prints the Ascii table
     * From Value 32 to 126
     */
    public static void printAsciiTable() {
        System.out.println("Ascii Table ...");

        for (int i = 32; i < 127; i++) {
            System.out.println(i + "    " + (char)i );

        }
    }

    /**
     * A Void Method that prints out a Character's ASCII literal
     * @param charToBeConverted - Passed Character to be converted to ASCII
     */
    public static void convertCharToAscii(char charToBeConverted){
        System.out.println("The ASCII alternative to " + charToBeConverted + " is " + (int) charToBeConverted);
    }

    /**
     * A Void Method that prints out an ASCII literal's character conversion
     * @param AsciiToBeConverted - Pass Number, to be converted from ASCII to a Character
     */
    public static void convertAsciiToChar(int AsciiToBeConverted) {
        System.out.println("The Character alternative to " + AsciiToBeConverted + " is " + (char) AsciiToBeConverted);
    }

    /**
     * A Void Method that takes in a String and prints it out in ASCII
     * @param myNameToBeConverted - String - input name to be converted to String
     */
    public static void convertNameToAscii (String myNameToBeConverted){
        String outputName = "";
        System.out.println(myNameToBeConverted.length());
        for (int i = 0; i < myNameToBeConverted.length(); i++) {
            outputName += " " + (int)myNameToBeConverted.charAt(i);
        }
        System.out.println("Your Name is " + outputName);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //get a user's option
        int userOption = 0;

        while (userOption !=4) {
            presentMenu();
            userOption = sc.nextInt();
            sc.nextLine();
            switch (userOption) {
                case 1:
                    printAsciiTable();
                    break;
                case 2:
                    System.out.println("Please input Char to be converted: ");
                    char inputCharacter = sc.next().charAt(0);
                    sc.nextLine();
                    convertCharToAscii(inputCharacter);
                    break;
                case 3:
                    System.out.println("Please input your name: ");
                    String yourName = sc.nextLine();
                    convertNameToAscii(yourName);
//                    System.out.println("Please input Integer to be Converted: ");
//                    int inputNumber = sc.nextInt();
//                    sc.nextLine();
//                    convertAsciiToChar(inputNumber);
                    break;
                case 4:
                    System.out.println("Quitting Program");
                    break;
            }
        }


    }
}

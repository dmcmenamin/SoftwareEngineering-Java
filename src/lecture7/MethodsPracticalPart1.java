package lecture7;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class MethodsPracticalPart1 {

    public static void oddOrEven() {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int numberToBeChecked = sc.nextInt();

        if (numberToBeChecked % 2 == 0) {
            System.out.println("This number is Even");
        }
        else {
            System.out.println("This number is Odd");
        }
        sc.close();
    }

    public static void convertFromUpperToLower(char letter){
        if (Character.isLowerCase(letter)) {
            System.out.println("This letter is already lower Case");
        }
        else {
            char outputCharacter = Character.toLowerCase(letter);
            System.out.printf("%c converted to lower case is %c", letter, outputCharacter);
        }
    }

    public static void isMultiple (int num1, int num2) {
        if (num2 % num1 == 0) {
            System.out.printf("%d is a multiple of %d", num1, num2);
        }
        else {
            System.out.printf("%d is not a multiple of %d", num1, num2);
        }
    }

    public static void tenRandomNumbersBetweenOneAndOneHundred(){
        Random random = new Random();
        for(int i = 0; i <= 10; i++){
            int randomNumber = random.nextInt(100) + 1;
            System.out.printf("Generated : %d %n", randomNumber);
        }
    }

    public static void promptedCountdown(Scanner scanner){

        int inputtedNumber = 0;
        boolean continueLoop = true;
        do {
            System.out.println("Please enter a number in the range 5 - 50");
            inputtedNumber = scanner.nextInt();
            if(inputtedNumber < 5 || inputtedNumber > 50){
                System.out.println("Please enter a valid amount");
            }
            else {
                continueLoop = false;
            }
        }
        while (continueLoop);


        for(int i = inputtedNumber; i > 0; i--){
            System.out.printf("%d %s %n", i, "*".repeat(i));
        }

    }

    /**
     * A Void Method that takes in an Integer and prints it out as a numerical
     * @param numberToBeConverted String which be converted to an integer
     */
    public static void printNumberInWord(String numberToBeConverted) {

        int convertedNumber;

        switch (numberToBeConverted) {
            case "one":
                convertedNumber = 1;
                break;
            case "two":
                convertedNumber = 2;
                break;
            case "three":
                convertedNumber = 3;
                break;
            case "four":
                convertedNumber = 4;
                break;
            case "five":
                convertedNumber = 5;
                break;
            case "six":
                convertedNumber = 6;
                break;
            case "seven":
                convertedNumber = 7;
                break;
            case "eight":
                convertedNumber = 8;
                break;
            case "nine":
                convertedNumber = 9;
                break;
            default:
                convertedNumber = 0;
        }
        System.out.printf("%s has been converted to %d %n", numberToBeConverted, convertedNumber);


    }

    /**
     * A Void Method that generates a random number in the range 1 - 50
     * It then calculates the and returns sum and average of those numbers
     */
    public static void sumAndAverage(){

        Random random = new Random();
        int maximumBoundary = random.nextInt(100) + 1;
        int loopCounter = 0;
        int loopSum = 0;

        for (loopCounter = 0; loopCounter <= maximumBoundary; loopCounter++) {
            loopSum += loopCounter;
        }

        float loopAverage = loopSum / loopCounter;

        System.out.println("The maximum bound is " + maximumBoundary);
        System.out.println("The sum of numbers is " + loopSum);
        System.out.println("The average of numbers is " + loopAverage);

    }

    /**
     * A Void Method that identifies if it is AM or PM
     * And prints out an appropriate message
     */
    public static void amOrPM(){
        int morningOrEvening = Calendar.getInstance().get(Calendar.AM_PM);
        if (morningOrEvening == 0) {
            System.out.println("Good Morning");
        }
        else {
            System.out.println("Good Evening");
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        oddOrEven();

        convertFromUpperToLower('a');
        isMultiple(3,2);
        tenRandomNumbersBetweenOneAndOneHundred();


        promptedCountdown(scan);
        scan.nextLine();


        System.out.println("Please enter a textual representation in the range One to Nine");
        String inputtedStringNumber = scan.nextLine().toLowerCase();
        printNumberInWord(inputtedStringNumber);

        sumAndAverage();
        amOrPM();

        scan.close();
    }

}

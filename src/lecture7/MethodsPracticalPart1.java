package lecture7;

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

    public static void promptedCountdown(){
        System.out.println("Please enter a number in the range 1 - 50");
        Scanner scan = new Scanner(System.in);
        int countdownNumber = scan.nextInt();
        if(countdownNumber < 1 || countdownNumber > 50) {
            System.out.println("Sorry that number is not valid");
            promptedCountdown();
        }
        for(int i = countdownNumber; i > 0; i--){
            System.out.printf("%d %s %n", i, "*".repeat(i));
        }

        scan.close();

    }

    public static void main(String[] args) {

//        oddOrEven();

        convertFromUpperToLower('a');
        isMultiple(3,2);
        tenRandomNumbersBetweenOneAndOneHundred();
        promptedCountdown();
    }

}

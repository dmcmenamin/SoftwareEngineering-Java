package lecture6;

import java.util.Scanner;

public class FactorialExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");

        int factorialNumber = sc.nextInt();
        long outputNumber = 1;

        for (int i = factorialNumber; i > 0; i--){
            outputNumber *= factorialNumber;
        }
        System.out.printf("The factorial number of %d is %d", factorialNumber, outputNumber);


    }
}

package lecture8;

import java.text.DateFormatSymbols;
import java.util.Random;
import java.util.Scanner;

public class MethodsPracticalPart2 {

    /**
     * Calculate the Area of Rectangle
     * @param height - Double
     * @param base - Double
     * @return - Area of Rectangle
     */
    public static double areaOfRectangle(double height, double base) {
        return (height * 2) + (base * 2);
    }

    /**
     * Takes in an Integer and returns it in as the corresponding Month Name
     * @param intMonth int - in the range 1 - 12
     * @return stringMonth - String corresponding to Month Name
     */
    public static String convertNumToMonth(int intMonth) {
        String stringMonth = new DateFormatSymbols().getMonths()[intMonth - 1];

        return stringMonth;
    }

    /**
     * Takes in 3 numbers and returns the average of the 3 numbers
     * @param num1 int
     * @param num2 int
     * @param num3 int
     * @return double - Average of num1, num2 and num3
     */
    public static double averageOfThreeNumbers(int num1, int num2, int num3) {
        return (double)(num1 + num2 + num3) / 3;
    }

    public static String capitalOfG8Country(String countryName){
        String capitalName = "";
        switch (countryName) {
            case "Canada":
                capitalName = "Ottawa";
                break;
            case "France":
                capitalName = "Paris";
                break;
            case "Germany":
                capitalName = "Berlin";
                break;
            case "Italy":
                capitalName = "Rome";
                break;
            case "Japan":
                capitalName = "Tokyo";
            case "Russia":
                capitalName = "Moscow";
            case "United Kingdom":
                capitalName = "London";
            case "United States":
                capitalName = "Washington";
        }
        return capitalName;
    }

    public static void coinToss(String call){

        Random random = new Random();
        String tossedCoinStringValue = "";
        int tossedCoin = random.nextInt(2);

        if(tossedCoin == 0) {
            tossedCoinStringValue = "heads";
        }
        else {
            tossedCoinStringValue = "tails";
        }

        if(call.toLowerCase().equals(tossedCoinStringValue)){
            System.out.printf("Congratulations you guessed %s and the coin toss was also %s %n", call, tossedCoinStringValue);
        }
        else {
            System.out.printf("Sorry you guessed %s, but the coin toss was %s, better luck next time %n", call, tossedCoinStringValue);
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter height of Rectangle: ");
        double heightOfRectangle = sc.nextDouble();

        System.out.println("Please enter base of Rectangle: ");
        double baseOfRectangle = sc.nextDouble();
        double areaRectangle = areaOfRectangle(heightOfRectangle, baseOfRectangle);
        System.out.printf("The area of the Rectangle is: %5.2f %n", areaRectangle);

        System.out.println("Please enter a number in the range 1 - 12");
        int monthNumber = sc.nextInt();
        System.out.println("That month is "+ convertNumToMonth(monthNumber));
        sc.nextLine();

        System.out.println("The average of the 3 numbers is "+ averageOfThreeNumbers(1, 15, 32));

        String G8Capital = capitalOfG8Country("France");
        System.out.println("The capital is " + G8Capital);

        System.out.println("Coin Toss - Heads or Tails?");
        String headsOrTails = sc.nextLine();
        coinToss(headsOrTails);
    }
}

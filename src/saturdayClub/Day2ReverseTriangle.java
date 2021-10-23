package saturdayClub;

//Challenge idea:
//    Standard: Take square me up and try to print a triangle instead
//    Hard: Print two triangles, base to base like
//         x
//        x x
//       x   x
//      x     x
//     x x x x x
//     x x x x x
//      x     x
//       x   x
//        x x
//         x

import java.util.Scanner;

public class Day2ReverseTriangle {

    public static void main(String[] args) {
        
        int triangleSize = getSize();
        int middleNumber = (triangleSize/2) + 1;

        String[] displayableArray = populateArray(triangleSize);

        printArrayForwards(displayableArray);
        printArrayBackwards(displayableArray);

    }

    /***
     * Using the Scanner class - request the user to input the size of a triangle they'd like.
     * Number entered must be odd, in order to create an equilateral triangle
     * @return - int 
     */
    public static int getSize(){
        Scanner scanner = new Scanner(System.in);
        boolean equilateralTriangle = false;
        int userInput = 0;

        while (equilateralTriangle == false) {
            System.out.printf("Please identify the size of an equilateral  triangle: ");
            userInput = scanner.nextInt();
            scanner.nextLine();
            if (userInput % 2 == 0) {
                System.out.println("Sorry Triangle must be equilateral (odd number)");
            } else {
                equilateralTriangle = true;
            }
        }
        scanner.close();
        return userInput;
    } // end getSize

    /**
     * 
     * @param arrayLength
     * @return
     */

    public static String[] populateArray (int arrayLength) {

       String [] triangleArray = new String[arrayLength];

       // create a new blank line, populate the middle character with a *
       String line = " ".repeat((arrayLength*2) + 1) ;
       line = line.substring(0, arrayLength-1) + "* ";
       triangleArray[0] = line;

       for (int counterLoop = 1; counterLoop < arrayLength-1; counterLoop++) {

           line = " ".repeat(arrayLength*2);
           int sideOne = arrayLength - counterLoop;
           int sideTwo = arrayLength + counterLoop;

           line = line.substring(0,sideOne-1) + "* "
                   + line.substring(sideOne + 1, sideTwo-1) + "* ";

           triangleArray[counterLoop] = line;

       }// end counterLoop
        // populate the last line with *'s

       triangleArray[arrayLength-1] = "* ".repeat(arrayLength);
       return triangleArray;

    }// end populateArray

    public static void printArrayForwards(String [] printArray) {
        for (int i = 0; i < printArray.length; i++) {
            System.out.println(printArray[i]);

        }// end for
    }// end printArrayForward

    public static void printArrayBackwards(String[] printArrray) {
        for (int i = printArrray.length-1; i >= 0 ; i--) {
            System.out.println(printArrray[i]);

        }
    }
}

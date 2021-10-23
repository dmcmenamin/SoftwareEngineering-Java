import java.util.Scanner;

/**
 * Age analysis
 * Teams of 8 - 4 paired programming teams
 * 
 * 1 - Methods to display all ages
 * 2 - Method to display average age
 * 3 - Method to display all max age
 * 4 - Method to display all min age
 * 
 * @author Peter Darren and Maria
 *
 */
public class ArrayTeamExercise {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Hellllllloooooooo 
        
        /*
         * To make array size dynamic
         * */
        
        int[] array1 = new int[sizeArray()];
        
        
        populateArray(array1);
        
        allAges(array1);
        
        System.out.println("The average is " + averageAge(array1));
        System.out.println("The max age is " + displayMaxAge(array1));
        System.out.println("The min age is " + displayMinAge(array1));
    }
    
    public static int sizeArray() {
        System.out.println("How many ages will you enter?");
        int arraySize = scanner.nextInt();
        return arraySize;
    }
    
    public static void populateArray(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("Enter age %d: ", i + 1);
            array1[i] = scanner.nextInt();
        }
    }
    public static void allAges(int[] array1) {
        System.out.printf("%d %d %d%n", array1[0], array1[1], array1[2]);
                
        int maxAge = displayMinAge(array1);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == maxAge) {
                System.out.printf("Index %d age %d%n", i, array1[i]);
            }
        }
    }
    public static double averageAge(int[] inputArray) {
        double returnAverage = 0;
        double totalSum = 0;
        int numberOfElement = inputArray.length;
        for (int i = 0; i < numberOfElement; i++) {
            totalSum += inputArray[i];
        }
        returnAverage = totalSum / numberOfElement;
        return returnAverage;
    }
    public static int displayMaxAge(int[] ages) {
        // declare variables
        int currentMaxAge = 0;
        
        // loop through array looking if current index is higher than the currentMaxAge
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > currentMaxAge) {
                currentMaxAge = ages[i];
            }
        }
        
        // return currentMaxAge
        return currentMaxAge;
    }
    
    public static int displayMinAge(int[] ages) {
        // declare variables
        int currentMinAge = ages[0];
        
        // loop through array looking if current index is higher than the currentMaxAge
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < currentMinAge) {
                currentMinAge = ages[i];
            }
        }
        
        // return currentMaxAge
        return currentMinAge;
    }
}
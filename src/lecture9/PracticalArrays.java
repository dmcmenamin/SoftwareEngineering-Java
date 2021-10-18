package lecture9;

import java.time.DayOfWeek;
import java.util.Arrays;

/**
 * @author: Darren McMenamin
 */
public class PracticalArrays {

    public static final double HOURLYWAGE = 11.50;

    /**
     * A Void Method that calculates the salary for an employee
     * It prints the number of hours worked each day
     * It prints the total hours worked in the week
     * It prints the final weekly salary
     */
    public static void hourAndWages(){
        int [] weeklyHours = {8 , 7 , 9, 7, 4, 11};
        double weeklySalary = 0;
        int totalHoursWorked = 0;

        //Print out headers
        System.out.printf("%9s %3s %12s %n","Day"," ","Hours Worked");

        for (int i = 0; i < weeklyHours.length; i++) {
            // Print out Day & Hours worked from array
            // User built in 'DayofWeek' function to convert an integer to a String
            System.out.printf("%9s %14s %d %n", DayOfWeek.of(i+1).toString(), " ", weeklyHours[i]);
            totalHoursWorked += weeklyHours[i];
            weeklySalary += (weeklyHours[i] * HOURLYWAGE);

        }
        System.out.printf("The total hours worked this week were: %d %n", totalHoursWorked);
        System.out.printf("Your total salary is £%4.2f %n %n", weeklySalary);
    }// end hourAndWages

    /**
     * A method that returns the average of an array
     * Uses the Arrays.stream to calculate the average of the array
     * @return double
     */
    public static double[] temperature(){
        double [] temperatureArray = {3.4, 4.2, 9.0, 2.2, 4.5, 6.4, 3.1};
        double [] averageTemperature = new double[3];

        averageTemperature[0] = Arrays.stream(temperatureArray).average().getAsDouble();
        averageTemperature[1] = Arrays.stream(temperatureArray).max().getAsDouble();
        averageTemperature[2] = Arrays.stream(temperatureArray).min().getAsDouble();
        return averageTemperature;
    }

    public static double[] heights() {
        double [] studentHeights = {1.4, 1.9, 1.31, 1.2};
        double [] returnHeights = new double[3];
        double currentMaximum = 0;
        double currentMinimum = studentHeights[0];
        double currentCount = 0;
        int numberOfElements = studentHeights.length;

        returnHeights[0] = Arrays.stream(studentHeights).average().getAsDouble();
        returnHeights[1] = Arrays.stream(studentHeights).max().getAsDouble();
        returnHeights[2] = Arrays.stream(studentHeights).min().getAsDouble();

//        for (int i = 0; i < studentHeights.length; i++) {
//            if(studentHeights[i] >= currentMaximum) {
//                currentMaximum = studentHeights[i];
//            }
//            if(studentHeights[i] <= currentMinimum) {
//                currentMinimum = studentHeights[i];
//            }
//            currentCount += studentHeights[i];
//        } // end for
//
//        returnHeights[0] = (currentCount / numberOfElements);
//        returnHeights[1] = currentMaximum;
//        returnHeights[2] = currentMinimum;

        return returnHeights;
    }

    /**
     * Main
     * @param args Main
     */
    public static void main(String[] args) {

        hourAndWages();
        double [] temperatureAverage = temperature();
        System.out.printf("The average temperature is: %4.2f %n", temperatureAverage[0]);
        System.out.printf("The highest temperature is: %4.2f %n", temperatureAverage[1]);
        System.out.printf("The lowest temperature is %4.2f %n %n", temperatureAverage[2]);

        double [] heightOfStudents = heights();
        System.out.printf("The Average height of students is %4.2f %n", heightOfStudents[0]);
        System.out.printf("The tallest students height is %2.2f %n", heightOfStudents[1]);
        System.out.printf("The smallest students height is %2.2f %n", heightOfStudents[2]);

    }//end Main

}//end Class PracticalArrays

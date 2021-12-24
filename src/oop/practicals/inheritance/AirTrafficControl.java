package oop.practicals.inheritance;

import java.util.Arrays;

public class AirTrafficControl {

    public static void main(String[] args) {

        Flight flightOne = new Flight("ESY3214", "Belfast", "Amsterdam", 2.2);
        Flight flightTwo = new Flight("BA127", "London Heatrow", "Cape Town", 11.5);
        Flight flightThree = new Flight("AE999", "Dublin", "New York JFK", 7.5);
        Flight flightFour = new Flight("AE678", "Dublin", "Newark", 8.5);

        Flight[] flights = {flightOne, flightTwo, flightThree, flightFour};

        printAllFlights(flights);
        double longestFlight = getFlightWithLongestDuration(flights);
        System.out.println("The longest flight is " + longestFlight);

        printAllFlightsToADestination(flights, "Dublin");

    }

    public static void printAllFlights(Flight [] flights) {
        System.out.println("All Flights");

        for (Flight flight: flights) {
            System.out.println(flight);
        }
    }

    public static double getFlightWithLongestDuration(Flight [] flights) {
        double maximumDuration = flights[0].getDuration();

        for (Flight flight: flights) {
            if (maximumDuration < flight.getDuration()) {
                maximumDuration = flight.getDuration();
            }
        }
        return maximumDuration;
    }

    public static void printAllFlightsToADestination(Flight [] flights, String destination) {

        for (Flight flight: flights) {
            if (flight.getDestination() == destination) {
                System.out.println(flight.getFlightNumber());
            }
        }
    }

}

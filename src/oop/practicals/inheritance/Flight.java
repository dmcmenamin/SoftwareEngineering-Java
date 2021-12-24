package oop.practicals.inheritance;

public class Flight {

    private String flightNumber;
    private String destination;
    private String origin;
    private double duration;

    public Flight() {
    }

    public Flight(String flightNumber, String destination, String origin, double duration) {
        this.setFlightNumber(flightNumber);
        this.setDestination(destination);
        this.setOrigin(origin);
        this.setDuration(duration);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if (duration > 18.0){
            System.out.println("Sorry this flight is too long");
            this.duration = 0;
        }
        else {
            this.duration = duration;
        }
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destination='" + destination + '\'' +
                ", origin='" + origin + '\'' +
                ", duration=" + duration +
                '}';
    }
}

package lecture14;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void area() {

        double area = Math.PI * Math.pow(this.radius, 2);
        System.out.printf("The circle's area is %2.2f %n", area);

    }
}

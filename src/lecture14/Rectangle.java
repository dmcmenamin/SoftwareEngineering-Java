package lecture14;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(this.width >= 0) {
            this.width = width;
        }
        else {
            System.err.println("Invalid width setting to -1");
            this.width = -1;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (this.height >= 0 ) {
            this.height = height;
        }
        else {
            System.err.println("Invalid height setting to -1");
            this.height = -1;
        }
    }

    public void area() {
        double area = height * width;
        System.out.printf("The area is %2.2f%n", area);
    }
}

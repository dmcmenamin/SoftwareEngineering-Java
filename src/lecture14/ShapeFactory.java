package lecture14;

public class ShapeFactory {

    public static void main(String[] args) {

        Shape[] buildingBlocks = new Shape[4];

        Shape circle = new Circle(2);
        buildingBlocks[0] = circle;
        buildingBlocks[1] = new Rectangle(5, 6);
        buildingBlocks[2] = new Rectangle(3, 3);
        buildingBlocks[3] = new Circle(4);

        for (Shape shape: buildingBlocks) {
            calculateArea(shape);
        }

    }

    public static void calculateArea(Shape shape) {
        shape.area();
    }
}

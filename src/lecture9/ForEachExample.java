package lecture9;

/**
 * @author Darren McMenamin
 */
public class ForEachExample {

    public static void main(String[] args) {
        int[] list = {1 , 5, 3, 15};

        for (int value : list) {
            System.out.println("Current Value is: " + value);
        }
    }
}

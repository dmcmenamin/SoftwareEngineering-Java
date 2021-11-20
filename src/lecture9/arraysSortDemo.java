package lecture9;

import java.util.Arrays;

public class arraysSortDemo {

    public static void main(String[] args) {

        int [] list = {45, 78, 2, 34, 12, 99, 45};

        String printable = Arrays.toString(list);
        System.out.println("built in toString: " + Arrays.toString(list));

        System.out.println("Imported Arrays.toString " + printable);

        Arrays.sort(list);
        System.out.println("Sorted: " + Arrays.toString(list));

        System.out.println(Arrays.binarySearch(list, 45));
    }
}

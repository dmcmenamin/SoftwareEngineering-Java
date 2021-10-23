package lecture9;

import java.util.Arrays;

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        int [][] multiList = new int[3][4];

        for (int row = 0; row < multiList.length; row++) {

            for (int column = 0; column < multiList[row].length; column++) {
                    multiList[row][column] = row * 16;
            }
        }

        System.out.println(Arrays.stream(multiList).sorted());

    }
}

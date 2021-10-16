package lecture8;

import java.util.Scanner;

public class MethodsChallenge {

    public static void main(String[] args) {

        char borderChar;
        int lengthSize;
        Scanner scanner = new Scanner(System.in);

        // get size of box from user
        System.out.println("Please enter the length size: ");
        lengthSize = scanner.nextInt();
        scanner.nextLine();

        // get char for border from user
        System.out.println("Please enter the border character: ");
        borderChar = scanner.nextLine().charAt(0);

        // drawing top
        drawHorizontal(lengthSize, borderChar);
        // draw sides of box
        drawSides(lengthSize, borderChar);
        // draw bottom
        drawHorizontal(lengthSize, borderChar);

    }

    private static void drawSides(int lengthSize, char borderChar) {
        for (int i = 0; i < lengthSize - 2; i++) {
            System.out.println(borderChar + " ".repeat(lengthSize-2) + borderChar);
        }
    }

    private static void drawHorizontal(int lengthSize, char borderChar) {
        for (int i = 0; i < lengthSize; i++) {
            System.out.printf("%s", borderChar);
        }
        System.out.println();
    }
}


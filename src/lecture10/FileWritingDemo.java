package lecture10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: Darren McMenamin
 * Date: 16 November 2021
 */

public class FileWritingDemo {

    public static void main(String[] args) {


        try {
            File file = new File("Lecture10-Lines.txt");
            FileWriter fileWriter = new FileWriter(file, true); //append to existing file
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.newLine();
            bufferedWriter.write("Line 6");

            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("You've got an IO Exception");
            e.printStackTrace();

        }


    }
}

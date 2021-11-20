package lecture10;

import java.io.*;

/**
 * @author: Darren McMenamin
 * Date: 16 November 2021
 */

public class FileReadingDemo {

    public static void main(String[] args) {

        File file = new File("./External Files/Lecture10-Lines.txt");
        try {
            //used for reading a file
            FileReader fileReader = new FileReader(file);
            //Buffered Reader is better used for multi-line files
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // read first line
            String line = bufferedReader.readLine();
            // go into loop
            // first print
            // and then read next line
            while (line != null) {

                System.out.println(line);

                line = bufferedReader.readLine();
            }


            bufferedReader.close();
            fileReader.close();


        } catch (FileNotFoundException e) {
            System.out.println("Caught Exception");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Caught IO Close");
            e.printStackTrace();
        }

        System.out.println(file.length());

    }
}

package lecture10;

import java.io.*;

/**
 * @author: Darren McMenamin
 * @date: 20 November 2021
 */
public class Catch22FileProcessing {


    public static void main(String[] args) {

        try {
            File file = new File("./External Files/Catch 22.txt");

            FileReader fileReader = new FileReader(file);
            FileWriter fileWriter = new FileWriter(file, true);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


            readFile(bufferedReader);
            int numberOfLines = getNumberOfLines(bufferedReader);
            System.out.println("The number of lines are: " + numberOfLines);


            bufferedWriter.close();
            bufferedReader.close();

            fileWriter.close();
            fileReader.close();

        }

        catch (FileNotFoundException e) {
            System.out.println("Caught Exception");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }

    /**
     *
     * @param bufferedRead
     */
    public static void readFile(BufferedReader bufferedRead) {

        try {
            String outputLine = bufferedRead.readLine();

            while (outputLine != null){

                System.out.println(outputLine);
                outputLine = bufferedRead.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error in readFile with Reading File");
            e.printStackTrace();
        }
    }

    /**
     * A Method which will get the number of lines in the file
     * @param bufferedReader - Buffered Reader
     * @return - number of lines as an Integer
     */
    public static int getNumberOfLines(BufferedReader bufferedReader) {



    }

}



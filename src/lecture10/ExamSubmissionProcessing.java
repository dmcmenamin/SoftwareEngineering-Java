package lecture10;

import java.io.*;
import java.util.ArrayList;

/**
 * @author: Darren McMenamin
 * @date: 20 November 2021
 */

public class ExamSubmissionProcessing {

    private static final String FILE_LOCATION = "./External Files/";
    private static final String inputFile = "examSubmissionsSample.csv";
    private static final String outputFile = "examSubmissionOutput.txt";

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = getBufferedReader();
            BufferedWriter bufferedWriter = getBufferedWriter();

            ArrayList<String []> examSubmissions = new ArrayList<String []>();

            String inputLine = bufferedReader.readLine();
            if(isValidHeader(inputLine)) {

                while (inputLine != null){
                    if (isValidHeader(inputLine)){
                        inputLine = bufferedReader.readLine();
                        continue;
                    }
                    examSubmissions.add(populateList(inputLine));
                    inputLine = bufferedReader.readLine();



                }

            }
            else {
                System.out.println("Sorry, unexpected file contents. Please check your input file and try again");
            }

            closeBufferedReader(bufferedReader);
            closeBufferedWriter(bufferedWriter);

        }
        catch (FileNotFoundException e) {
            System.out.println("File Not Found, please check name & location");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Exception, please check stack trace");
            e.printStackTrace();
        }


    }

    /**
     * A Method that gets a Buffered Reader Object
     * @return Buffered Reader Object
     * @throws FileNotFoundException - caught in main
     */
    public static BufferedReader getBufferedReader() throws FileNotFoundException {

        File file = new File(FILE_LOCATION + inputFile);
        FileReader fileReader = new FileReader(file);

        return new BufferedReader(fileReader);
    }

    /**
     * A Method that gets a Buffered Writer Object
     * @return Buffered Writer Object
     * @throws IOException - caught in main
     */
    public static BufferedWriter getBufferedWriter() throws IOException {

        File file = new File(FILE_LOCATION + outputFile);
        FileWriter fileWriter = new FileWriter(file);

        return new BufferedWriter(fileWriter);
    }

    /**
     * Closes a Buffered Writer Object
     * @param bWriter - Buffered Writer
     * @throws IOException - caught in Main
     */
    public static void closeBufferedWriter(BufferedWriter bWriter) throws IOException {

        bWriter.close();
    }

    /**
     * Closes a Buffered Reader Object
     * @param bReader - Buffered Reader
     * @throws IOException - caught in main
     */
    public static void closeBufferedReader(BufferedReader bReader) throws IOException {

        bReader.close();
    }

    /**
     * Checks if Header matches the expected Header format
     * @param fileLine - File line
     * @return Boolean
     */
    public static boolean isValidHeader(String fileLine) {

        return fileLine.equals("ID,Name,Indicator (Lab/Email)");
    }

    /**
     * Splits file into an array
     * Performs standardization check, that if length is less than 3, it will clean it up
     * @param inputLine
     * @return A Standardized Array
     */
    public static String [] populateList(String inputLine) {
        String [] returnArray;

        returnArray = inputLine.split(",");

        while (returnArray.length < 3) {
            inputLine += ", Not Provided";
            returnArray = inputLine.split(",");
        }

        return returnArray;
    }
}

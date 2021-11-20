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
            File redactedFile = new File("./External Files/Catch 22 Redacted.txt");

            FileReader fileReader = new FileReader(file);
            FileWriter fileWriter = new FileWriter(redactedFile);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String outputLine = bufferedReader.readLine();
            int numberOfLines = 0;
            int numberOfWords = 0;
            int numberOfChars = 0;
            int timesYossarianOccurs = 0;
            int checkIfLetterOccurs = 0;

            while (outputLine != null) {

                String [] wordsPerLine = outputLine.split(" ");
                numberOfWords += wordsPerLine.length;
                StringBuilder lineToBeWrittenInRedactedFile = new StringBuilder();

                System.out.println(outputLine);
                numberOfLines++;

                for (String word: wordsPerLine) {
                    numberOfChars += word.length();

                    String newWord = word;
                    if (word.equals("Yossarian")) {
                        timesYossarianOccurs++;
                        newWord = "-".repeat("Yossarian".length());
                    }

                    lineToBeWrittenInRedactedFile.append(newWord).append(" ");
                    checkIfLetterOccurs += timesLetterOccurs('a', word);
                    checkIfLetterOccurs += timesLetterOccurs('A', word);
                }

                bufferedWriter.newLine();
                bufferedWriter.write(lineToBeWrittenInRedactedFile.toString());

                outputLine = bufferedReader.readLine();
            }

            System.out.printf("The Number Of Lines is %d%n", numberOfLines);
            System.out.printf("The Number Of Words is %d%n", numberOfWords);
            System.out.printf("The Number of Chars is %d%n", numberOfChars);
            System.out.printf("The Number of times Yossarian appears %d%n", timesYossarianOccurs);
            System.out.printf("The Number of times the letter %s occurs is %d%n", 'a', checkIfLetterOccurs);

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

    public static long timesLetterOccurs(char letter, String inputWord) {
        long numberOfOccurrences;

        numberOfOccurrences = inputWord.chars().filter(ch -> ch == letter).count();

        return numberOfOccurrences;
    }

}



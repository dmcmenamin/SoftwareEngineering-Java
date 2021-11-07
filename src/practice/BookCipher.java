package practice;

public class BookCipher {

    public static void main(String[] args) {

        String message[][] = { { "Buzz", "LightYear" ,"was"},
                {"once", "apon", "a"}, { "time","probably" ,"the "},
                { "coolest", "character", "in", "Toy", "Story 2"},
                { "but ", "Woody "},{ "was ", "always ", "Andy's " , "wow"},
                { "toy.", "i"},{ "was", "never", "keen" },
                { "because ", "I ", "don't "}, { "rate","Tom","Hanks.", "Woody ", "is","quite","dour"},
                { "but"," Lightyear,", "could fly, sort of...", "Anyhow"},{ "the","movies","are", "classic"}
        };

        String outputString = "";
        for (int i = 0; i < message.length; i++) {
            outputString += extractChar(message[i]);
        }

        System.out.println(outputString.toUpperCase());

    }

    /**
     * Takes in an Array - and returns the last Character in the last element
     * @param inputArray - A String Array
     * @return - A Character
     */
    public static char extractChar (String [] inputArray) {

        String lastElementInArray = inputArray[inputArray.length-1];

        return lastElementInArray.charAt(lastElementInArray.length()-1);

    }
}

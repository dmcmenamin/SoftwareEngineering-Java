package practice;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Darren McMenamin
 */

public class PubQuiz {

    public static void main(String[] args) {

        boolean correctAnswer = true;

        String[] jokeQuestions = { "Largest planet ? ", "Worse song ever ? ", "Capital of Peru?",
                "Roman god of War ?" };

        String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };

        Scanner scanner = new Scanner(System.in);
        int result = 0;


        /*
        Loop through asking questions, until the user gets one wrong
        Will reask the same question over again
         */
        do {
            int questionNumber = randomQuestion(jokeQuestions.length);
            System.out.println(jokeQuestions[questionNumber]);
            String usersAnswer = scanner.nextLine();

            if(usersAnswer.equals(jokeAnswers[questionNumber])) {

                System.out.println("Correct");
                result += 1;
            }
            else {
                System.out.println("Incorrect");
                correctAnswer = false;
            }

        }
        while (correctAnswer == true);

        System.out.println("You scored " + result);



    }

    /**
     * Array to randomly select a question from the Array
     * @param noOfQuestions - int - length of question of array
     * @return an int - to identify which question to select
     */
    public static int randomQuestion (int noOfQuestions) {

        Random random = new Random();

        return random.nextInt(noOfQuestions);

    }
}

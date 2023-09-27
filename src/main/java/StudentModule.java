import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StudentModule {
     static void QuizAnswerbystudent(String[] args) throws FileNotFoundException, IOException, ParseException {

        Scanner scanner = new Scanner(System.in);

        int correctAnswers = 0;
        String fileName = "src/main/resources/quiz.json";

        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(fileName));

        System.out.println(
                "Welcome Salman to the quiz! We will throw you 10 questions. Each MCQ mark is 1 and no negative marking. Are you ready? Press 's' to start.");
        char ch = scanner.next().charAt(0);

        while (ch == 's') {
            for (int i = 1; i <= 10; i++) {
                Random random = new Random();
                int questionIndex = random.nextInt(jsonArray.size());
                JSONObject jsonObject = (JSONObject) jsonArray.get(questionIndex);

                String question = (String) jsonObject.get("Question");
                String option1 = (String) jsonObject.get("Option 1");
                String option2 = (String) jsonObject.get("Option 2");
                String option3 = (String) jsonObject.get("Option 3");
                String option4 = (String) jsonObject.get("Option 4");
                String answerKey = (String) jsonObject.get("answerKey");

                System.out.println("\nQuestion" + " " + i + ":" + " " + question);
                System.out.println("1." + " " + option1);
                System.out.println("2." + " " + option2);
                System.out.println("3." + " " + option3);
                System.out.println("4." + " " + option4 + "\n");

                System.out.println("Enter your answer:");
                String answer = scanner.next();

                if (answer.equals(answerKey)) {
                    correctAnswers++;
                }
            }

            if (correctAnswers >= 8) {
                System.out.println("Excellent! You have got"+" "+ correctAnswers+" "+"out of 10");
            } else if (correctAnswers >= 5) {
                System.out.println("Good. You have got"+" "+ correctAnswers+" "+"out of 10");
            } else if (correctAnswers >= 2) {
                 System.out.println("Very poor! You have got"+" "+ correctAnswers+" "+"out of 10");
            } else {
                System.out.println("Very sorry you are failed. You have got"+" "+ correctAnswers+" "+"out of 10");
            }

            System.out.println("\nWould you like to start again? press s for start or q for quit");
            ch = scanner.next().charAt(0);

            while (ch != 's' && ch != 'q') {
                System.out.println("\nPlease enter a valid input (s or q):");
                ch = scanner.next().charAt(0);
            }

            if (ch == 'q') {
                System.out.println("\nYou Have Quitted from the System\n");
            }
        }
        scanner.close();
    }
}

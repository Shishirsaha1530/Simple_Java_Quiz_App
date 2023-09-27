import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class QuizAddBYAdmin {

    static void QuizAddByAdmin(String[] args) throws IOException, ParseException {
        String fileName = "src/main/resources/quiz.json";
        char ch = 's';
        do {
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(fileName));

            JSONObject quizInfo = new JSONObject();

            Scanner input = new Scanner(System.in);

            System.out.println("Input your question:");
            quizInfo.put("Question", input.nextLine());

            System.out.println("Input option 1:");
            quizInfo.put("Option 1", input.nextLine());

            System.out.println("Input option 2:");
            quizInfo.put("Option 2", input.nextLine());

            System.out.println("Input option 3:");
            quizInfo.put("Option 3", input.nextLine());

            System.out.println("Input option 4:");
            quizInfo.put("Option 4", input.nextLine());

            System.out.println("What is the answer key?");
            quizInfo.put("answerKey", input.nextLine());

            jsonArray.add(quizInfo);

            FileWriter fw = new FileWriter(fileName);
            fw.write(jsonArray.toJSONString());
            fw.flush();
            fw.close();
            System.out.println("Question has been Successfully Saved!");

            int count = jsonArray.size();
            System.out.println("Total Number of Questions Already Added in the System:" + count);

            System.out.println("\nDo you want to add more? Press s for adding more and q for quiting ");
            
            ch = input.next().charAt(0);
        } while (ch != 'q');
        if (ch == 'q') {
            System.out.println("You have quitted from adding questions");
        }

    }
}

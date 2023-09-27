import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UserLogin {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        String fileName= "src/main/resources/users.json";

        JSONParser parser =new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(fileName));


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName = scanner.next();
        System.out.println("Enter your password:");
        String userPassword = scanner.next();


        JSONObject jsonAdminLogin = (JSONObject) jsonArray.get(0);
        String userNameAdmin = (String) jsonAdminLogin.get("username");
        String userPassAdmin = (String) jsonAdminLogin.get("password");


        JSONObject jsonstudentLogin = (JSONObject) jsonArray.get(1);
        String userNameStudent = (String) jsonstudentLogin.get("username");
        String userPassStudent = (String) jsonstudentLogin.get("password");


        if (userNameAdmin.equals(userName) && userPassAdmin.equals(userPassword) ) {
            System.out.println("Welcome to Admin Module! Add Questions");
            QuizAddBYAdmin.QuizAddByAdmin(args);
        }
        else if (userNameStudent.equals(userName) && userPassStudent.equals(userPassword)) {
            StudentModule.QuizAnswerbystudent(args);
            
        } else {
            System.out.println("Invalid Login type");
        }

        scanner.close();

    }
}

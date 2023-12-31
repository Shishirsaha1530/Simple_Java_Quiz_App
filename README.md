
# Simple Java Quiz App

This Java Quiz App has been built for SQA learners who can participate in the SQA-related quiz in this app. There are two modules in this app, one for the Admin and another for the Students.


## Admin Features

- Admin can login into the system using predefined username and password (username: admin, password:1234).
- If login is unsuccessful then the system will show invalid login message.
- After successful login, admin will be able to add new quiz questions in the system.
- Admin has to input question, options and the answerkey into the system.
- After each successful question adding, the system will ask if the admin wants to add more.
- The system will also the total number of questions already added in the system.
- Admin has to press s for adding more question and q for quitting from the system.


## Student Features

- Student can login into the system using predefined username and password (username:salman, password:1234).
- After successful login, the system will ask the student to press s to participate in the quiz.
- Student will get 10 questions randomly from the JSON Database.
- Student will need to input the answer.
- After completing 10 questions, the system will show the mark and mark status.
- After that, the system will the student to press on s to start the quiz again and q to quit from the system.
- If the Student press on s and start the quiz again then the old mark will be reset and after completing second try, new mark will be shown by the system.
- If the student press any other key except s or q then the system will ask the student to input the correct one.




## Technology Used

- Java Programming Language
- JSON


## Tools Used

- Intellij
- VS Code
- Jdk 11




## Run Locally

Clone the project

```bash
  git clone https://github.com/Shishirsaha1530/Simple_Java_Quiz_App
```
Open the folder on Intellij and run the UserLogin.java file to run the project.

## Video Documentation

- Admin Module

[AdminModule.webm](https://github.com/Shishirsaha1530/Simple_Java_Quiz_App/assets/75736994/03e1ca54-0ac9-4353-9176-e806c20f2b6d)

- Student Module
 
[StudentModule.webm](https://github.com/Shishirsaha1530/Simple_Java_Quiz_App/assets/75736994/24a648ed-46b7-4865-9095-ba03847a2c1c)

- Invalid Login
  
[invalidLogin.webm](https://github.com/Shishirsaha1530/Simple_Java_Quiz_App/assets/75736994/fbb14b44-1299-4f35-bfe1-7b346d256d5d)



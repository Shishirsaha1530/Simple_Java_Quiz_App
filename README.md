
# Simple Java Quiz App

This Java Quiz App has been built for SQA Learners who can particiapate in the SQA related quiz in this app. There are 2 modules in this app, one is for the Admin and another is for the Users. 




## Admin Features

- Admin can login into the system using predefined username and password (username: admin, password:1234).
- If login is unsuccessful then the system will show invalid login message.
- After successful login, admin will be able to add new quiz questions in the system.
- Admin has to input question, options and the answerkey into the system.
- After each successful question adding, the system will ask if the admin wants to add more.
- The system will also the total number of questions already added in the system.
- Admin has to press s for adding more question and q for quitting from the system.


## User Features

- User can login into the system using predefined username and password (username:salman, password:1234).
- After successful login, the system will ask the user to press s to participate in the quiz.
- User will get 10 questions randomly from the JSON Database.
- User will need to input the answer.
- After completing 10 questions, the system will show the mark and mark status.
- After that, the system will the user to press on s to start the quiz again and q to quit from the system.
- If the user press any other key except s or q then the system will ask the user to input the correct one.




## Technology Used

- Java Programming Language
- JSON


## Tools Used

- Intellig
- Jdk 11




## Run Locally

Clone the project

```bash
  git clone https://github.com/Shishirsaha1530/Simple_Java_Quiz_App
```
Open the folder on Intellij and run the UserLogin.java file to run the project.

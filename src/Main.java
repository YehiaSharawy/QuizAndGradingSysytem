import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num_student;
        int num_questions;

        //looping if num of students isn't more than 0
        do{
            System.out.print("Enter number of students: ");
            num_student= x.nextInt();
            if(num_student>0)
                break;
            System.out.println("Out of range! Try Again!!");
        }while(true);

        //Entering name of students based on the num of students
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter the first name of each student:");
        for (int i =0; i<num_student;i++)
            students.add(new Student(x.next()));

        //looping if num of questions isn't more than 0
        do{
            System.out.print("Enter the number of questions to be asked by each student: ");
            num_questions= x.nextInt();
            if(num_questions>0)
                break;
            System.out.println("Out of range! Try Again!!");
        }while(true);
        Student.setNumberOfQuestions(num_questions);

        //looping on which option the user choose for type of question want to be asked
        System.out.print("Press [+,-,*,/] for a specific operation questions or [R] for random operation questions: ");
        TypeOfQuestions typeOfQuestions = new TypeOfQuestions(x.next());
        typeOfQuestions.setTypeOfQuestions();


//      //looping each student with there question depending on what operation the user chose
//        String name = names;
//        for (int i=1;i<=num_student;i++){
//            int firstNum=0 , secondNum=0, answer=0, guess=0, numCorrect=0, numWrong=0;
//            long start=0, end = 0;
//            String CorrectAns="", WrongAns="";
//            studentName = name.substring(0,name.indexOf(' '));
//            System.out.println("Student "+ studentName);
//            System.out.println("----------------------");
//            name = name.substring(name.indexOf(' ')+1);
//
//            if(type_question=="addition"){
//                for (int j=0;j<num_questions;j++){
//                    firstNum =(int)(Math.random()*10);
//                    secondNum = (int)(Math.random()*10);
//                    answer = firstNum + secondNum;
//                    start = System.currentTimeMillis();
//                    System.out.print("What is "+firstNum+" + "+secondNum+" ? : ");
//                    guess = x.nextInt();
//                    if(guess!=answer){
//                        System.out.println("Your answer is wrong.");
//                        numWrong++;
//                        System.out.println(firstNum+" + "+secondNum+" should be "+ answer);
//                        WrongAns += ""+firstNum+"+"+secondNum+"="+guess+" ";
//                    }else {
//                        System.out.println("Your answer is correct!");
//                        numCorrect++;
//                        CorrectAns += ""+firstNum+"+"+secondNum+"="+guess+" ";
//                    }
//                    end = System.currentTimeMillis();
//                    //grading system
//                    if(numCorrect>numWrong&&numCorrect==num_questions){
//                        grade="A";
//                    } else if (numCorrect>numWrong) {
//                        grade="B";
//                    } else if(numCorrect==numWrong){
//                        grade="C";
//                    }else if(numCorrect<numWrong&&numCorrect>0){
//                        grade="D";
//                    }else
//                        grade="F";
//                }
//            }
//
//            else if(type_question=="subtraction"){
//                for (int j=0;j<num_questions;j++){
//                    firstNum =(int)(Math.random()*10);
//                    secondNum = (int)(Math.random()*10);
//                    if(firstNum<secondNum){
//                        firstNum +=secondNum;
//                             secondNum = firstNum - secondNum;
//                        firstNum-= secondNum;
//
//                    }
//                    answer = firstNum - secondNum;
//                    start = System.currentTimeMillis();
//                    System.out.print("What is "+firstNum+" - "+secondNum+" ? : ");
//                    guess = x.nextInt();
//                    if(guess!=answer){
//                        System.out.println("Your answer is wrong.");
//                        numWrong++;
//                        System.out.println(firstNum+" - "+secondNum+" should be "+ answer);
//                        WrongAns += ""+firstNum+"-"+secondNum+"="+guess+" ";
//                    }else {
//                        System.out.println("Your answer is correct!");
//                        numCorrect++;
//                        CorrectAns += ""+firstNum+"-"+secondNum+"="+guess+" ";
//                    }
//                    end = System.currentTimeMillis();
//                    //grading system
//                    if(numCorrect>numWrong&&numCorrect==num_questions){
//                        grade="A";
//                    } else if (numCorrect>numWrong) {
//                        grade="B";
//                    } else if(numCorrect==numWrong){
//                        grade="C";
//                    }else if(numCorrect<numWrong&&numCorrect>0){
//                        grade="D";
//                    }else
//                        grade="F";
//                }
//            }
//
//            else if(type_question=="multiplication"){
//                for (int j=0;j<num_questions;j++){
//                    firstNum =(int)(Math.random()*10);
//                    secondNum = (int)(Math.random()*10);
//                    answer = firstNum * secondNum;
//                    start = System.currentTimeMillis();
//                    System.out.print("What is "+firstNum+" * "+secondNum+" ? : ");
//                    guess = x.nextInt();
//                    if(guess!=answer){
//                        System.out.println("Your answer is wrong.");
//                        numWrong++;
//                        System.out.println(firstNum+" * "+secondNum+" should be "+ answer);
//                        WrongAns += ""+firstNum+"*"+secondNum+"="+guess+" ";
//                    }else {
//                        System.out.println("Your answer is correct!");
//                        numCorrect++;
//                        CorrectAns += ""+firstNum+"*"+secondNum+"="+guess+" ";
//                    }
//                    end = System.currentTimeMillis();
//                    //grading system
//                    if(numCorrect>numWrong&&numCorrect==num_questions){
//                        grade="A";
//                    } else if (numCorrect>numWrong) {
//                        grade="B";
//                    } else if(numCorrect==numWrong){
//                        grade="C";
//                    }else if(numCorrect<numWrong&&numCorrect>0){
//                        grade="D";
//                    }else
//                        grade="F";
//                }
//            }
//
//            else{ // Division
//                for (int j=0;j<num_questions;j++){
//                    firstNum =(int)(Math.random()*10);
//                    do{
//                        secondNum = (int)(Math.random()*10);
//                        if(secondNum!=0)
//                            break;
//                    }while(true);
//                    answer = firstNum / secondNum;
//                    start = System.currentTimeMillis();
//                    System.out.print("What is "+firstNum+" / "+secondNum+" ? : ");
//                    guess = x.nextInt();
//                    if(guess!=answer){
//                        System.out.println("Your answer is wrong.");
//                        numWrong++;
//                        System.out.println(firstNum+" / "+secondNum+" should be "+ answer);
//                        WrongAns += ""+firstNum+"/"+secondNum+"="+guess+" ";
//                    }else {
//                        System.out.println("Your answer is correct!");
//                        numCorrect++;
//                        CorrectAns += ""+firstNum+"/"+secondNum+"="+guess+" ";
//                    }
//                    end = System.currentTimeMillis();
//                    //grading system
//                    if(numCorrect>numWrong&&numCorrect==num_questions){
//                        grade="A";
//                    } else if (numCorrect>numWrong) {
//                        grade="B";
//                    } else if(numCorrect==numWrong){
//                        grade="C";
//                    }else if(numCorrect<numWrong&&numCorrect>0){
//                        grade="D";
//                    }else
//                        grade="F";
//                }
//            }
//            time = ""+(end-start)/1000F; // calculating time took to finish the quiz
//
//            System.out.print("\nCorrect answers are ["+numCorrect+"]: ");
//            System.out.println(CorrectAns);
//            System.out.print("Wrong answers are ["+numWrong+"]: ");
//            System.out.println(WrongAns);
//            System.out.println("Estimated time took "+time+" seconds!! \n");
//
//            info += studentName+"+"+grade+"-"+time+" ";
//        }
//        //Displaying the scores using a printf table
//        name = names; // resetting the name string
//        System.out.printf("----------------------------------%n");
//        System.out.printf("|           GRADE ORDER          |%n");
//        System.out.printf("----------------------------------%n");
//        System.out.printf("| %-10s | %-8s | %6s |%n", "NAME", "GRADE", "TIME");
//        System.out.printf("----------------------------------%n");
//        //looping the students with their score and time
//        for (int i=1;i<=num_student;i++){
//            System.out.printf("| %-10s | %-8s | %-6s |%n", name.substring(0,name.indexOf(' ')) , info.substring(info.indexOf("+")+1,info.indexOf("-")),  info.substring(info.indexOf("-")+1,info.indexOf(" ")));
//            name = name.substring(name.indexOf(' ')+1);
//            info = info.substring(info.indexOf(' ')+1);
//            System.out.printf("----------------------------------%n");
//        }
//    }
    }
}
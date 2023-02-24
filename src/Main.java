import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int num_student;
        int num_questions;
        String names = "";
        String type_question = null;
        String option = null;
        boolean continueloop = true;

        //looping if num of students isn't more than 0
        do{
            System.out.print("Enter number of students: ");
            num_student= x.nextInt();
            if(num_student>0)
                break;
            System.out.println("Out of range! Try Again!!");
        }while(true);
        //Entering name of students based on the num of students
        System.out.println("Enter the first name of each student:");
        for (int i=0;i<num_student;i++){
            String nameinput = x.next();
            names += nameinput.substring(0,1).toUpperCase()+nameinput.substring(1)+" "; //capitalize the first leeter of the name
        }
        //looping if num of questions isn't more than 0
        do{
            System.out.print("Enter the number of questions to be asked by each student: ");
            num_questions= x.nextInt();
            if(num_questions>0)
                break;
            System.out.println("Out of range! Try Again!!");
        }while(true);
        //looping on which option the user choose for type of question want to be asked
        do {
            System.out.print("Press [+,-,*,/] for a specific operation questions or [R] for random operation questions: ");
            option = x.next();
            switch (option) {
                case "R":
                case "r":
                    System.out.println("You chose RANDOM operation questions");
                    type_question = "random";
                    continueloop = false;
                    break;
                case "+":
                    System.out.println("You chose ADDITION [+] operation questions");
                    type_question = "addition";
                    continueloop = false;
                    break;
                case "-":
                    System.out.println("You chose SUBTRACTION [-] operation questions");
                    type_question = "subtraction";
                    continueloop = false;
                    break;
                case "*":
                    System.out.println("You chose MULTIPLICATION [*] operation questions");
                    type_question = "multiplication";
                    continueloop = false;
                    break;
                case "/":
                    System.out.println("You chose DIVISION [/] operation questions");
                    type_question = "division";
                    continueloop = false;
                    break;
                default:
                    System.out.println("Wrong Operation!! Try Again!!");
            }
        }while (continueloop);
        System.out.println();
        //Randomizer if the user chose random question
        if(type_question=="random"){
            String initialOperations = "asmd";
            int randomInitialOperation = (int)(0+Math.random()*4);
            if(initialOperations.charAt(randomInitialOperation)=='a')
                type_question = "addition";
            else if (initialOperations.charAt(randomInitialOperation) == 's')
                type_question = "subtraction";
            else if (initialOperations.charAt(randomInitialOperation) == 'm')
                type_question = "multiplication";
            else
                type_question = "division";
        }
        //looping each student with there question depending on what operation the user chose
        String name = names;
        for (int i=1;i<=num_student;i++){
            int firstnum=0 , secondnum=0, answer=0, guess=0, numCorrect=0, numWrong=0;
            long start=0, end = 0;
            float seconds;
            String CorrectAns="", WrongAns="";

            System.out.println("Student "+ name.substring(0,name.indexOf(' ')));
            System.out.println("----------------------");
            name = name.substring(name.indexOf(' ')+1);

            if(type_question=="addition"){
                for (int j=0;j<num_questions;j++){
                    firstnum =(int)(Math.random()*10);
                    secondnum = (int)(Math.random()*10);
                    answer = firstnum + secondnum;
                    start = System.currentTimeMillis();
                    System.out.print("What is "+firstnum+" + "+secondnum+" ? : ");
                    guess = x.nextInt();
                    if(guess!=answer){
                        System.out.println("Your answer is wrong.");
                        numWrong++;
                        System.out.println(firstnum+" + "+secondnum+" should be "+ answer);
                        WrongAns += ""+firstnum+"+"+secondnum+"="+guess+" ";
                    }else {
                        System.out.println("Your answer is correct!");
                        numCorrect++;
                        CorrectAns += ""+firstnum+"+"+secondnum+"="+guess+" ";
                    }
                    end = System.currentTimeMillis();
                }
            }

            else if(type_question=="subtraction"){
                for (int j=0;j<num_questions;j++){
                    firstnum =(int)(Math.random()*10);
                    secondnum = (int)(Math.random()*10);
                    if(firstnum<secondnum){
                        firstnum +=secondnum;
                        secondnum = firstnum - secondnum;
                        firstnum-= secondnum;
                    }
                    answer = firstnum - secondnum;
                    start = System.currentTimeMillis();
                    System.out.print("What is "+firstnum+" - "+secondnum+" ? : ");
                    guess = x.nextInt();
                    if(guess!=answer){
                        System.out.println("Your answer is wrong.");
                        numWrong++;
                        System.out.println(firstnum+" - "+secondnum+" should be "+ answer);
                        WrongAns += ""+firstnum+"-"+secondnum+"="+guess+" ";
                    }else {
                        System.out.println("Your answer is correct!");
                        numCorrect++;
                        CorrectAns += ""+firstnum+"-"+secondnum+"="+guess+" ";
                    }
                    end = System.currentTimeMillis();
                }
            }

            else if(type_question=="multiplication"){
                for (int j=0;j<num_questions;j++){
                    firstnum =(int)(Math.random()*10);
                    secondnum = (int)(Math.random()*10);
                    answer = firstnum * secondnum;
                    start = System.currentTimeMillis();
                    System.out.print("What is "+firstnum+" * "+secondnum+" ? : ");
                    guess = x.nextInt();
                    if(guess!=answer){
                        System.out.println("Your answer is wrong.");
                        numWrong++;
                        System.out.println(firstnum+" * "+secondnum+" should be "+ answer);
                        WrongAns += ""+firstnum+"*"+secondnum+"="+guess+" ";
                    }else {
                        System.out.println("Your answer is correct!");
                        numCorrect++;
                        CorrectAns += ""+firstnum+"*"+secondnum+"="+guess+" ";
                    }
                    end = System.currentTimeMillis();
                }
            }

            else{ // Division
                for (int j=0;j<num_questions;j++){
                    firstnum =(int)(Math.random()*10);
                    do{
                        secondnum = (int)(Math.random()*10);
                        if(secondnum!=0)
                            break;
                    }while(true);
                    answer = firstnum / secondnum;
                    start = System.currentTimeMillis();
                    System.out.print("What is "+firstnum+" / "+secondnum+" ? : ");
                    guess = x.nextInt();
                    if(guess!=answer){
                        System.out.println("Your answer is wrong.");
                        numWrong++;
                        System.out.println(firstnum+" / "+secondnum+" should be "+ answer);
                        WrongAns += ""+firstnum+"/"+secondnum+"="+guess+" ";
                    }else {
                        System.out.println("Your answer is correct!");
                        numCorrect++;
                        CorrectAns += ""+firstnum+"/"+secondnum+"="+guess+" ";
                    }
                    end = System.currentTimeMillis();
                }
            }
            
            System.out.print("\nCorrect answers are ["+numCorrect+"]: ");
            System.out.println(CorrectAns);
            System.out.print("Wrong answers are ["+numWrong+"]: ");
            System.out.println(WrongAns);
            System.out.println("Estimated time took "+(end-start)/1000F + " seconds!! \n");
        }
        //Displaying the scores using a printf table
        name = names; // resetting the name string
        System.out.printf("--------------------------------%n");
        System.out.printf("|          GRADE ORDER         |%n");
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s |%n", "NAME", "GRADE", "TIME");
        System.out.printf("--------------------------------%n");
        //looping the students with their score and time
        for (int i=1;i<=num_student;i++){
            System.out.printf("| %-10s | %-8s | %04d |%n", name.substring(0,name.indexOf(' ')) , "A",  64);
            name = name.substring(name.indexOf(' ')+1);
            System.out.printf("--------------------------------%n");
        }
    }
}
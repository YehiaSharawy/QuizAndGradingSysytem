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
        System.out.println("Enter the name of each student:");
        for (int i=0;i<num_student;i++){
            names += x.next()+" ";
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
                    System.out.println("You chose PLUS [+] operation questions");
                    type_question = "plus";
                    continueloop = false;
                    break;
                case "-":
                    System.out.println("You chose MINUS [-] operation questions");
                    type_question = "minus";
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
        //looping each student with there question depending on what operation the user chose
        for (int i=1;i<=num_student;i++){
            int firstnum=0 , secondnum=0, answer=0, guess=0, numofCorrectguesses=0;
            System.out.println("Student "+i);
            System.out.println("----------------------");

            if(type_question=="plus"){
                for (int j=0;j<num_questions;j++){
                    firstnum =(int)(Math.random()*10);
                    secondnum = (int)(Math.random()*10);
                    answer = firstnum + secondnum;
                    System.out.print("What is "+firstnum+" + "+secondnum+" ? : ");
                    guess = x.nextInt();
                    if(guess!=answer){
                        System.out.println("Your answer is wrong.");
                        System.out.println(firstnum+" + "+secondnum+" should be "+ answer);
                    }else {
                        System.out.println("Your answer is correct!");
                        numofCorrectguesses++;
                    }
                }
            }

            else if(type_question=="minus"){
                for (int j=0;j<num_questions;j++){
                    firstnum =(int)(Math.random()*10);
                    secondnum = (int)(Math.random()*10);
                    if(firstnum<secondnum){
                        firstnum +=secondnum;
                        secondnum = firstnum - secondnum;
                        firstnum-= secondnum;
                    }
                    answer = firstnum - secondnum;
                    System.out.print("What is "+firstnum+" - "+secondnum+" ? : ");
                    guess = x.nextInt();
                    if(guess!=answer){
                        System.out.println("Your answer is wrong.");
                        System.out.println(firstnum+" - "+secondnum+" should be "+ answer);
                    }else {
                        System.out.println("Your answer is correct!");
                        numofCorrectguesses++;
                    }
                }
            }

            else if(type_question=="multiplication"){
                for (int j=0;j<num_questions;j++){
                    firstnum =(int)(Math.random()*10);
                    secondnum = (int)(Math.random()*10);
                    answer = firstnum * secondnum;
                    System.out.print("What is "+firstnum+" * "+secondnum+" ? : ");
                    guess = x.nextInt();
                    if(guess!=answer){
                        System.out.println("Your answer is wrong.");
                        System.out.println(firstnum+" * "+secondnum+" should be "+ answer);
                    }else {
                        System.out.println("Your answer is correct!");
                        numofCorrectguesses++;
                    }
                }
            }

            else if(type_question=="division"){
                for (int j=0;j<num_questions;j++){
                    firstnum =(int)(Math.random()*10);
                    secondnum = (int)(Math.random()*10);
                    answer = firstnum / secondnum;
                    System.out.print("What is "+firstnum+" / "+secondnum+" ? : ");
                    guess = x.nextInt();
                    if(guess!=answer){
                        System.out.println("Your answer is wrong.");
                        System.out.println(firstnum+" / "+secondnum+" should be "+ answer);
                    }else {
                        System.out.println("Your answer is correct!");
                        numofCorrectguesses++;
                    }
                }
            }

            else{ //Random question
                for (int j=0;j<num_questions;j++){

                }
            }
            System.out.println("Number of correct answers are ["+numofCorrectguesses+"]");
        }




/*

        String name1 = names.substring(0, names.indexOf(' '));
        String name2 = names.substring(names.indexOf(' ') + 1, names.indexOf(' ',names.indexOf(' ') +1));
        String name3 = names.substring(names.indexOf(' ',names.indexOf(' ') +1) + 1);
        System.out.println(names);
        System.out.println(option);
*/

    }
}
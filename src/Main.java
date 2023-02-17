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
        //looping if num of questions isn't more than 0
        do{
            System.out.print("Enter number of questions: ");
            num_questions= x.nextInt();
            if(num_questions>0)
                break;
            System.out.println("Out of range! Try Again!!");
        }while(true);
        //Entering name of students based on the num of students
        System.out.println("Enter the names of each student:");
        for (int i=0;i<num_student;i++){
            names += x.next()+" ";
        }
        //looping on which option the user choose for type of question want to be asked
        do {
            System.out.print("Press [+,-,*,/] for a specific operation questions or [R] for random operation questions: ");
            option = x.next();
            switch (option) {
                case "R":
                case "r":
                    System.out.println("You chose a RANDOM operation questions");
                    type_question = "random";
                    continueloop = false;
                    break;
                case "+":
                    System.out.println("You chose a PLUS [+] operation questions");
                    type_question = "plus";
                    continueloop = false;
                    break;
                case "-":
                    System.out.println("You chose a MINUS [-] operation questions");
                    type_question = "minus";
                    continueloop = false;
                    break;
                case "*":
                    System.out.println("You chose a MULTIPLICATION [*] operation questions");
                    type_question = "multiplication";
                    continueloop = false;
                    break;
                case "/":
                    System.out.println("You chose a DIVISION [/] operation questions");
                    type_question = "division";
                    continueloop = false;
                    break;
                default:
                    System.out.println("Wrong Operation!! Try Again!!");
            }
        }while (continueloop);
        System.out.println();


        String name1 = names.substring(0, names.indexOf(' '));
        String name2 = names.substring(names.indexOf(' ') + 1, names.indexOf(' ',names.indexOf(' ') +1));
        String name3 = names.substring(names.indexOf(' ',names.indexOf(' ') +1) + 1);
        




/*
        for (int i=0; i<num_student;i++){


            System.out.println("Student "+name+" Questions :");
        }

*/
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);


        System.out.println(names);
        System.out.println(option);
    }
}
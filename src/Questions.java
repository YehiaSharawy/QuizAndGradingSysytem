import java.util.Scanner;

public class Questions extends TypeOfQuestions{
    Scanner x = new Scanner(System.in);
    int firstNumber=0 , secondNumber=0, answer=0, guess=0, numberOfCorrectAnswers=0, numberOfWrongAnswers=0;
    long startQuiz=0, endQuiz = 0;
    public Questions(){
        super(getType_question());
    }
    public void generateQuestion(){
        if(getType_question().equals("addition")) {
            for (int i=0;i<Student.getNumberOfQuestions();i++){
                firstNumber =(int)(Math.random()*10);
                secondNumber = (int)(Math.random()*10);
                answer = firstNumber + secondNumber;
                System.out.print("What is "+firstNumber+" + "+secondNumber+" ? : ");
                startQuiz = System.currentTimeMillis();
                guess = x.nextInt();
                if(guess!=answer){
                    System.out.println("Your answer is wrong.");
                    System.out.println(firstNumber+" + "+secondNumber+" should be "+ answer);
                    numberOfWrongAnswers++;
//                    WrongAns += ""+firstNumber+"+"+secondNumber+"="+guess+" ";
                }else {
                    System.out.println("Your answer is correct!");
                    numberOfCorrectAnswers++;
//                    CorrectAns += ""+firstNumber+"+"+secondNumber+"="+guess+" ";
                }
                endQuiz = System.currentTimeMillis();
                Student.setEstimatedTimeCompletion((endQuiz-startQuiz)/1000F+" seconds");
            }
        }

        if(getType_question().equals("subtraction")){
            for (int i=0;i<Student.getNumberOfQuestions();i++){
                firstNumber =(int)(Math.random()*10);
                secondNumber = (int)(Math.random()*10);
                if(firstNumber<secondNumber){
                    firstNumber +=secondNumber;
                    secondNumber = firstNumber - secondNumber;
                    firstNumber-= secondNumber;
                }
                answer = firstNumber - secondNumber;
                System.out.print("What is "+firstNumber+" - "+secondNumber+" ? : ");
                startQuiz = System.currentTimeMillis();
                guess = x.nextInt();
                if(guess!=answer){
                    System.out.println("Your answer is wrong.");
                    System.out.println(firstNumber+" - "+secondNumber+" should be "+ answer);
                    numberOfWrongAnswers++;
//                    WrongAns += ""+firstNumber+"-"+secondNumber+"="+guess+" ";
                }else {
                    System.out.println("Your answer is correct!");
                    numberOfCorrectAnswers++;
//                    CorrectAns += ""+firstNumber+"-"+secondNumber+"="+guess+" ";
                }
                endQuiz = System.currentTimeMillis();
                Student.setEstimatedTimeCompletion((endQuiz-startQuiz)/1000F+" seconds");
            }
        }

        if(getType_question().equals("multiplication")){
            for (int i=0;i<Student.getNumberOfQuestions();i++){
                firstNumber =(int)(Math.random()*10);
                secondNumber = (int)(Math.random()*10);
                answer = firstNumber * secondNumber;
                System.out.print("What is "+firstNumber+" * "+secondNumber+" ? : ");
                startQuiz = System.currentTimeMillis();
                guess = x.nextInt();
                if(guess!=answer){
                    System.out.println("Your answer is wrong.");
                    System.out.println(firstNumber+" * "+secondNumber+" should be "+ answer);
                    numberOfWrongAnswers++;
//                    WrongAns += ""+firstNumber+"*"+secondNumber+"="+guess+" ";
                }else {
                    System.out.println("Your answer is correct!");
                    numberOfCorrectAnswers++;
//                    CorrectAns += ""+firstNumber+"*"+secondNumber+"="+guess+" ";
                }
                endQuiz = System.currentTimeMillis();
                Student.setEstimatedTimeCompletion((endQuiz-startQuiz)/1000F+" seconds");
            }
        }

        if(getType_question().equals("division")){
            for (int i=0;i<Student.getNumberOfQuestions();i++){
                firstNumber =(int)(Math.random()*10);
                do {
                    secondNumber = (int) (Math.random() * 10);
                } while (secondNumber == 0);
                answer = firstNumber / secondNumber;
                System.out.print("What is "+firstNumber+" / "+secondNumber+" ? : ");
                startQuiz = System.currentTimeMillis();
                guess = x.nextInt();
                if(guess!=answer){
                    System.out.println("Your answer is wrong.");
                    System.out.println(firstNumber+" / "+secondNumber+" should be "+ answer);
                    numberOfWrongAnswers++;
//                    WrongAns += ""+firstNumber+"/"+secondNumber+"="+guess+" ";
                }else {
                    System.out.println("Your answer is correct!");
                    numberOfCorrectAnswers++;
//                    CorrectAns += ""+firstNumber+"/"+secondNumber+"="+guess+" ";
                }
                endQuiz = System.currentTimeMillis();
                Student.setEstimatedTimeCompletion((endQuiz-startQuiz)/1000F+" seconds");
            }
        }
    }
}

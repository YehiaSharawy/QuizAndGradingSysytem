public class TypeOfQuestions {
    private String type_question = null;
    private boolean continueLoop = true;
    public String getType_question() {
        return type_question;
    }

    public TypeOfQuestions(String type_question){
        this.type_question = type_question;
        setTypeOfQuestions();
    }

    public void setTypeOfQuestions(){
        do {
            switch (type_question) {
                case "R":
                case "r":
                    System.out.println("You chose RANDOM operation questions");
                    type_question = "random";
                    randomizeQuestion();
                    continueLoop = false;
                    break;
                case "+":
                    System.out.println("You chose ADDITION [+] operation questions");
                    type_question = "addition";
                    continueLoop = false;
                    break;
                case "-":
                    System.out.println("You chose SUBTRACTION [-] operation questions");
                    type_question = "subtraction";
                    continueLoop = false;
                    break;
                case "*":
                    System.out.println("You chose MULTIPLICATION [*] operation questions");
                    type_question = "multiplication";
                    continueLoop = false;
                    break;
                case "/":
                    System.out.println("You chose DIVISION [/] operation questions");
                    type_question = "division";
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Wrong Operation!! Try Again!!");
            }
        }while (continueLoop);
    }

    private void randomizeQuestion(){
        int random = (int) (Math.random() * 4);
        switch (random){
            case 0:
                type_question = "addition";break;
            case 1:
                type_question = "subtraction";break;
            case 2:
                type_question = "multiplication";break;
            case 3:
                type_question = "division";break;
            }
    }
}

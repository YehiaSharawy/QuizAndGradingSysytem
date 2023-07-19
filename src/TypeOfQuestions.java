public class TypeOfQuestions {
    private static String type_question = null;
    private boolean continueLoop = true;
    public static String getType_question() {
        return type_question;
    }
    public void setTypeOfQuestions(){
        do {
            switch (type_question) {
                case "R", "r" -> {
                    System.out.println("You chose RANDOM operation questions");
                    type_question = "random";
                    randomizeQuestion();
                    continueLoop = false;
                }
                case "+" -> {
                    System.out.println("You chose ADDITION [+] operation questions");
                    type_question = "addition";
                    continueLoop = false;
                }
                case "-" -> {
                    System.out.println("You chose SUBTRACTION [-] operation questions");
                    type_question = "subtraction";
                    continueLoop = false;
                }
                case "*" -> {
                    System.out.println("You chose MULTIPLICATION [*] operation questions");
                    type_question = "multiplication";
                    continueLoop = false;
                }
                case "/" -> {
                    System.out.println("You chose DIVISION [/] operation questions");
                    type_question = "division";
                    continueLoop = false;
                }
                default -> System.out.println("Wrong Operation!! Try Again!!");
            }
        }while (continueLoop);
    }
    public TypeOfQuestions(String type_question){
        TypeOfQuestions.type_question = type_question;
    }
    private void randomizeQuestion(){
        int random = (int) (Math.random() * 4);
        switch (random){
            case 0->type_question = "addition";
            case 1->type_question = "subtraction";
            case 2->type_question = "multiplication";
            case 3->type_question = "division";
            }
    }
}

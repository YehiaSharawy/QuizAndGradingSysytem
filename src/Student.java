public class Student {
    private String name;
    private String grade;
    static String estimatedTimeCompletion;
    private static int numberOfQuestions;

    public String getName() {
        return name;
    }
    public static int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setName(String name) {
        this.name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
    }
    public static void setNumberOfQuestions(int numberOfQuestions) {
        Student.numberOfQuestions = numberOfQuestions;
    }
    public static void setEstimatedTimeCompletion(String estimatedTimeCompletion) {
        Student.estimatedTimeCompletion = estimatedTimeCompletion;
    }

    public Student(String name, String grade, String estimatedTimeCompletion){
        setName(name);
        this.grade = grade;
        Student.estimatedTimeCompletion = estimatedTimeCompletion;
    }

    public Student(String name){
        this(name,"F","9999");
    }

}

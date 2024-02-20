package sr.qualogy.models;

public class Employee implements Person {
    @Override
    public void getKnowledge() {
        System.out.println("studie for certifcation");
    }

    @Override
    public void makeExam(){
        System.out.println("I'm getting certified");
    }

}

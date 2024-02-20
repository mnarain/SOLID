package sr.qualogy.models;

public class Employee extends Person {

    public Employee(String fullname) {
        super.fullname = fullname;
    }

    @Override
    public void getKnowledge() {
        System.out.println("studie for certifcation");
    }

    @Override
    public void makeExam(){
        System.out.println("I'm getting certified");
    }

}

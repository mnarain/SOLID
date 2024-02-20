package sr.qualogy.models;

public class Student extends Person {

    public Student(String fullname) {
        super.fullname = fullname;
    }

    @Override
    public void getKnowledge() {
        System.out.println("I'm studing for my exam");
    }

    @Override
    public void makeExam(){
        System.out.println("I'm doing exam");
    }

}

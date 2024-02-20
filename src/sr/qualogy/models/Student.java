package sr.qualogy.models;

public class Student implements Person {
    @Override
    public void getKnowledge() {
        System.out.println("I'm studing for my exam");
    }

    @Override
    public void makeExam(){
        System.out.println("I'm doing exam");
    }

}

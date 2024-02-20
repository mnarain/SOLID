package sr.qualogy.models;

public abstract class  Person {
     protected String fullname;
     public abstract void getKnowledge();

     public abstract void makeExam();

     public String getFullname() {
          return fullname;
     }
}




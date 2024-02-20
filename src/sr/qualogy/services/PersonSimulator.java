package sr.qualogy.services;

import sr.qualogy.models.Assesment;
import sr.qualogy.models.Person;

public class PersonSimulator{
   private Person p;
    public PersonSimulator(Person p) {
        this.p = p;
    }

    public void doExamAndCertification(){
        p.getKnowledge();
        p.makeExam();
    }

    public void setPersoon(Person person) {
        this.p = person;
    }
    
    public void doAssesment(Assesment assesment){
      assesment.process();
    }
    
}

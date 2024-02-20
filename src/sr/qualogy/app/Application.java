package sr.qualogy.app;

import sr.qualogy.models.EQAssesment;
import sr.qualogy.models.Employee;
import sr.qualogy.models.IQAssesment;
import sr.qualogy.models.Student;
import sr.qualogy.services.PersonSimulator;

class Application {
            public static void main(String[] args) {

                PersonSimulator ps = new PersonSimulator(new Employee());
                ps.doExamAndCertification();
                ps.doAssesment(new EQAssesment());
                ps.doAssesment(new IQAssesment());

                ps.setPersoon(new Student());
                ps.doExamAndCertification();
                ps.doAssesment(new EQAssesment());
                ps.doAssesment(new IQAssesment());
    }
}

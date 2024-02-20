package sr.qualogy.app;

import sr.qualogy.models.*;
import sr.qualogy.services.PersonSimulator;
import sr.qualogy.services.ReportService;

class Application {
    public static void main(String[] args) {

        Employee ben = new Employee("Ben");
        PersonSimulator ps = new PersonSimulator(ben);
        ps.doExamAndCertification();
        ps.doAssesment(new EQAssesment());
        ps.doAssesment(new IQAssesment());

        System.out.println();
        System.out.println();
        System.out.println();


        Student kevin = new Student("Kevin");
        ps.setPersoon(kevin);
        ps.doExamAndCertification();
        ps.doAssesment(new EQAssesment());
        ps.doAssesment(new IQAssesment());

        System.out.println();
        System.out.println();

        ReportService reportService = new EmployeeReportService();
        reportService.generateReport(ben);

        System.out.println();

        reportService = new StudentReportService();
        reportService.generateReport(kevin);
    }
}

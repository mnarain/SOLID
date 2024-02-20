package sr.qualogy.models;

import sr.qualogy.services.ReportService;

public class StudentReportService implements ReportService {
    @Override
    public void generateReport(Person person) {
        System.out.println("generate student report");
    }
}

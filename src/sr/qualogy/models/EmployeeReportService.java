package sr.qualogy.models;

import sr.qualogy.services.ReportService;

public class EmployeeReportService implements ReportService
{
    @Override
    public void generateReport(Person person)
    {
        System.out.println("Employee Report");
    }
}

package co.unicauca.microkernel.app;

import co.unicauca.microkernel.business.ProjectService;
import co.unicauca.microkernel.business.ReportService;

public class Application {
    public static void main(String[] args) {
        ProjectService projectService = new ProjectService();
        ReportService reportService = new ReportService();

        var projects = projectService.getAll();

        System.out.println("Reporte en formato HTML:");
        System.out.println(reportService.generateHtmlReport(projects));

        System.out.println("\nReporte en formato JSON:");
        System.out.println(reportService.generateJsonReport(projects));
    }
}
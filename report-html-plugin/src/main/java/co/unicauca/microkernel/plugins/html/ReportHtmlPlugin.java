package co.unicauca.microkernel.plugins.html;

import co.unicauca.microkernel.common.interfaces.IReportPlugin;
import co.unicauca.microkernel.common.project.Project;
import java.util.List;

public class ReportHtmlPlugin implements IReportPlugin {
    @Override
    public String generateReport(List<Project> data) {
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n")
            .append("<html lang=\"es\">\n")
            .append("<head>\n")
            .append("    <meta charset=\"UTF-8\">\n")
            .append("    <title>Reporte de Proyectos de Grado</title>\n")
            .append("</head>\n")
            .append("<body>\n")
            .append("    <h1>Reporte de Proyectos de Grado</h1>\n")
            .append("    <table border=\"1\" cellspacing=\"0\" cellpadding=\"5\">\n")
            .append("        <thead>\n")
            .append("            <tr>\n")
            .append("                <th> ID</th>\n")
            .append("                <th>Nombre del Proyecto</th>\n")
            .append("                <th> Fecha aprobación Formato A</th>\n")
            .append("                <th> Estudiante(s)</th>\n")
            .append("                <th> Profesor</th>\n")
            .append("                <th> Tipo</th>\n")
            .append("                <th> Programa</th>\n")
            .append("            </tr>\n")
            .append("        </thead>\n")
            .append("        <tbody>\n");

        for (Project project : data) {
            html.append("            <tr>\n")
                .append("                <td>").append(project.getId()).append("</td>\n")
                .append("                <td>").append(project.getName()).append("</td>\n")
                .append("                <td>").append(project.getApprovalDate()).append("</td>\n")
                .append("                <td>").append(String.join(", ", project.getStudents())).append("</td>\n")
                .append("                <td>").append(project.getProfessor()).append("</td>\n")
                .append("                <td>").append(project.getType()).append("</td>\n")
                .append("                <td>").append(project.getProgram()).append("</td>\n")
                .append("            </tr>\n");
        }

        html.append("        </tbody>\n")
            .append("    </table>\n")
            .append("    <p> Total de proyectos: ").append(data.size()).append("</p>\n")
            .append("</body>\n")
            .append("</html>");

        return html.toString();
    }
}
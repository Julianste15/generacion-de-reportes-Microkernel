package co.unicauca.microkernel.plugins.json;

import co.unicauca.microkernel.common.interfaces.IReportPlugin;
import co.unicauca.microkernel.common.project.Project;
import java.util.List;

public class ReportJsonPlugin implements IReportPlugin {
    @Override
    public String generateReport(List<Project> data) {
        StringBuilder json = new StringBuilder();
        json.append("[\n");
        
        for (int i = 0; i < data.size(); i++) {
            Project project = data.get(i);
            json.append("    {\n")
                .append("        \"id\": \"").append(project.getId()).append("\",\n")
                .append("        \"nombre\": \"").append(project.getName()).append("\",\n")
                .append("        \"fechaFormatoA\": \"").append(project.getApprovalDate()).append("\",\n")
                .append("        \"estudiantes\": ").append(listToJsonArray(project.getStudents())).append(",\n")
                .append("        \"profesor\": \"").append(project.getProfessor()).append("\",\n")
                .append("        \"tipo\": \"").append(project.getType()).append("\",\n")
                .append("        \"programa\": \"").append(project.getProgram()).append("\"\n")
                .append("    }");
            
            if (i < data.size() - 1) {
                json.append(",");
            }
            json.append("\n");
        }
        
        json.append("]");
        return json.toString();
    }

    private String listToJsonArray(List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append("\"").append(list.get(i)).append("\"");
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
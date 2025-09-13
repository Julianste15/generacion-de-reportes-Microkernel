package co.unicauca.microkernel.common.project;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Project implements Serializable {
    //atributos
    private String id;
    private String name;
    private LocalDate approvalDate;
    private List<String> students;
    private String professor;
    private String type;
    private String program;
    //constructores
    public Project()
    {
    }
    public Project(String id, String name, LocalDate approvalDate,List<String> students, String professor, String type, String program) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID del proyecto no puede ser nulo o vacío");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del proyecto no puede ser nulo o vacío");
        }
        if (approvalDate == null) {
            throw new IllegalArgumentException("La fecha de aprobación no puede ser nula");
        }
        if (students == null || students.isEmpty()) {
            throw new IllegalArgumentException("Debe haber al menos un estudiante asociado al proyecto");
        }
        if (professor == null || professor.trim().isEmpty()) {
            throw new IllegalArgumentException("El profesor no puede ser nulo o vacío");
        }
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de proyecto no puede ser nulo o vacío");
        }
        if (program == null || program.trim().isEmpty()) {
            throw new IllegalArgumentException("El programa no puede ser nulo o vacío");
        }
        this.id = id;
        this.name = name;
        this.approvalDate = approvalDate;
        this.students = students;
        this.professor = professor;
        this.type = type;
        this.program = program;
    }
    //getters
    public String getId() { return id; }
    public String getName() { return name; }
    public LocalDate getApprovalDate() { return approvalDate; }
    public List<String> getStudents() { return students; } 
    public String getProfessor() { return professor; } 
    public String getType() { return type; }
    public String getProgram() { return program; }
    //setters
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setApprovalDate(LocalDate approvalDate) { this.approvalDate = approvalDate; }
    public void setStudents(List<String> students) { this.students = students; }
    public void setProfessor(String professor) { this.professor = professor; } 
    public void setType(String type) { this.type = type; } 
    public void setProgram(String program) { this.program = program; }

    @Override
    public String toString() {
        return "Project{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", approvalDate=" + approvalDate +
            ", students=" + students +
            ", professor='" + professor + '\'' +
            ", type='" + type + '\'' +
            ", program='" + program + '\'' +
            '}';
    }
}

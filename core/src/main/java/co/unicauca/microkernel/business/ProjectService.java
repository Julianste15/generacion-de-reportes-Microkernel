package co.unicauca.microkernel.business;

import co.unicauca.microkernel.common.project.Project;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ProjectService {
    public List<Project> getAll() {
        return Arrays.asList(
            new Project("201", "Sistema de Gestión Académica en la Nube", LocalDate.of(2025, 3, 10),
                Arrays.asList("María López", "José Martínez"), "MSc. Carolina Ramírez", "Trabajo de Grado", "Sistemas"),

            new Project("305", "Control Automático de un Brazo Robótico", LocalDate.of(2025, 4, 18),
                Arrays.asList("Andrés Gutiérrez"), "PhD. Jorge Herrera", "Investigación", "Automática"),

            new Project("412", "Diseño de Circuito para Sensado de Temperatura", LocalDate.of(2025, 5, 22),
                Arrays.asList("Lucía Torres", "Pedro Castaño"), "Ing. Fernanda Morales", "Práctica Profesional", "Electrónica")
        );
    }
}

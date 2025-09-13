package co.unicauca.microkernel.common.interfaces;

import co.unicauca.microkernel.common.project.Project;
import java.util.List;

public interface IReportPlugin {
    String generateReport(List<Project> data);
}

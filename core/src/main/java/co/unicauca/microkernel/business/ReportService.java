package co.unicauca.microkernel.business;

import co.unicauca.microkernel.common.project.Project;
import co.unicauca.microkernel.common.interfaces.IReportPlugin;
import co.unicauca.microkernel.plugin.manager.ReportPluginManager;
import java.util.List;

public class ReportService {
    private ReportPluginManager pluginManager;

    public ReportService() {
        this.pluginManager = new ReportPluginManager();
    }

    public String generateHtmlReport(List<Project> data) {
        IReportPlugin plugin = pluginManager.getPlugin("html");
        return plugin.generateReport(data);
    }

    public String generateJsonReport(List<Project> data) {
        IReportPlugin plugin = pluginManager.getPlugin("json");
        return plugin.generateReport(data);
    }
}
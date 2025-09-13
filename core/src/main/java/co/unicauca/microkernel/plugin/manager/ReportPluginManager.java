package co.unicauca.microkernel.plugin.manager;

import co.unicauca.microkernel.common.interfaces.IReportPlugin;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReportPluginManager {
    private Properties properties;

    public ReportPluginManager() {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("plugin.properties")) {
            if (input == null) {
                throw new RuntimeException("No se pudo encontrar plugin.properties");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error cargando plugin.properties", e);
        }
    }

    public IReportPlugin getPlugin(String format) {
        String className = properties.getProperty(format);
        if (className == null) {
            throw new RuntimeException("Plugin no encontrado para el formato: " + format);
        }
        try {
            Class<?> clazz = Class.forName(className);
            return (IReportPlugin) clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Error cargando el plugin: " + className, e);
        }
    }
}
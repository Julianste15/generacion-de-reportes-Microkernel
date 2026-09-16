# Generación de Reportes - Microkernel 🧩

> Generador de reportes basado en arquitectura microkernel: el núcleo produce los datos y los plugins los exportan en distintos formatos.

**🇪🇸 Español:** El núcleo (`core`) recopila la información de los proyectos mediante `ProjectService` y el `ReportPluginManager` entrega los datos a cualquier plugin de formato registrado. Incluye plugins de **HTML** y **JSON**; añadir un formato nuevo (p. ej. PDF) solo requiere un plugin nuevo sin tocar el núcleo.

**🇺🇸 English:** A report generator built on the microkernel pattern. The core gathers project data and a plugin manager hands it to any registered format plugin. Ships with HTML and JSON plugins; adding a new format (e.g., PDF) only requires a new plugin—no core changes.

## ✨ Funcionalidades / Features

- Núcleo con `ReportService`, `ProjectService` y `ReportPluginManager`
- Plugins de formato: `ReportHtmlPlugin` y `ReportJsonPlugin` (interfaz `IReportPlugin`)
- Módulos Maven independientes (`common`, `core`, `report-*`)

## 🛠️ Tecnologías / Tech Stack

- Java · Maven · Arquitectura microkernel · Patrón *factory/manager* de plugins

## 🚀 Ejecución / Getting Started

```bash
mvn clean install
# Ejecutar la clase Application desde el módulo core
```

## 👤 Autor y contexto / About

Proyecto académico de la asignatura **Arquitecturas de Software** (Universidad del Cauca). © Julián Camacho.
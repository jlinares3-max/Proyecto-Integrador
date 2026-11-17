# Proyecto-Integrador
​
Descripción

Sistema en Java para la gestión de encuestas de hogares, registro de gastos, visitas y recolección de datos. El proyecto está construido utilizando Maven y emplea una base de datos Oracle para la persistencia de datos. Sigue una arquitectura de software estructurada en capas (Presentación, Negocio, Persistencia y Control).

Requisitos del Sistema

Java (JDK)

Apache Maven (pom.xml incluido)

Base de Datos Oracle

Entorno de desarrollo compatible (ej. Apache NetBeans, según indica el archivo nbactions.xml y los scripts SQL).

Estructura del Proyecto

El código fuente está organizado en los siguientes paquetes principales (src/main/java/):

control: Contiene el punto de entrada de la aplicación (Main.java).

negocio: Modelos y lógica de negocio (ej. Persona, Visita, Recolector, Encuestado, Sesion).

persistencia: Clases de acceso a datos y conexión con Oracle (ConexionOracle, LlamadasOracle, PersistenciaHogar, PersistenciaGastos, etc.).

presentacion: Clases para la interfaz gráfica, generación de reportes en PDF y menús por rol (Pantalla, Formulario, InformePdf, etc.).

Recursos Adicionales

sql/: Directorio con múltiples scripts numerados del 01 al 12 para la creación de la base de datos, catálogos, roles de usuario y conexión.

src/main/resources/fonts/: Fuentes utilizadas para la generación de reportes en PDF (DejaVuSans).

Documentación Interna

El proyecto cuenta con varios archivos de texto explicativos para módulos específicos. Se recomienda revisarlos para más detalles:

LEEME_ACTUALIZACION.txt

LEEME_CAMBIOS_INTERFAZ.txt

LEEME_DISENO.txt / LEEME_DISENO_PDF.txt

LEEME_INFORMES.txt

LEEME_REVISION_DIAS.txt

LEEME_TIPO_GASTO.txt

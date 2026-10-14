# Proyecto-Integrador
​ConexionBD.java (La Puerta de Enlace):
​Es la clase encargada de establecer la comunicación con el servidor de Oracle. Contiene la dirección IP, el puerto (1521), el usuario y la contraseña necesarios para abrir el canal de red entre la aplicación y la base de datos.
​GastoDAO.java (El Puente de Datos - DAO):
​Significa Data Access Object (Objeto de Acceso a Datos). Es la clase que traduce las acciones del usuario (como registrar el gasto de un artículo) en comandos seguros de SQL (INSERT) para que la información viaje desde la interfaz gráfica y quede almacenada directamente en las tablas de Oracle.
​VentanaLogin.java (Selector de Módulos):
​Permite elegir qué rol se va a presentar (Recolector o Encuestado) para abrir de forma limpia las pantallas correspondientes durante la sustentación.
​VentanaEncuestado.java (Módulo de Gastos Diarios):
​Es la interfaz gráfica donde el usuario registra los artículos comprados (nombre, cantidad, valor, tipo de gasto, etc.). Al presionar el botón de finalizar el día, los datos se recogen de la tabla visual y se envían a la base de datos a través del GastoDAO.
​VentanaCitasPendientes.java y VentanaSeguimientoHogar.java (Módulo de Campo):
​Son las pantallas diseñadas para simular la agenda y el control de las visitas que realiza el recolector a los hogares durante el ciclo de la encuesta.

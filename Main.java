
import java.sql.Connection;
// Crear otra clase publica llamda operacionesSQL y ahi en operaciones SQL creamos los metodos insertar crear consultar 
public class Main {
    public static void main(String[] args) {
        // Intentar conectar
        Connection con = ConexionOracle.obtenerConexion();

        if (con != null) {
            // Aquí puedes ejecutar tus consultas (Statements / PreparedStatements)
           
            // Cerrar la conexión al finalizar las operaciones
            ConexionOracle.cerrarConexion(con);
        } else {
            System.out.println("No se pudo realizar la conexión. Verifica la IP, puerto, SID o credenciales.");
        }
    }
    
}

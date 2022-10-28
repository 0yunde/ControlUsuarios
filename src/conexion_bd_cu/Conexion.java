
package conexion_bd_cu;
import java.sql.*;
/**
 * @author Victor Alejandro Rojas Yovaniniz
 */

//Esta clase permite  instanciar la conexión sin necesidad de rescribir este código
public class Conexion {
    //Conexión Local
    public static Connection conectar(){
        try {
            //Conexión a nuestra base de datos
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_cu", "root","nube1994");
            return cn;
        } catch (SQLException e) {
            
            System.out.println("Error en la conexión " + e );
        }
        return(null);
    }
}

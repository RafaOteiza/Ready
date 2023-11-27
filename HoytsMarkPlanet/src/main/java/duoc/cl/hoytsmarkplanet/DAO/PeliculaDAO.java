package duoc.cl.hoytsmarkplanet.DAO;


import java.sql.Connection;
import java.sql.DriverManager;

public class PeliculaDAO {

    public Connection conexion = null;

    public void conectar() {
        try {
            String url = "jdbc:mysql://localhost:3306/moviesdb";
            String user = "root";
            String password = "";
            conexion = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    
}
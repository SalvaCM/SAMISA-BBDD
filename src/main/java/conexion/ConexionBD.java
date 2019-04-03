package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {

	private Connection conexion = null;
	private final String driver = "com.mysql.jdbc.Driver";
	private final String user = "hr";
	private final String password = "samisa";
	private final String url = "jdbc:mysql://localhost:3307/alojamiento";
	
	public Connection ConectarBD() {
		
		try {	
			
			Class.forName(driver);
			conexion = DriverManager.getConnection(url, user, password);
			if(conexion != null){
				System.out.println("Conexion establecida");
			}
			
		} catch (Exception e) {		
			System.out.println("Error de conexion" + e);
		}
		
		
		return conexion;
	}
 
}

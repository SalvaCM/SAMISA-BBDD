package conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionBD {

	
		private Connection conexion = null;
		private final String driver = "com.mysql.cj.jdbc.Driver";
		private final String username = "reto4";
		private final String password = "1234";
		private final String urlBBDD = "jdbc:mysql://localhost:3306/alojamientos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		

		public Connection ConectarBD()
		{
			
			try
			{
				Class.forName(driver);
				conexion = DriverManager.getConnection(urlBBDD, username, password);
				if(conexion != null){
					System.out.println("Conexion establecida");
				}
			}
				catch (Exception e) {		
					System.out.println("Error de conexion" + e);
				}
			return conexion;
		}
		
		
		
	}


 


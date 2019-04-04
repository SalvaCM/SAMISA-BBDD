package conexion;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;

public class prueba {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	ConexionBD miConexion = new ConexionBD();
	ConsultaBD miConsulta = new ConsultaBD();

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnConexion = new JButton("conexion");
		btnConexion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					
				Connection conexion = miConexion.ConectarBD();  
				ResultSet rs = miConsulta.hacerConsultaBD(conexion, "select * from cliente where nombre = 'pepe';");
				
				
				
			/*while(rs.next()) {
					
					String nombre = rs.getString("nombre");
					int edad = rs.getInt("edad");
				
			
				}*/
				
						
			}
		});
		frame.getContentPane().add(btnConexion, BorderLayout.CENTER);
	}

}

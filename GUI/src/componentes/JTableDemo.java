package componentes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableDemo window = new JTableDemo();
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
	public JTableDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] nombreColumnas = {"Real Madrid", "Real Jaen", "Valdepeñas C.F."};
		Object[][] datos = {{"Casillas", "Quesada", "Ronaldo"},{"James", "Astrain", "David"},{"Pedrito", "Alberto", "Jose"}};
		
		ArrayList<Jugador> lista = new ArrayList<Jugador>();
		Jugador j1 = new Jugador("Pedro", "Madrid");
		Jugador j2 = new Jugador("Jose", "Deportivo");
		Jugador j3 = new Jugador("David", "Barcelona");
		Jugador j4 = new Jugador("Jose", "Madrid");
		
		
		JTable tabla = new JTable(datos,nombreColumnas);
		//Insertamos la tabla en un JscrollPane para evitar las cabeceras
		JScrollPane scrollPane = new JScrollPane(tabla);
		
		//para meter cabecera
		//frame.add(tabla.getTableHeader(), BorderLayout.NORTH);
		//inserciion de llos datos de la tabla
		frame.add(scrollPane, BorderLayout.CENTER);
		
		
		
		
	}

}

package componentes;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class JTreePersonasHijos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTreePersonasHijos window = new JTreePersonasHijos();
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
	public JTreePersonasHijos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PersonaHijos arbol = crearArbol();
		arbol.pintaArbol();
		
	}
	
	private PersonaHijos crearArbol(){
		PersonaHijos raiz = new PersonaHijos("Antonio", "Marin", "Marin");
		
		PersonaHijos antonio = new PersonaHijos("Antonio", "Marin", "Fernandez");
		PersonaHijos maria = new PersonaHijos("Maria", "Marin", "Fernandez");
		
		raiz.addHijos(antonio);
		raiz.addHijos(maria);
		
		PersonaHijos maria1 = new PersonaHijos("Jose", "Torres", "Marin");
		PersonaHijos maria2 = new PersonaHijos("Maria", "Gonzalez", "Marin");
		
		maria.addHijos(maria1);
		maria.addHijos(maria2);
		
		
		return raiz;
	}
	
	
}

package componentes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTreeDemo window = new JTreeDemo();
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
	public JTreeDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultMutableTreeNode datosJugadores = crearArbol();
		JTree arbolJugadores = new JTree(datosJugadores);
		
		JScrollPane scroll = new JScrollPane(arbolJugadores);
		
		frame.add(scroll, BorderLayout.CENTER);
		
	}
	
	private DefaultMutableTreeNode crearArbol(){
		DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Equipos");
		
		DefaultMutableTreeNode juve = new DefaultMutableTreeNode("Juve");
		DefaultMutableTreeNode barsa = new DefaultMutableTreeNode("Barça");
		DefaultMutableTreeNode jaen = new DefaultMutableTreeNode("Jaen");
		
		raiz.add(jaen);
		raiz.add(barsa);
		raiz.add(juve);
		
		DefaultMutableTreeNode jaen1 = new DefaultMutableTreeNode("Nando");
		DefaultMutableTreeNode jaen2 = new DefaultMutableTreeNode("Sutil");
		DefaultMutableTreeNode jaen3 = new DefaultMutableTreeNode("De la Calzada");
		DefaultMutableTreeNode jaen4 = new DefaultMutableTreeNode("Fede");
		DefaultMutableTreeNode jaen5 = new DefaultMutableTreeNode("Astrain");
		DefaultMutableTreeNode jaen6 = new DefaultMutableTreeNode("Gaitan");
		DefaultMutableTreeNode jaen7 = new DefaultMutableTreeNode("Pedrito");
		DefaultMutableTreeNode jaen8 = new DefaultMutableTreeNode("Quesada");
		
		jaen.add(jaen2);
		jaen.add(jaen1);
		jaen.add(jaen3);
		jaen.add(jaen4);
		jaen.add(jaen5);
		jaen.add(jaen6);
		jaen.add(jaen7);
		jaen.add(jaen8);
		
		DefaultMutableTreeNode juve1 = new DefaultMutableTreeNode("Morata");
		DefaultMutableTreeNode juve2 = new DefaultMutableTreeNode("Pirlo");
		DefaultMutableTreeNode juve3 = new DefaultMutableTreeNode("LLorente");
		DefaultMutableTreeNode juve4 = new DefaultMutableTreeNode("Chiellini");
		DefaultMutableTreeNode juve5 = new DefaultMutableTreeNode("Buffon");
		
		juve.add(juve1);
		juve.add(juve2);
		juve.add(juve3);
		juve.add(juve4);
		juve.add(juve5);
		
		DefaultMutableTreeNode barsa1 = new DefaultMutableTreeNode("Neymar");
		DefaultMutableTreeNode barsa2 = new DefaultMutableTreeNode("Pedro");
		DefaultMutableTreeNode barsa3 = new DefaultMutableTreeNode("Messi");
		DefaultMutableTreeNode barsa4 = new DefaultMutableTreeNode("Iniesta");
		DefaultMutableTreeNode barsa5 = new DefaultMutableTreeNode("Xavi");
		
		barsa.add(barsa1);
		barsa.add(barsa2);
		barsa.add(barsa3);
		barsa.add(barsa4);
		barsa.add(barsa5);
		
		DefaultMutableTreeNode min = new DefaultMutableTreeNode("3820");
		DefaultMutableTreeNode partidos = new DefaultMutableTreeNode("45");

		barsa1.add(min);
		barsa1.add(partidos);
		
		return raiz;
		
	}

}

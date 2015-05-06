package contenedores;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDemo {
	private JFrame ventana;
	
	
	public JFrameDemo(){
		ventana = new JFrame("Ventana de prueba");
		JButton boton = new JButton("Botoncico");
		JButton boton1 = new JButton("Botoncico");
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout miFlowLayout = new FlowLayout(FlowLayout.LEFT, 10, 10);
		ventana.setLayout(miFlowLayout);
		ventana.add(boton);
		ventana.add(boton1);
		ventana.setVisible(true);
		//Le damos valores de ancho y alto sin sefinir la posicion
		//ventana.setSize(200, 300);
		//En este caso definimos tamaño y posicion
		//ventana.setBounds(400, 100, 400, 200);
		//Ajusta al tamaño del texto
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		
		
	}
	public static void main(String[] args) {
		
		new JFrameDemo();
		
	}
}	
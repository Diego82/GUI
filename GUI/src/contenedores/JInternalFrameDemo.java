package contenedores;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JInternalFrameDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrameDemo window = new JInternalFrameDemo();
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
	public JInternalFrameDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDesktopPane escritorio = new JDesktopPane();
		frame.getContentPane().add(escritorio, BorderLayout.CENTER);
		
		//Creamos una ventana interna

		JInternalFrame v1 = new JInternalFrame("Ventana Interna 1");
		v1.setResizable(true);
		v1.setClosable(true);
		v1.setIconifiable(true);
		v1.setVisible(true);
		v1.setBounds(0, 0, 150, 100);
		escritorio.add(v1);
		JButton boton1 = new JButton("boton");
		v1.getContentPane().add(boton1, BorderLayout.CENTER);
		
		JInternalFrame v2 = new JInternalFrame("Ventana Interna 2");
		v2.setResizable(true);
		v2.setClosable(true);
		v2.setIconifiable(true);
		v2.setVisible(true);
		v2.setBounds(160, 80, 150, 100);
		v2.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
		escritorio.add(v2);
		
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnCerrarTodo = new JButton("Cerrar Ventanas");
		btnCerrarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame[] array = escritorio.getAllFrames();
				for(int i = 0; i < array.length; i++) {
					JInternalFrame ventana = array[i];
					ventana.setVisible(false);
				}
			}
		});
		panel.add(btnCerrarTodo);
		
		JButton btnAbrirTodo = new JButton("Abrir Todo");
		btnAbrirTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JInternalFrame[] array = escritorio.getAllFrames();
				for(int i = 0; i < array.length; i++) {
					JInternalFrame ventana = array[i];
					ventana.setVisible(true);
				}
			}
		});
		panel.add(btnAbrirTodo);
		
		
		v2.addInternalFrameListener(new InternalFrameListener() {
			
			@Override
			public void internalFrameOpened(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameIconified(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameDeiconified(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameDeactivated(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				int returnVal = JOptionPane.showConfirmDialog(v2, "¿Realmente quieres cerrar la ventana?");
				if (returnVal == JOptionPane.OK_OPTION) {
					e.getInternalFrame().setVisible(false);
					e.getInternalFrame().dispose();
				}
				
			}
			
			@Override
			public void internalFrameClosed(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameActivated(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
}
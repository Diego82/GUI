package contenedores;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class JScrollPaneDemo {

	private JFrame frame;
	private JFileChooser infile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JScrollPaneDemo window = new JScrollPaneDemo();
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
	public JScrollPaneDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		infile = new JFileChooser();
		
			
		JTextArea textAreaIzq = new JTextArea();
		JScrollPane scrollPaneIzq = new JScrollPane(textAreaIzq);
		scrollPaneIzq.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneIzq.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneIzq.setViewportView(textAreaIzq);
				
		JTextArea textAreaDch = new JTextArea();
		JScrollPane scrollPaneDch = new JScrollPane(textAreaDch);
		scrollPaneDch.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneDch.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneDch.setViewportView(textAreaDch);
				
		JTextArea textAreaInferior = new JTextArea();
		JScrollPane scrollPaneInferior = new JScrollPane(textAreaInferior);
		scrollPaneInferior.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPaneInferior.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPaneInferior.setViewportView(textAreaInferior);
		
		JSplitPane splitPaneHorizontal = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scrollPaneIzq,scrollPaneDch);
		splitPaneHorizontal.setResizeWeight(0.5);
		splitPaneHorizontal.setDividerSize(15);
		splitPaneHorizontal.setOneTouchExpandable(true);
		
		JSplitPane splitVertical = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitPaneHorizontal, scrollPaneInferior);
		splitVertical.setResizeWeight(0.5);
		
		
		
		
		
		frame.getContentPane().add(splitVertical, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu MenuAbrir = new JMenu("Abrir");
		menuBar.add(MenuAbrir);
		
		JMenuItem BotonAbrirIzq = new JMenuItem("Abrir en la Izquierda");
		BotonAbrirIzq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int returnV = infile.showOpenDialog(frame);
				if (returnV==JFileChooser.APPROVE_OPTION) {
					File archivo = infile.getSelectedFile();
					AddArchivo f1 = new AddArchivo(archivo);
					textAreaIzq.setText(f1.getArchivo());
				}
				
			}
		});
		MenuAbrir.add(BotonAbrirIzq);
		
		JMenuItem botonAbrirDch = new JMenuItem("Abrir de la derecha");
		botonAbrirDch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MenuAbrir.add(botonAbrirDch);
		
		JMenu BontonSalir = new JMenu("Salir");
		BontonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		MenuAbrir.add(BontonSalir);
		
		JMenu menuComparar = new JMenu("Comparar");
		menuBar.add(menuComparar);
		
		JMenuItem BotonComparar = new JMenuItem("Comparar");
		BotonComparar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuComparar.add(BotonComparar);
		
		
		
		
	}

}
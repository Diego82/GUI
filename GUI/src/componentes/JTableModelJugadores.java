package componentes;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class JTableModelJugadores extends AbstractTableModel {

	ArrayList<Jugador> jugadores;
	
	public JTableModelJugadores(ArrayList<Jugador> lista) {
		// TODO Auto-generated constructor stub
		this.jugadores = lista;
	}
	
	
	@Override
	public int getRowCount() { //numero de filas
		// TODO Auto-generated method stub
		return jugadores.size();
	}

	@Override
	public int getColumnCount() { //numero de columnas
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) { //numero de filas y columnas
		// TODO Auto-generated method stub
		Jugador j = jugadores.get(rowIndex);
		if (columnIndex ==0)
			return j.getNombre();
		else if (columnIndex==1)
			return j.getEquipo();
		else
			return "";
			
		
	}

}

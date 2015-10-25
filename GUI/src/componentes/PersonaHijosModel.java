package componentes;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class PersonaHijosModel implements TreeModel {

	PersonaHijos raiz;
	@Override
	public Object getRoot() {
		// TODO Auto-generated method stub
		return raiz;
	}

	@Override
	public Object getChild(Object parent, int i) {
		// TODO Auto-generated method stub
		PersonaHijos nodo = (PersonaHijos) parent;
		return nodo.getHijo(i);
	}

	@Override
	public int getChildCount(Object parent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLeaf(Object node) {
		// TODO Auto-generated method stub
		return false;
	}

}

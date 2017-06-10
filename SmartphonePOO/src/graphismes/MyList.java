package graphismes;
import java.awt.Color;
import java.util.Vector;
import javax.swing.*;
import fonctionsSmartphone.*;

/**
 * Extends de JList
 * Gestion des styles par défaut
 * @author Jacques
 * @see Settings
 * @see Contact
 * @param <Contact> Classe des Contacts
 */
public class MyList<Contact> extends JList<Contact> {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur de lContact
	 * @see AppContact.lContact 
	 * @param lst Component Liste (JList)
	 */
	public MyList(final JList<?> lst) {
		super();
		this.setBackground(Color.BLACK);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.setBorder(BorderFactory.createEmptyBorder());
		this.setFixedCellHeight(50);
	}
	/**
	 * Mise à jour de lContact
	 * @see AppContact.lContact
	 * @param lst Component Liste (JList)
	 * @param co Classe Contacts
	 */
	public MyList(final MyList<Contact> lst,Vector<Contact> co) {
		super(co);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.setBorder(BorderFactory.createEmptyBorder());
		this.setFixedCellHeight(50);
	}

}

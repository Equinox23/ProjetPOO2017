package classSmartphone;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Smartphone extends JFrame{
	
	protected JFrame frameSmartphone;	


	public Smartphone() {
		
		/*
		 * Frame principale accueillant 
		 * - les différents panel des fonctions 
		 * - les fonctions communes 
		 */		

		frameSmartphone = new JFrame();
		frameSmartphone.setResizable(false);
		frameSmartphone.setTitle("Smartphone");
		frameSmartphone.getContentPane().setBackground(Color.BLACK);
		frameSmartphone.setSize(480,800);
		frameSmartphone.setUndecorated(true);
		frameSmartphone.setLocationRelativeTo(null);		
		frameSmartphone.getContentPane().setLayout(null);
		
		/*
		 *  Panel menu permet de séléctionner les fonctions 
		 */
				
		final JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0,0,0,150));
		panelMenu.setBounds(15, 15, 450, 700);
		frameSmartphone.getContentPane().add(panelMenu);
		panelMenu.setVisible(true);		
		
		/*
		 * Panel contact permet de séléctionner l'application contact 
		 */
		
		final JPanel panelContact = new JPanel();
		panelContact.setBackground(Color.DARK_GRAY);
		panelContact.setBounds(15, 15, 450, 700);
		frameSmartphone.getContentPane().add(panelContact);
		panelContact.setVisible(false);
		panelContact.setLayout(null);
				
		final JPanel panelNewContact = new JPanel();
		panelNewContact.setBackground(Color.DARK_GRAY);
		panelNewContact.setBounds(15, 15, 450, 700);
		panelContact.getRootPane().add(panelNewContact);
		panelNewContact.setLayout(null);
		panelNewContact.setVisible(false);

		/*
		 * Panel contact permet de séléctionner l'application Gallerie 
		 */
		
		final JPanel panelGallerie = new JPanel();
		panelGallerie.setBackground(Color.DARK_GRAY);
		panelGallerie.setBounds(15, 15, 450, 700);
		frameSmartphone.getContentPane().add(panelGallerie);
		panelGallerie.setVisible(false);
		panelGallerie.setLayout(null);
		
		JPanel Grille = new JPanel();
		Grille.setBackground(Color.DARK_GRAY);
		Grille.setBounds(10, 11, 430, 575);
		panelGallerie.add(Grille);
		Grille.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon(Smartphone.class.getResource("/imgGallerie/DSC_0187.JPG")));
		btnNewButton_1.setBounds(10, 11, 130, 130);
		Grille.add(btnNewButton_1);
		
		JButton button = new JButton("New button");
		button.setIcon(new ImageIcon(Smartphone.class.getResource("/imgGallerie/DSC_0251.JPG")));
		button.setBounds(150, 11, 130, 130);
		Grille.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setIcon(new ImageIcon(Smartphone.class.getResource("/imgGallerie/DSC_0301.JPG")));
		button_1.setBounds(290, 11, 130, 130);
		Grille.add(button_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(10, 152, 130, 130);
		Grille.add(button_2);
		
		JButton button_3 = new JButton("New button");
		button_3.setBounds(150, 152, 130, 130);
		Grille.add(button_3);
		
		JButton button_4 = new JButton("New button");
		button_4.setBounds(290, 152, 130, 130);
		Grille.add(button_4);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(10, 293, 130, 130);
		Grille.add(button_5);
		
		JButton button_6 = new JButton("New button");
		button_6.setBounds(10, 434, 130, 130);
		Grille.add(button_6);
		panelGallerie.setVisible(false);
		JButton AjouterPhoto = new JButton("+ Photo");
		AjouterPhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		AjouterPhoto.setBounds(10, 10, 140, 140);
		panelNewContact.add(AjouterPhoto);
		
		JTextField txtfldTel = new JTextField();
		txtfldTel.setText("Téléphone");
		txtfldTel.setBounds(166, 196, 262, 40);
		txtfldTel.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtfldTel.setText("");
		    }
		});
		panelNewContact.add(txtfldTel);
		
		JTextField txtfldPrnom = new JTextField();
		txtfldPrnom.setText("Prénom ");
		txtfldPrnom.setBounds(166, 10, 262, 54);
		txtfldPrnom.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtfldPrnom.setText("");
		    }
		});
		panelNewContact.add(txtfldPrnom);
		
		JTextField txtfldNom = new JTextField();
		txtfldNom.setText("Nom ");
		txtfldNom.setBounds(166, 80, 262, 54);
		txtfldNom.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtfldNom.setText("");
		    }
		});
		panelNewContact.add(txtfldNom);
		
		JTextField txtfldMail = new JTextField();
		txtfldMail.setText("E-Mail");
		txtfldMail.setBounds(166, 287, 262, 40);
		txtfldMail.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtfldMail.setText("");
		    }
		});
		panelNewContact.add(txtfldMail);
		
		JLabel lblTlphone = new JLabel("Téléphone");
		lblTlphone.setForeground(Color.WHITE);
		lblTlphone.setBounds(20, 158, 154, 29);
		panelNewContact.add(lblTlphone);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mobile", "Bureau", "Domicile"}));
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(Color.DARK_GRAY);
		comboBox.setBounds(10, 196, 126, 40);
		panelNewContact.add(comboBox);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(20, 249, 154, 29);
		panelNewContact.add(lblEmail);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Domicile", "Bureau"}));
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setBackground(Color.DARK_GRAY);
		comboBox_1.setBounds(10, 287, 126, 40);
		panelNewContact.add(comboBox_1);
		
		JLabel lblAdressePostale = new JLabel("Adresse postale");
		lblAdressePostale.setForeground(Color.WHITE);
		lblAdressePostale.setBounds(20, 351, 229, 29);
		panelNewContact.add(lblAdressePostale);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Domicile", "Bureau"}));
		comboBox_2.setForeground(Color.WHITE);
		comboBox_2.setBackground(Color.DARK_GRAY);
		comboBox_2.setBounds(10, 390, 126, 40);
		panelNewContact.add(comboBox_2);
		
		JTextField txtRue = new JTextField();
		txtRue = new JTextField();
		txtRue.setText("Rue");
		txtRue.setBounds(166, 391, 262, 40);
		panelNewContact.add(txtRue);
		
			
		
		JButton btnAjouterContact = new JButton("Ajouter Contact");
		btnAjouterContact.setBounds(0, 0, 197, 37);
		panelContact.add(btnAjouterContact);
		btnAjouterContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNewContact.setVisible(true);
				panelContact.setVisible(false);
			}
		});			
		
		
		JButton buttonGallerie = new JButton("");
		buttonGallerie.setBounds(25, 25, 75, 75);
		buttonGallerie.setForeground(Color.WHITE);
		buttonGallerie.setBackground(new Color(0,0,0,0));
		buttonGallerie.setIcon(new ImageIcon(Smartphone.class.getResource("/imgSmartphone/008-photo-camera.png")));
		buttonGallerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelGallerie.setVisible(true);
				panelMenu.setVisible(false);
			}
		});
		
		
		JButton buttonContact = new JButton("");
		buttonContact.setBounds(122, 25, 75, 75);
		buttonContact.setBackground(new Color(0,0,0,0));
		buttonContact.setIcon(new ImageIcon(Smartphone.class.getResource("/imgSmartphone/011-phone-book.png")));
		buttonContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelContact.setVisible(true);
				panelMenu.setVisible(false);
			}
		});
		panelMenu.setLayout(null);
		panelMenu.add(buttonGallerie);
		panelMenu.add(buttonContact);
				
		JLabel label = new JLabel("baborOS");
		label.setBounds(649, 1172, 91, 29);
		frameSmartphone.getContentPane().add(label);
		label.setForeground(Color.LIGHT_GRAY);
		
		JButton buttonMenu = new JButton("Menu");
		buttonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.setVisible(true);
				panelContact.setVisible(false);
				panelGallerie.setVisible(false);
				panelNewContact.setVisible(false);
			}
		});
		buttonMenu.setBounds(215, 750, 50, 20);
		frameSmartphone.getContentPane().add(buttonMenu);
		
		JLabel fondEcran = new JLabel("");
		fondEcran.setBounds(15, 15, 450, 700);
		frameSmartphone.getContentPane().add(fondEcran);
		fondEcran.setIcon(new ImageIcon(Smartphone.class.getResource("/imgSmartphone/DSC_000001(1).JPG")));
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnFermer.setBounds(310, 742, 155, 37);
		frameSmartphone.getContentPane().add(btnFermer);
		
	}
}

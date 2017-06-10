package graphismes;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;
import fonctionsSmartphone.*;

public class MainFrame {
	
	protected JFrame frameSmartphone;
	public static JScrollPane scrollPane;
	public static MyList<Contact> listContact;
	
	public MainFrame() {
		
		/*Chargement de la liste des contacts à l'ouverture*/
		ContactList.listContact= ContactList.ChargerListContact();

		/*Définition de la trame de fond*/
		frameSmartphone = new JFrame();
		frameSmartphone.setResizable(false);
		frameSmartphone.getContentPane().setBackground(Color.BLACK);
		frameSmartphone.setSize(430,750);
		frameSmartphone.setUndecorated(true);
		frameSmartphone.setLocationRelativeTo(null);		
		frameSmartphone.getContentPane().setLayout(null);
				
		/*-------------------------------------------------------------------------------------------------------------------*/
		/*CREATION DE TOUT LES PANELS*/
		/*-------------------------------------------------------------------------------------------------------------------*/
		
		/*Création du menu de base*/
		final JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0,0,0,150));
		panelMenu.setBounds(15, 15, 400, 650);
		frameSmartphone.getContentPane().add(panelMenu);
		panelMenu.setVisible(false);
		
		/*Création du panel contact*/
		final JPanel panelContact = new JPanel();
		panelContact.setBackground(new Color(0,0,0,150));
		panelContact.setBounds(15, 15, 400, 650);
		frameSmartphone.getContentPane().add(panelContact);
		panelContact.setVisible(false);
		panelContact.setLayout(null);
		
		/*Création du panel nouveau contact*/
		final JPanel panelNewContact = new JPanel();
		panelNewContact.setBackground(new Color(0,0,0,150));
		panelNewContact.setBounds(15, 15, 400, 650);
		frameSmartphone.getContentPane().add(panelNewContact);
		panelNewContact.setVisible(false);
		panelContact.setLayout(null);
		
		/*Création du panel galerie photo*/
		final JPanel galeriePhoto = new JPanel();
		galeriePhoto.setBackground(new Color(0,0,0,150));
		galeriePhoto.setBounds(15, 15, 400, 650);
		frameSmartphone.getContentPane().add(galeriePhoto);
		galeriePhoto.setVisible(false);
		panelContact.setLayout(null);
		
		JLabel fondEcran = new JLabel();
		fondEcran.setBounds(15, 15, 400, 650);
		frameSmartphone.getContentPane().add(fondEcran);
		fondEcran.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/fondEcran.jpg")));
		
		/*-------------------------------------------------------------------------------------------------------------------*/
		/*CREATION DE TOUT LES CHAMPS*/
		/*-------------------------------------------------------------------------------------------------------------------*/
		
		
		listContact = new MyList<Contact>(listContact,new Vector<Contact>(ContactList.listContact));
		scrollPane = new JScrollPane(listContact);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.setViewportView(listContact);
		panelContact.add(scrollPane);
		
		/*Création des champs d'ajout de contact*/
		JTextField txtPrenom = new JTextField();
		txtPrenom.setText("Prénom ");
		txtPrenom.setBounds(166, 10, 262, 54);
		txtPrenom.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtPrenom.setText("");
		    }
		});
		panelNewContact.add(txtPrenom);
		
		JTextField txtNom = new JTextField();
		txtNom.setText("Nom ");
		txtNom.setBounds(166, 80, 262, 54);
		txtNom.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtNom.setText("");
		    }
		});
		panelNewContact.add(txtNom);
		
		/*-------------------------------------------------------------------------------------------------------------------*/
		/*CREATION DE TOUT LES BOUTONS*/
		/*-------------------------------------------------------------------------------------------------------------------*/	
		
		panelMenu.setLayout(null);
		
		/*Création du bouton "Menu"*/
		JButton buttonMenu = new JButton();
		buttonMenu.setBounds(190, 682, 50, 50);
		buttonMenu.setBackground(Color.black);
		buttonMenu.setBorder(null);
		buttonMenu.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/home.png")));
		buttonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonMenu.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonMenu.setBackground(Color.black);
		    }
		});
		buttonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(true);
				panelContact.setVisible(false);
				galeriePhoto.setVisible(false);
				panelNewContact.setVisible(false);
			}
		});
		frameSmartphone.getContentPane().add(buttonMenu);
		
		/*Création du bouton "Fermer"*/
		JButton buttonFermer = new JButton();
		buttonFermer.setBounds(280, 682, 50, 50);
		buttonFermer.setBackground(Color.black);
		buttonFermer.setBorder(null);
		buttonFermer.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/shutdown.png")));
		buttonFermer.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonFermer.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonFermer.setBackground(Color.black);
		    }
		});
		buttonFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		frameSmartphone.getContentPane().add(buttonFermer);
		
		/*Création du bouton "Verrouiller"*/
		JButton buttonVerrouiller = new JButton();
		buttonVerrouiller.setBounds(100, 682, 50, 50);
		buttonVerrouiller.setBackground(Color.black);
		buttonVerrouiller.setBorder(null);
		buttonVerrouiller.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/verrouiller.png")));
		buttonVerrouiller.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonVerrouiller.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonVerrouiller.setBackground(Color.black);
		    }
		});
		buttonVerrouiller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenu.setVisible(false);
				panelContact.setVisible(false);
				galeriePhoto.setVisible(false);
				panelNewContact.setVisible(false);
			}
		});
		frameSmartphone.getContentPane().add(buttonVerrouiller);
		
		/*Création du bouton "Accès galerie photo"*/
		JButton buttonGaleriePhoto = new JButton();
		buttonGaleriePhoto.setBounds(25, 25, 100, 100);
		buttonGaleriePhoto.setBackground(Color.black);
		buttonGaleriePhoto.setBorder(null);
		buttonGaleriePhoto.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/logoPhoto.png")));
		buttonGaleriePhoto.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonGaleriePhoto.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonGaleriePhoto.setBackground(Color.black);
		    }
		});
		buttonGaleriePhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				galeriePhoto.setVisible(true);
				panelMenu.setVisible(false);
			}
		});
		panelMenu.add(buttonGaleriePhoto);
		
		/*Création du bouton "Accès aux contacts"*/
		JButton buttonContact = new JButton();
		buttonContact.setBounds(150, 25, 100, 100);
		buttonContact.setBackground(Color.black);
		buttonContact.setBorder(null);
		buttonContact.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/logoContact.png")));
		buttonContact.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonContact.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonContact.setBackground(Color.black);
		    }
		});
		buttonContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelContact.setVisible(true);
				panelMenu.setVisible(false);
			}
		});
		panelMenu.add(buttonContact);
		
		/*Création du bouton "Ajouter contact"*/
		JButton buttonAjouterContact = new JButton();
		panelContact.add(buttonAjouterContact);
		buttonAjouterContact.setBounds(10, 10, 75, 75);
		buttonAjouterContact.setBackground(Color.black);
		buttonAjouterContact.setBorder(null);
		buttonAjouterContact.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/addcontact.png")));
		buttonAjouterContact.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonAjouterContact.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonAjouterContact.setBackground(Color.black);
		    }
		});
		buttonAjouterContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNewContact.setVisible(true);
				panelContact.setVisible(false);
			}
		});
		
		/*Création du bouton "Sauvegarder"*/
		JButton buttonSave = new JButton("Sauver");
		panelNewContact.add(buttonSave);
		buttonSave.setBounds(10, 100, 75, 75);
		buttonSave.setBackground(Color.black);
		buttonSave.setBorder(null);
		buttonSave.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonSave.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonSave.setBackground(Color.black);
		    }
		});
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}


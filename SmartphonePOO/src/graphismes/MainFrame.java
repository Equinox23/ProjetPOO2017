package graphismes;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import fonctionsSmartphone.*;

public class MainFrame {
	
	protected JFrame frameSmartphone;
	
	private JPanel panelContact;
	private JPanel panelMenu;
	private JPanel panelNewContact;
	private JPanel galeriePhoto;
	
	private JLabel fondEcran;
	
	private JTextField firstNamef;
	private JTextField lastNamef;
	
	private JButton buttonMenu;
	private JButton buttonFermer;
	private JButton buttonVerrouiller;
	private JButton buttonGaleriePhoto;
	private JButton buttonContact;
	private JButton buttonAjouterContact;
	private JButton buttonSave;
	
	private JList jlistContact ;
	
	public MainFrame() throws ClassNotFoundException, IOException {
		
		ArrayList<Contact> arraylistContact = new ArrayList<Contact>();
		
		ContactFile.DownloadDataContact("./BDDContacts",arraylistContact);
		
		jlistContact = new JList(arraylistContact.toArray());
		Contact newContact = new Contact();
		
		/*Définition de la trame de fond*/
		frameSmartphone = new JFrame();
		frameSmartphone.setResizable(false);
		frameSmartphone.getContentPane().setBackground(Color.BLACK);
		frameSmartphone.setSize(430,750);
		frameSmartphone.setUndecorated(true);
		frameSmartphone.setLocationRelativeTo(null);		
		frameSmartphone.getContentPane().setLayout(null);
				
		/*-------------------------------------------------------------------------------------------------------------------*/
		/*CREATION DE TOUS LES PANELS*/
		/*-------------------------------------------------------------------------------------------------------------------*/
		
		/*Création du menu de base*/
		panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0,0,0,150));
		panelMenu.setBounds(15, 15, 400, 650);
		frameSmartphone.getContentPane().add(panelMenu);
		panelMenu.setVisible(false);
		
		/*Création du panel contact*/
		panelContact = new JPanel();
		panelContact.setBackground(new Color(0,0,0,150));
		panelContact.setBounds(15, 15, 400, 650);
		frameSmartphone.getContentPane().add(panelContact);
		panelContact.setVisible(false);
		panelContact.setLayout(null);
		
		/*Création du panel nouveau contact*/
		panelNewContact = new JPanel();
		panelNewContact.setBackground(new Color(0,0,0,150));
		panelNewContact.setBounds(15, 15, 400, 650);
		frameSmartphone.getContentPane().add(panelNewContact);
		panelNewContact.setVisible(false);
		panelContact.setLayout(null);
		
		/*Création du panel galerie photo*/
		galeriePhoto = new JPanel();
		galeriePhoto.setBackground(new Color(0,0,0,150));
		galeriePhoto.setBounds(15, 15, 400, 650);
		frameSmartphone.getContentPane().add(galeriePhoto);
		galeriePhoto.setVisible(false);
		panelContact.setLayout(null);
		
		fondEcran = new JLabel();
		fondEcran.setBounds(15, 15, 400, 650);
		frameSmartphone.getContentPane().add(fondEcran);
		fondEcran.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/fondEcran.jpg")));
		
/*-------------------------------------------------------------------------------------------------------------------*/
/*CREATION DE TOUT LES CHAMPS*/
/*-------------------------------------------------------------------------------------------------------------------*/
		
	/*Création des champs d'ajout de contact*/
		
		/*Prénom*/
		firstNamef = new JTextField();
		firstNamef.setText("");
		firstNamef.setBounds(10, 10, 40, 10);
		firstNamef.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	firstNamef.setText("");
		    }
		});
		panelNewContact.add(firstNamef);
		
		/*Nom*/
		lastNamef = new JTextField();
		lastNamef.setText("");
		lastNamef.setBounds(10, 10, 40, 10);
		lastNamef.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	lastNamef.setText("");
		    }
		});
		panelNewContact.add(lastNamef);
		
	/*Création des champs du menu contact*/
		
		/*Insertion de la liste des contacts*/
		panelContact.add(jlistContact);
		jlistContact.setBounds(0, 100, 400, 550);
		jlistContact.setBackground(new Color(215,216,216));
		jlistContact.setFixedCellHeight(45);
		jlistContact.setBorder(new EmptyBorder(10, 10, 10, 10));
		Font font = new Font("Roboto", Font.PLAIN, 15);
		jlistContact.setFont(font);
		
		jlistContact.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub

				firstNamef.setText(arraylistContact.get(e.getLastIndex()).getFirstname());
				lastNamef.setText(arraylistContact.get(e.getLastIndex()).getLastname());
				
				panelNewContact.setVisible(true);
				panelContact.setVisible(false);
			}
		});
		
/*-------------------------------------------------------------------------------------------------------------------*/
/*CREATION DE TOUT LES BOUTONS*/
/*-------------------------------------------------------------------------------------------------------------------*/	
		
		panelMenu.setLayout(null);
		
	/*Création du bouton "Menu"*/
		buttonMenu = new JButton();
		buttonMenu.setBounds(190, 682, 50, 50);
		buttonMenu.setBackground(Color.black);
		buttonMenu.setBorder(null);
		buttonMenu.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/home.png")));
		
		/*Ajout du hover au survol de la souris*/
		buttonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonMenu.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonMenu.setBackground(Color.black);
		    }
		});
		
		/*Ajout de l'action du bouton*/
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
		buttonFermer = new JButton();
		buttonFermer.setBounds(280, 682, 50, 50);
		buttonFermer.setBackground(Color.black);
		buttonFermer.setBorder(null);
		buttonFermer.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/shutdown.png")));
		
		/*Ajout du hover au survol de la souris*/
		buttonFermer.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonFermer.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonFermer.setBackground(Color.black);
		    }
		});
		
		/*Ajout de l'action du bouton*/
		buttonFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					ContactFile.UploadDataContact(arraylistContact);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		frameSmartphone.getContentPane().add(buttonFermer);
		
	/*Création du bouton "Verrouiller"*/
		buttonVerrouiller = new JButton();
		buttonVerrouiller.setBounds(100, 682, 50, 50);
		buttonVerrouiller.setBackground(Color.black);
		buttonVerrouiller.setBorder(null);
		buttonVerrouiller.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/verrouiller.png")));
		
		/*Ajout du hover au survol de la souris*/
		buttonVerrouiller.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonVerrouiller.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonVerrouiller.setBackground(Color.black);
		    }
		});
		
		/*Ajout de l'action du bouton*/
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
		buttonGaleriePhoto = new JButton();
		buttonGaleriePhoto.setBounds(25, 25, 100, 100);
		buttonGaleriePhoto.setBackground(Color.black);
		buttonGaleriePhoto.setBorder(null);
		buttonGaleriePhoto.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/logoPhoto.png")));
		
		/*Ajout du hover au survol de la souris*/
		buttonGaleriePhoto.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonGaleriePhoto.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonGaleriePhoto.setBackground(Color.black);
		    }
		});
		
		/*Ajout de l'action du bouton*/
		buttonGaleriePhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				galeriePhoto.setVisible(true);
				panelMenu.setVisible(false);
			}
		});
		panelMenu.add(buttonGaleriePhoto);
		
	/*Création du bouton "Accès aux contacts"*/
		buttonContact = new JButton();
		buttonContact.setBounds(150, 25, 100, 100);
		buttonContact.setBackground(Color.black);
		buttonContact.setBorder(null);
		buttonContact.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/logoContact.png")));
		
		/*Ajout du hover au survol de la souris*/
		buttonContact.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonContact.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonContact.setBackground(Color.black);
		    }
		});
		
		/*Ajout de l'action du bouton*/
		buttonContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelContact.setVisible(true);
				panelMenu.setVisible(false);
			}
		});
		panelMenu.add(buttonContact);
		
	/*Création du bouton "Ajouter contact"*/
		buttonAjouterContact = new JButton();
		panelContact.add(buttonAjouterContact);
		buttonAjouterContact.setBounds(10, 10, 75, 75);
		buttonAjouterContact.setBackground(Color.black);
		buttonAjouterContact.setBorder(null);
		buttonAjouterContact.setIcon(new ImageIcon(MainFrame.class.getResource("/imagesSmartphone/addcontact.png")));
		
		/*Ajout du hover au survol de la souris*/
		buttonAjouterContact.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonAjouterContact.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonAjouterContact.setBackground(Color.black);
		    }
		});
				
		/*Ajout de l'action du bouton*/
		buttonAjouterContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNewContact.setVisible(true);
				panelContact.setVisible(false);
			}
		});

	/*Création du bouton "Sauvegarder"*/
		buttonSave = new JButton("Sauver");
		panelNewContact.add(buttonSave);
		buttonSave.setBounds(10, 100, 75, 75);
		buttonSave.setBackground(Color.black);
		buttonSave.setBorder(null);
		
		/*Ajout du hover au survol de la souris*/
		buttonSave.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonSave.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonSave.setBackground(Color.black);
		    }
		});
		
		/*Ajout de l'action du bouton*/
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				newContact.setFirstname(firstNamef.getText());
				newContact.setLastname(lastNamef.getText());
				
				arraylistContact.add(newContact);
				
				/*sérialisation des contacts*/
				try {
					ContactFile.UploadDataContact(arraylistContact);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				/*Fermeture de la fenêtre actuelle afin de rafraîchir les données de la JList*/
				frameSmartphone.dispose();
				
				/*Nouvelle ouverture du programme et chargement du panelContact*/
				MainFrame mainFrame;
				try {
					mainFrame = new MainFrame();
					mainFrame.frameSmartphone.setVisible(true);
					mainFrame.panelContact.setVisible(true);
				} catch (ClassNotFoundException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}		
			}
		});
	}
}
	


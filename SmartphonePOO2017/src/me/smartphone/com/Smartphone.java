package me.smartphone.com;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Smartphone {
	
	//décalaration de la fr

	private JFrame frmSmartphone;
	private JPanel panelMenu;
	private JPanel panelContact_1;
	private JPanel panelGallerie;
	private JPanel panelNewContact;
	private JTextField txtRue;
	private JTextField txtVille;
	private JTextField txtCode;
	private JTextField txtNo;
	private JTextField txtCp;
	private JTextField txtPays;
	private JTextField txtEcrivezIci;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Smartphone window = new Smartphone();
					window.frmSmartphone.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Smartphone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSmartphone = new JFrame();
		frmSmartphone.setResizable(false);
		frmSmartphone.setTitle("Smartphone");
		frmSmartphone.getContentPane().setBackground(Color.BLACK);
		frmSmartphone.setSize(770,1480);
		frmSmartphone.setLocationRelativeTo(null);;
		
		
		frmSmartphone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSmartphone.getContentPane().setLayout(null);
				
		final JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0,0,0,150));
		panelMenu.setBounds(25, 25, 720, 1280);
		frmSmartphone.getContentPane().add(panelMenu);
		panelMenu.setVisible(false);
		
		final JPanel panelContact_1 = new JPanel();
		panelContact_1.setBackground(Color.DARK_GRAY);
		panelContact_1.setBounds(25, 25, 720, 1280);
		frmSmartphone.getContentPane().add(panelContact_1);
		panelContact_1.setVisible(false);
		panelContact_1.setLayout(null);
					
		final JPanel panelGallerie = new JPanel();
		panelGallerie.setBackground(Color.DARK_GRAY);
		panelGallerie.setBounds(25, 25, 720, 1280);
		frmSmartphone.getContentPane().add(panelGallerie);
		panelGallerie.setVisible(false);
		
		JButton buttonGallerie = new JButton("");
		buttonGallerie.setBounds(66, 44, 128, 128);
		buttonGallerie.setForeground(Color.WHITE);
		buttonGallerie.setBackground(new Color(0,0,0,0));
		buttonGallerie.setIcon(new ImageIcon(Smartphone.class.getResource("/me/smartphone/icon/008-photo-camera.png")));
		buttonGallerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelGallerie.setVisible(true);
				panelMenu.setVisible(false);
			}
		});
		
		
		JButton buttonContact = new JButton("");
		buttonContact.setBounds(245, 44, 128, 128);
		buttonContact.setBackground(new Color(0,0,0,0));
		buttonContact.setIcon(new ImageIcon(Smartphone.class.getResource("/me/smartphone/icon/011-phone-book.png")));
		buttonContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelContact_1.setVisible(true);
				panelMenu.setVisible(false);
			}
		});
		
		JButton button = new JButton("New button");
		button.setBounds(76, 257, 155, 37);
		panelMenu.setLayout(null);
		panelMenu.add(buttonGallerie);
		panelMenu.add(buttonContact);
		panelMenu.add(button);
		

		final JPanel panelNewContact_1 = new JPanel();
		panelNewContact_1.setBackground(Color.DARK_GRAY);
		panelNewContact_1.setBounds(25, 25, 720, 1280);
		frmSmartphone.getContentPane().add(panelNewContact_1);
		panelNewContact_1.setLayout(null);
		panelNewContact_1.setVisible(false);
		
		JButton AjouterPhoto = new JButton("+ Photo");
		AjouterPhoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		AjouterPhoto.setBounds(22, 78, 200, 200);
		panelNewContact_1.add(AjouterPhoto);
		
		JTextField txtfldTel = new JTextField();
		txtfldTel.setText("Téléphone");
		txtfldTel.setBounds(244, 376, 450, 70);
		txtfldTel.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtfldTel.setText("");
		    }
		});
		panelNewContact_1.add(txtfldTel);
		
		JTextField txtfldPrnom = new JTextField();
		txtfldPrnom.setText("Prénom ");
		txtfldPrnom.setBounds(244, 78, 450, 70);
		txtfldPrnom.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtfldPrnom.setText("");
		    }
		});
		panelNewContact_1.add(txtfldPrnom);
		
		JTextField txtfldNom = new JTextField();
		txtfldNom.setText("Nom ");
		txtfldNom.setBounds(244, 208, 450, 70);
		txtfldNom.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtfldNom.setText("");
		    }
		});
		panelNewContact_1.add(txtfldNom);
		
		JTextField txtfldMail = new JTextField();
		txtfldMail.setText("E-Mail");
		txtfldMail.setBounds(244, 552, 450, 70);
		txtfldMail.addFocusListener(new FocusAdapter() {
		    @Override
		    public void focusGained(FocusEvent e) {
		    	txtfldMail.setText("");
		    }
		});
		panelNewContact_1.add(txtfldMail);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone.setForeground(Color.WHITE);
		lblTlphone.setBounds(32, 323, 154, 29);
		panelNewContact_1.add(lblTlphone);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mobile", "Bureau", "Domicile"}));
		comboBox.setForeground(Color.WHITE);
		comboBox.setBackground(Color.DARK_GRAY);
		comboBox.setBounds(22, 376, 164, 70);
		panelNewContact_1.add(comboBox);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(32, 499, 154, 29);
		panelNewContact_1.add(lblEmail);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Domicile", "Bureau"}));
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setBackground(Color.DARK_GRAY);
		comboBox_1.setBounds(22, 552, 164, 70);
		panelNewContact_1.add(comboBox_1);
		
		JLabel lblAdressePostale = new JLabel("Adresse postale");
		lblAdressePostale.setForeground(Color.WHITE);
		lblAdressePostale.setBounds(32, 675, 229, 29);
		panelNewContact_1.add(lblAdressePostale);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Domicile", "Bureau"}));
		comboBox_2.setForeground(Color.WHITE);
		comboBox_2.setBackground(Color.DARK_GRAY);
		comboBox_2.setBounds(22, 728, 164, 70);
		panelNewContact_1.add(comboBox_2);
		
		txtRue = new JTextField();
		txtRue.setText("Rue");
		txtRue.setBounds(244, 728, 321, 70);
		panelNewContact_1.add(txtRue);
		
		txtVille = new JTextField();
		txtVille.setText("Ville");
		txtVille.setBounds(244, 810, 321, 70);
		panelNewContact_1.add(txtVille);
		
		txtCode = new JTextField();
		txtCode.setText("R\u00E9gion");
		txtCode.setBounds(244, 892, 223, 70);
		panelNewContact_1.add(txtCode);
		
		txtNo = new JTextField();
		txtNo.setText("No");
		txtNo.setBounds(571, 728, 126, 70);
		panelNewContact_1.add(txtNo);
		
		txtCp = new JTextField();
		txtCp.setText("CP");
		txtCp.setBounds(571, 810, 126, 70);
		panelNewContact_1.add(txtCp);
		
		txtPays = new JTextField();
		txtPays.setText("Pays");
		txtPays.setBounds(471, 892, 223, 70);
		panelNewContact_1.add(txtPays);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setForeground(Color.WHITE);
		lblNote.setBounds(32, 986, 229, 29);
		panelNewContact_1.add(lblNote);
		
		txtEcrivezIci = new JTextField();
		txtEcrivezIci.setText("Ecrivez ici");
		txtEcrivezIci.setBounds(22, 1039, 672, 125);
		panelNewContact_1.add(txtEcrivezIci);
				
		JLabel label = new JLabel("baborOS");
		label.setBounds(649, 1172, 91, 29);
		frmSmartphone.getContentPane().add(label);
		label.setForeground(Color.LIGHT_GRAY);
		
		JButton buttonMenu = new JButton("Menu");
		buttonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.setVisible(true);
				panelContact_1.setVisible(false);
				panelGallerie.setVisible(false);
				panelNewContact_1.setVisible(false);
			}
		});
		buttonMenu.setBounds(315, 1343, 100, 40);
		frmSmartphone.getContentPane().add(buttonMenu);
		
		
		
		JButton btnAjouterContact = new JButton("Ajouter Contact");
		btnAjouterContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelNewContact_1.setVisible(true);
				panelContact_1.setVisible(false);
			}
		});
		btnAjouterContact.setBounds(423, 286, 197, 37);
		panelContact_1.add(btnAjouterContact);
		
		JLabel fondEcran = new JLabel("");
		fondEcran.setBounds(25, 25, 720, 1280);
		frmSmartphone.getContentPane().add(fondEcran);
		fondEcran.setIcon(new ImageIcon(Smartphone.class.getResource("/me/smartphone/icon/DSC_000001(1).JPG")));
	}
}

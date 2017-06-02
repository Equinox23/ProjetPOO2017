package classSmartphone;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Smartphone  {
	
	protected JFrame frameSmartphone;

	public Smartphone() {

		frameSmartphone = new JFrame();
		frameSmartphone.setResizable(false);
		frameSmartphone.setTitle("Smartphone");
		frameSmartphone.getContentPane().setBackground(Color.BLACK);
		frameSmartphone.setSize(480,800);
		frameSmartphone.setUndecorated(true);
		frameSmartphone.setLocationRelativeTo(null);		
		frameSmartphone.getContentPane().setLayout(null);
				
		final JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0,0,0,150));
		panelMenu.setBounds(15, 15, 450, 700);
		frameSmartphone.getContentPane().add(panelMenu);
		panelMenu.setVisible(false);
		
//		final JPanel panelContact = new JPanel();
//		panelContact.setBackground(Color.DARK_GRAY);
//		panelContact.setBounds(15, 15, 450, 700);
//		frameSmartphone.getContentPane().add(panelContact);
//		panelContact.setVisible(false);
//		panelContact.setLayout(null);
		
		
		final JPanel panelGallerie = new JPanel();
		panelGallerie.setBackground(Color.DARK_GRAY);
		panelGallerie.setBounds(15, 15, 450, 700);
		frameSmartphone.getContentPane().add(panelGallerie);
		panelGallerie.setVisible(false);
		
			
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
				FrameContact appContact = new FrameContact();
				System.out.println("Aie");
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
				panelGallerie.setVisible(false);
				
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

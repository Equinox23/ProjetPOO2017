package classSmartphone;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameMenu extends Smartphone {	
	public JFrame frameMenu;
	
	public FrameMenu(){
		
	System.out.println("Bon");
	
		frameMenu=new JFrame();
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0,0,0,150));
		panelMenu.setBounds(15, 15, 450, 700);
		frameMenu.getContentPane().add(panelMenu);
		panelMenu.setVisible(true);
		System.out.println("Bon panel menu");
		panelMenu.setLayout(null);
		
		
		
		final JPanel panelGallerie = new JPanel();
		panelGallerie.setBackground(Color.DARK_GRAY);
		panelGallerie.setBounds(15, 15, 450, 700);
		//frameSmartphone.add(panelGallerie);
		panelGallerie.setVisible(false);
		System.out.println("Bon panel gallerie");
		
			
		JButton buttonGallerie = new JButton("");
		buttonGallerie.setBounds(25, 25, 75, 75);
		buttonGallerie.setForeground(Color.WHITE);
		buttonGallerie.setBackground(new Color(0,0,0,0));
		buttonGallerie.setIcon(new ImageIcon(getClass().getResource("/imgSmartphone/008-photo-camera.png")));
		buttonGallerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelGallerie.setVisible(true);
				panelMenu.setVisible(false);
			}
		});
		panelMenu.add(buttonGallerie);
		System.out.println("Bon bouton  gallerie");
		
		
		JButton buttonContact = new JButton("");
		buttonContact.setBounds(122, 25, 75, 75);
		buttonContact.setBackground(new Color(0,0,0,0));
		buttonContact.setIcon(new ImageIcon(getClass().getResource("/imgSmartphone/011-phone-book.png")));
		buttonContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrameContact appContact = new FrameContact();
				System.out.println("Aie");
			}
		});	
		System.out.println("Bon bouton  contact");
		panelMenu.add(buttonContact);
		
		buttonMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panelMenu.setVisible(true);	
				System.out.println("Aie");
			}
		});
		frameMenu.getContentPane().add(buttonMenu);
		
		
		panelMenu.setLayout(null);
		
		
		System.out.println("fin");
				
		
	}
	

}

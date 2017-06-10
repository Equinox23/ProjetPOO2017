package graphismes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import me.smartphone.com.Smartphone;

public class FrameMenu extends Frame {
	
	JFrame frameMenu;
	final JPanel panelMenu;
	
	
	public FrameMenu(){
		super();
		frameMenu= new Frame();
		panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0,0,0,150));
		panelMenu.setBounds(15, 15, 450, 700);
		frameMenu.add(panelMenu);
		panelMenu.setVisible(true);	
		
		JButton buttonGallerie = new JButton("");
		buttonGallerie.setBounds(25, 25, 75, 75);
		buttonGallerie.setForeground(Color.WHITE);
		buttonGallerie.setBackground(Color.BLACK);
		buttonGallerie.setIcon(new ImageIcon(Smartphone.class.getResource("/icon/008-photo-camera.png")));
//		buttonGallerie.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				panelGallerie.setVisible(true);
//				panelMenu.setVisible(false);
//			}
//		});
//		
		
		JButton buttonContact = new JButton("");
		buttonContact.setBounds(122, 25, 75, 75);
		buttonContact.setBackground(Color.BLACK);
		buttonContact.setIcon(new ImageIcon(Smartphone.class.getResource("/icon/011-phone-book.png")));
		buttonContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new FrameContact();
				
			}
		});
		
		panelMenu.setLayout(null);
		panelMenu.add(buttonGallerie);
		panelMenu.add(buttonContact);
		
	}
	

}

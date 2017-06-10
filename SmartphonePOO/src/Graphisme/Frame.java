package Smartphone;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import me.smartphone.com.Smartphone;

public class Frame extends JFrame{
	
	JFrame frame;
	JLabel fondEcran;
	JButton buttonMenu;
	JButton btnFermer;
	
	
	public Frame(){
		
		frame = new JFrame();
		this.setResizable(false);
		this.setTitle("Smartphone");
		this.getContentPane().setBackground(Color.BLACK);
		this.setSize(480,800);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);		
		this.getContentPane().setLayout(null);
		
		buttonMenu = new JButton("Menu");		
		buttonMenu.setBounds(215, 750, 50, 20);
		this.getContentPane().add(buttonMenu);
		
		fondEcran = new JLabel("");
		fondEcran.setBounds(15, 15, 450, 700);
		this.getContentPane().add(fondEcran);
		fondEcran.setIcon(new ImageIcon(Smartphone.class.getResource("/imgSmartphone/DSC_000001(1).JPG")));
		
		btnFermer = new JButton("Fermer");
		btnFermer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnFermer.setBounds(310, 742, 155, 37);
		this.getContentPane().add(btnFermer);
	}
}
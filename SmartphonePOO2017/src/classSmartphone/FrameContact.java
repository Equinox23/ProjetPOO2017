package classSmartphone;

import java.awt.Color;

import javax.swing.JFrame;

public class FrameContact {
	protected JFrame frameContact;
	
	public FrameContact(){
		
		frameContact = new JFrame();
		frameContact.setResizable(false);
		frameContact.setTitle("Contact");
		frameContact.getContentPane().setBackground(Color.DARK_GRAY);
		frameContact.setSize(480,800);
		frameContact.setUndecorated(true);
		frameContact.setLocationRelativeTo(null);		
		frameContact.getContentPane().setLayout(null);
	}
	
	

}

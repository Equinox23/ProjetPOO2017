package graphismes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import Fonctions.ImageGalerie;


public class PanelGalerie extends JPanel implements ActionListener {
	
	JFileChooser chooser;
	static BufferedImage image;
	Icon redim;
	JButton buttonAjouterImage;
	JLabel photos;
	String path;
	
	
	public PanelGalerie(){
		this.setBackground(new Color(0,0,0,150));
		this.setBounds(15, 15, 400, 650);		
		this.setVisible(false);
		this.setLayout(null);
		
		photos = new JLabel();
		photos.setBounds(15, 15, 75, 75);
		this.add(photos);
		
		
		
		/*Création du bouton "Ajouter image"*/
		buttonAjouterImage = new JButton();
		this.add(buttonAjouterImage);
		buttonAjouterImage.setBounds(163, 575, 75, 75);
		buttonAjouterImage.setBackground(Color.black);
		buttonAjouterImage.setBorder(null);
		buttonAjouterImage.setIcon(new ImageIcon(MainFrame.class.getResource("/icon/004-technology-2.png")));
		buttonAjouterImage.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent e) {
		    	buttonAjouterImage.setBackground(Color.GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent e) {
		    	buttonAjouterImage.setBackground(Color.black);
		    }
		});
		buttonAjouterImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageGalerie hope=new ImageGalerie();
			}
		});
	}
//	
//		/*lecteur d'image"*/	
//		public void actionPerformed(ActionEvent e) {
//			int result;   			
//			chooser = new JFileChooser();
//			chooser.setCurrentDirectory(new java.io.File(".","imagesGalerie"));
//			chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//
//	     //   
//	         if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
//	        	 File file = chooser.getSelectedFile();	        	 
//	        	 try {
//	        		 this.image=ImageIO.read(file);	
//	        		 this.path=file.getAbsolutePath();	                 
//	        		 photos.setBounds(540, 10, this.scale(this.image,25).getWidth(null), this.scale(this.image,25).getHeight(null));
//	                 
//	                 photos.setIcon(new ImageIcon(this.scale(this.image,25)));
//	              
//					photos.setIcon(new ImageIcon(image));
//	         
//				} catch (Exception e2) {
//					// TODO: handle exception
//				}
//	     
//	               System.out.println("getSelectedFile() : "
//	                  +  chooser.getSelectedFile());   
//	               }
//	             else {
//	               System.out.println("Pas de fichier séléctioné ");
//	               }          
//	    	}
//		public static BufferedImage read(File input) throws IOException {
//			return image;
//		}
//		
//		 public static BufferedImage scale(BufferedImage img, double scaleValue) {
//		        AffineTransform tx = new AffineTransform();
//		        tx.scale(scaleValue, scaleValue);
//		        AffineTransformOp op = new AffineTransformOp(tx,AffineTransformOp.TYPE_BILINEAR);
//		        BufferedImage imgNew = new BufferedImage( (int) (img.getWidth() * scaleValue),
//		                (int) (img.getHeight() * scaleValue),
//		                img.getType());
//		        return op.filter(img, imgNew);
//		 }	


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}


	

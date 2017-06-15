package Fonctions;

import java.awt.*;
import javax.swing.*;

/**
 * bouton pour miniatures
 */
public class BoutonImg extends JButton {

//	/**
//	 * Constructeur par défaut
//	 */
	private ImageIcon imgProfil;
	
	public BoutonImg() {
		super();
	}
	/**
	 * Constructeur avec une chaine pour le nom du bouton
	 */
	public BoutonImg(String sText) {
	}
	/**
	 * Contructeur avec l'image et la taille du bouton
	 */
	public BoutonImg(ImageIcon img, Dimension dim) {
		super(img);
		this.setPreferredSize(dim);
//		setStyle();
	}
	/**
	 * Contructeur avec Image
	 * @param img Image du bouton
	 */
//	public BoutonImg(ImageIcon img) {
//		super(img);
//		setStyle();
//	}
	/**
	 * Mise à jour des styles
	 */
//	public void setStyle(){
//		this.setBackground(Color.black);
//		
//		this.setOpaque(true);
//		this.setVerticalAlignment(SwingConstants.CENTER);
//		this.setHorizontalAlignment(SwingConstants.CENTER);
//	}
//	
//	public void setDimMyButton(Dimension dim){
//		this.setPreferredSize(dim);
//	}
//	
//	public void setInitImage(ImageIcon img) {
//		this.setIcon(img);
//	}

	public void setImage(ImageIcon img) {
		this.imgProfil=img;
		this.setIcon(imgProfil);
	}
//
	public ImageIcon getImageIcon() {
		return this.imgProfil;

	}
//	
//	public void setsText(String sText) {
//		this.sText = sText;
//	}
}

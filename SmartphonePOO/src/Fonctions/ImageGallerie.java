package Fonctions;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;

/*
 * outil de gestion des objets images 
 * idImage
 * nomImage
 * dimImage
 * tumbImage = miniature format 130 130
 *  Imageicon ==> https://docs.oracle.com/javase/7/docs/api/javax/swing/ImageIcon.html
 *  
 */

public class ImageGallerie implements Serializable{
	
	private BufferedImage image;
	private int id;
	private String nomImage = new String("");
	private Dimension dimImage = new Dimension(140,100);
	private ImageIcon tumbImage;
	private double hauteur;
	private double largeur;
	
	
	public ImageGallerie(){		
	}
	
	public ImageGallerie(int id,String nomImage){
		
		this.setId(id);
		this.setNomImage(nomImage);
		this.setHauteur(image.getHeight());
		this.setLargeur(image.getWidth());
		this.setTumbImage(dimensionMini(130, 130));;
		
		
	}
	
	private ImageIcon dimensionMini(double largeurMini, double HauteurMini) 
	{
		Image scaledImage;
		double ratio = Math.min((largeurMini)/largeur, (HauteurMini)/hauteur);
		largeurMini = largeur*ratio;
		HauteurMini = hauteur*ratio;;
		scaledImage = image.getScaledInstance((int) largeurMini, (int) HauteurMini, Image.SCALE_SMOOTH);
		return new ImageIcon(scaledImage);
	}
	
	public ImageGallerie(ImageIcon tumbImage){
		this.setTumbImage(tumbImage);;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomImage() {
		return nomImage;
	}

	public void setNomImage(String nomImage) {
		this.nomImage = nomImage;
	}

	public Dimension getDimImage() {
		return dimImage;
	}

	public void setDimImage(Dimension dimImage) {
		this.dimImage = dimImage;
	}

	public ImageIcon getTumbImage() {
		return tumbImage;
	}

	public void setTumbImage(ImageIcon tumbImage) {
		this.tumbImage = tumbImage;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}

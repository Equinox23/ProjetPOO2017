package Graphisme;

import java.io.Serializable;

import javax.swing.ImageIcon;

public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String societe;
	private String email;
	private String telephone;
	private ImageIcon image;
	private int indexGroup;
	private int idContact;
	
	public Contact(int idContact, String nom, String prenom, String societe, String email,String telephone,ImageIcon image, int index) {
		this.idContact = ++idContact;
		this.nom = nom;
		this.prenom = prenom;
		this.societe = societe;
		this.email = email;
		this.telephone = telephone;
		if(image==null){
			this.image=new ImageIcon("/SmartphonePOO/src/icon/mans-silhouette.png");
		}
		else
			this.image=image;
		this.indexGroup=index;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}

	public int getIndexGroup() {
		return indexGroup;
	}

	public void setIndexGroup(int indexGroup) {
		this.indexGroup = indexGroup;
	}

	public int getIdContact() {
		return idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

}

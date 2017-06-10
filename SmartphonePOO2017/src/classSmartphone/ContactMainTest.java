package classSmartphone;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ContactMainTest {

	public static void main(String[] args) {
		
		try {
			// création d'un nouveau contact
			Contact p = new Contact("Balet", "Pierre");
			
			System.out.println("Création de : " + p.getLastname() + " " + p.getFirstname());

			// ouverture d'un flux de sortie vers le fichier portant l'UUID comme nom
			FileOutputStream fos = new FileOutputStream("./BDDContacts/" + p.getcontactID().toString() + ".ser");

			// création d'un "flux objet" avec le flux fichier
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			try {
				// sérialisation : écriture de l'objet dans le flux de sortie
				oos.writeObject(p); 
				// on vide le tampon
				oos.flush();
				System.out.println(p.getLastname() + " " + p.getFirstname() + " a été serialisé");

			} finally {
				//fermeture des flux
				try {
					oos.close();
				} finally {
					fos.close();
				}
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
			
		}

	
		
	}

}

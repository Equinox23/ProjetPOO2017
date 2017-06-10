package Fonctions;

import java.io.Serializable;
import java.util.UUID;

public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private UUID contactID;
	private String lastname;
	private String firstname;
	
	public Contact(String lastname, String firstname) {
		this.contactID = UUID.randomUUID();
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public UUID getContactID() {
		return contactID;
	}

	public void setContactID(UUID contactID) {
		this.contactID = contactID;
	}

}

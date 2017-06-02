package classSmartphone;	

import java.io.Serializable;
import java.util.UUID;

public class Contact implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private UUID contactID ;
	private String lastname ;
	private String firstname ;
	private String birthdate ;
	
	public Contact(String lastname, String firstname) {
		this.contactID = UUID.randomUUID();
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	public UUID getcontactID() {
		return contactID;
	}
	
	public void setIdcontact(UUID contactID) {
		this.contactID = contactID;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getBirthdate() {
		return birthdate;
	}
	
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
}

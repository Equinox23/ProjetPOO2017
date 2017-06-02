package classSmartphone;	

import java.util.UUID;

public class Contact {

	private UUID contactID ;
	private String lastname ;
	private String firstname ;
	private String birthdate ;
	private String salut;
	
	public Contact(String lastname, String firstname, String birthdate) {
		this.contactID = UUID.randomUUID();
		this.lastname = lastname;
		this.firstname = firstname;
		this.birthdate = birthdate;
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

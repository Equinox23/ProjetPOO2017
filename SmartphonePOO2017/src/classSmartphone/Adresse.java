package classSmartphone;

import java.io.Serializable;

public class Adresse implements Serializable {
	private static final long serialVersionUID = 1L;
	private int npa;
	private String localite;
	
	public Adresse(int npa, String localite) {
		
		this.npa = npa;
		this.localite = localite;
	}

	public int getNpa() {
		return npa;
	}

	public void setNpa(int npa) {
		this.npa = npa;
	}

	public String getLocalite() {
		return localite;
	}

	public void setLocalite(String localite) {
		this.localite = localite;
	}
	

}

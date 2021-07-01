package PQR.XYZ.ABC;

import javax.persistence.Embeddable;

@Embeddable
public class Identity {

	private String firstname;
	private String lastname;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "Embeddable [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}

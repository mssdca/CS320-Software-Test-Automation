package contact;

public class Contact { 
	 private String contactID;
	 private String firstName;
	 private String lastName;
	 private String phoneNumber;
	 private String address;

	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		updateContactID(contactID);
		updatefirstName(firstName);
		updatelastName(lastName);
		updatephoneNumber(phoneNumber);
		updateaddress(address);
	}
	 public void updateContactID(String contactID) {
		if(contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID.");
		}
		else {
			this.contactID = contactID;
		}
	}
	 public void updatefirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name.");
		}
		else {
			this.firstName = firstName;
		}
	}
	 public void updatelastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name.");
		}
		else {
			this.lastName = lastName;
		}
	}
	 public void updatephoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length() > 10) {
			throw new IllegalArgumentException("Invalid phone number.");
		}
		else {
			this.phoneNumber = phoneNumber;
		}
	}
	 public void updateaddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address.");
		}
		else {
			this.address = address;
		}
	}
	 public final String getcontactID() {
		return contactID;
	}
	 public final String getfirstName() {
		return firstName;
	}
	 public final String getlastName() {
		return lastName;
	}
	 public final String getphoneNumber() {
		return phoneNumber;
	}
	 public final String getaddress() {
		return address;
	}
}

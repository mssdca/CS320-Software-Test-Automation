package contact;
import java.util.List;
import java.util.ArrayList;

public class ContactService {
	public List<Contact> contacts = new ArrayList<>();
	
	public List<Contact> getcontacts() {
		return contacts;
	}
	
	public Contact searchContact(String contactID) throws Exception {
		int i = 0;
		while(i < contacts.size()) {
			if(contactID.equals(contacts.get(i).getcontactID())) {
				return contacts.get(i);
			}
			++i;
		}
		throw new Exception("Invalid task.");
	}
	
	public void addContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		Contact contact = new Contact(contactID, firstName, lastName, phoneNumber, address);
		contacts.add(contact);
	}
	public void updatefirstName(String contactID, String firstName) throws Exception {
		searchContact(contactID).updatefirstName(firstName);
	}
	public void updatelastName(String contactID, String lastName) throws Exception {
		searchContact(contactID).updatelastName(lastName);
	}
	public void updatephoneNumber(String contactID, String phoneNumber) throws Exception {
		searchContact(contactID).updatephoneNumber(phoneNumber);
	}
	public void updateaddress(String contactID, String address) throws Exception {
		searchContact(contactID).updateaddress(address);
	}
	public void deleteContact(String contactID) throws Exception {
		contacts.remove(searchContact(contactID));
	}
}

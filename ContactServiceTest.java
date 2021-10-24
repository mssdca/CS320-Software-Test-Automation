package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ContactServiceTest {

	@Test
	void addContactTest() {
		contact.ContactService t = new contact.ContactService();
		t.addContact("1111111112", "Jack", "Smith", "619456789", "123 second st");
		assertNotNull(t.getcontacts().get(0).getcontactID());
		assertEquals("Jack", t.getcontacts().get(0).getfirstName());
		assertEquals("Smith", t.getcontacts().get(0).getlastName());
		assertEquals("619456789", t.getcontacts().get(0).getphoneNumber());
		assertEquals("123 second st", t.getcontacts().get(0).getaddress());
	}
	
	void deleteContactTest() throws Exception{
		String contactID = "1111111112";
		contact.ContactService t = new contact.ContactService();
		t.addContact(contactID, "Jack", "Smith", "619456789", "123 second st");
		t.deleteContact(contactID);
		assertEquals(null, t.getcontacts().get(0).getcontactID());
		
	}
	@Test
	void updatefirstNameTest() throws Exception {
		contact.ContactService t = new contact.ContactService();
		t.addContact("1111111112", "Jack", "Smith", "619456789", "123 second st");
		t.updatefirstName(t.getcontacts().get(0).getcontactID(), "John");
		assertEquals("John", t.getcontacts().get(0).getfirstName());
		
	}
	@Test
	void updatelastNameTest() throws Exception {
		contact.ContactService t = new contact.ContactService();
		t.addContact("1111111113", "Jack", "Smith", "619456789", "123 second st");
		t.updatelastName(t.getcontacts().get(0).getcontactID(), "Jose");
		assertEquals("Jose", t.getcontacts().get(0).getlastName());
		
	}
	@Test
	void updatephoneNumberTest() throws Exception {
		contact.ContactService t = new contact.ContactService();
		t.addContact("1111111114", "Jack", "Smith", "619456789", "123 second st");
		t.updatephoneNumber(t.getcontacts().get(0).getcontactID(), "7194788520");
		assertEquals("7194788520", t.getcontacts().get(0).getphoneNumber());
		
	}
	@Test
	void updateaddressTest() throws Exception {
		contact.ContactService t = new contact.ContactService();
		t.addContact("1111111115", "Jack", "Smith", "619456789", "123 second st");
		t.updateaddress(t.getcontacts().get(0).getcontactID(), "124 first st");
		assertEquals("124 first st", t.getcontacts().get(0).getaddress());
		
	}
}

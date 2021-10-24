package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		contact.Contact c = new contact.Contact("1111111111", "John", "Doe", "800456789", "123 main st");
		assertTrue(c.getfirstName().equals("John"));
		assertTrue(c.getlastName().equals("Doe"));
		assertTrue(c.getphoneNumber().equals("800456789"));
		assertTrue(c.getaddress().equals("123 main st"));
		
	}
	@Test
	void testContactlong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact.Contact("11111111111", "Johneeeeeee", "Doeeeeeeeee", "1800456789", "123 main st st st st st st");
		}); 
	}	
	@Test
	void testContactnull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact.Contact(null, "John", "Doe", "800456789", "123 main st");
		}); 
	}

}
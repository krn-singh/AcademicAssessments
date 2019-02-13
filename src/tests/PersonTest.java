package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import impl.Person;

class PersonTest {
	

	@Test
	void testGetDisplayName() {
		Person underTest = new Person("Karanbir","Singh", LocalDate.parse("2013-01-12"));
		String result = underTest.getDisplayName();
		assertEquals("Singh, Karanbir", result);
	}
	
	@Test
	void testGetAge() {
		LocalDate dateOfBirth = LocalDate.parse("2013-01-12");
		LocalDate currentDate = LocalDate.parse("2019-02-12");
		Person underTest = new Person("Karanbir","Singh", dateOfBirth, () -> currentDate);
		long result = underTest.getAge();
		assertEquals(6, result);
	}

}

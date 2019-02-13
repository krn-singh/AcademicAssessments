package impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.function.Supplier;

public class Person {
	private final String givenName;
	private final String surname;
	private final LocalDate dateOfBirth;
	private final Supplier<LocalDate> currentDateSupplier;

	public Person(String givenName, String surname, LocalDate dateOfBirth) {
		this(givenName, surname, dateOfBirth, LocalDate::now);
	}
	
	public Person(String givenName, String surname, LocalDate dateOfBirth, Supplier<LocalDate> currentDateSupplier) {
		this.givenName = givenName;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.currentDateSupplier = currentDateSupplier;
	}

	public String getDisplayName() {
		return surname + ", " + givenName;
	}
	
	public long getAge() {
		return ChronoUnit.YEARS.between(dateOfBirth, currentDateSupplier.get());
	}
}

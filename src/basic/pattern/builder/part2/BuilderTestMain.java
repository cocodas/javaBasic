package basic.pattern.builder.part2;

public class BuilderTestMain {

	public static void main(String[] args) {
		final Person person1 = new Person.PersonBuilder(
				new FullName.FullNameBuilder(new Name("Dynamite"), new Name(
						"Napoleon")).createFullName(),
				new Address.AddressBuilder(new City("Preston"), State.ID)
						.createAddress()).createPerson();

		final Person person2 = new Person.PersonBuilder(
				new FullName.FullNameBuilder(new Name("Coltrane"), new Name(
						"Rosco")).middleName(new Name("Purvis"))
						.createFullName(), new Address.AddressBuilder(new City(
						"Hazzard"), State.GA).createAddress())
				.gender(Gender.MALE).employment(EmploymentStatus.EMPLOYED)
				.createPerson();
		
		System.out.println(person1);
		System.out.println(person2);
	}

}

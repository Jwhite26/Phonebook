package OneLookPhonebook;


import MainDirectory.Address;

public class Person implements Comparable<Person> {
	private String firstName;
	private String middleName;
	private String lastName;
	private Address address;
	private String number;
	
	public Person() {}
	public Person(String firstName, String middleName, String lastName, Address address, String number) {
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.address = address;
			this.number = number;
	}
	
	public String getFirstName() {
		return this.firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
	}
	public String getLastName() {
		return this.lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
	}
	public void setLastName(String lastName) {
		this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
	}
	public String getMiddleName() {
		if(middleName == "" || middleName == null || middleName == " ") {
		return "";
		} else {
		return this.middleName.substring(0, 1).toUpperCase() + this.middleName.substring(1) + " ";	
		}
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1);
	}
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getNumber() {
		return this.number;
	}
	public void setNumber(String Number) {
		this.number = number;
	}
	public static String parseNum(String number) {
		String areaCode = number.substring(0, 3);
		String prefix = number.substring(3, 6);
		String suffix = number.substring(6, 10);
		return ("("+ areaCode + ") " + prefix + "-" + suffix);
	}
	@Override
	public String toString() {
		return firstName + " " + (middleName == "" ? "" : middleName + " ") + lastName + address + "\r\n" + parseNum(number);
	}
	@Override
	public int compareTo(Person w) {
		return lastName.compareTo(w.getLastName());
	}
	
}

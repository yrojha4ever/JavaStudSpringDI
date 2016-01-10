package di.setterInjection;

public class UserDto {
	private String name;
	private int age;
	private Address address;

	public String toString() {
		return name + " is " + age + " " + "years old. His address is: " + address;
	}

	// GETTER and SETTER METHODS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

package di.constinj;

import java.util.List;

public class User {
	private String name;
	private int age;
	private String country;
	private List<String> addresses;
	
	public User(String name, int age, String country, List<String> addresses) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", country=" + country + ", addresses=" + addresses + "]";
	}
	
	
}

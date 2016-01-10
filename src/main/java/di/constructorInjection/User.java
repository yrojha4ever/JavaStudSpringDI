package di.constructorInjection;

import java.util.List;

//User BEAN Class.
//The User bean class has three attributes viz. name, age and country.
public class User {

	private String name;
	private int age;
	private String country;
	private List<String> addresses;

	User(String name, int age, String country, List<String> addresses) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.addresses = addresses;
	}

	public String toString() {
		return name + " is " + age + " years old, living in " + country + ". His addresses: " + addresses;

	}

}

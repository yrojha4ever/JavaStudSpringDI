package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.constructorInjection.User;
import di.setterInjection.UserDto;

/**
	Two ways to perform Dependency Injection in Spring framework
	Spring framework provides two ways to inject dependency
	By Constructor
	By Setter method
*/
public class Main {

	public static void main(String[] args) {

		// =====ClassPathXmlApplicationContext======
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// ====================================================
		// ====INJECTING THROUGH CONSTRUCTOR=======
		// ======Get Bean=======
		User user = (User) context.getBean("user");
		System.out.println("Spring Constructor Injection");
		System.out.println(user.toString());
		// =====================================================

		// =========INJECTING THROUGH SETTER METHODS============
		// ======Get Bean=======
		UserDto userDto = context.getBean("userSetterInjection", UserDto.class);
		// Show the Data Set in The Bean Class.
		System.out.println("Spring Setter Injection");
		System.out.println(userDto.toString());
		// =====================================================
	}

}

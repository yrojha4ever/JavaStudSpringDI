package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.constinj.User;
import di.setterinj.Employee;

public class SpringDiMain {
	
	/*@Autowired
	private User user;*/
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("\n\nSpring Constructor Injection:..");
		
		User usr = (User) context.getBean("cUser");
		System.out.println(usr);
		
		
		System.out.println("\n\n--Setter Injection---");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		
	}
}

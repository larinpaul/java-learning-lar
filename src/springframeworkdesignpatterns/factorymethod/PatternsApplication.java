//package springframeworkdesignpatterns.factorymethod;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//@SpringBootApplication
//public class PatternsApplication {
//
//	public static void main(String[] args) {
//		ApplicationContext applicationContext = new AnnoationConfigApplicationContext(PatternsApplication.class);
//		System.out.println(applicationContext.getBean(Cat.class).meow()); // Should print out "meow" in the console
//		// We can do the same thing for all the Spring beans that we have
//		// this is a factory method, by the way
//		System.out.println(applicationContext.getBean(Dog.class).sound()); // Spring automatically creates an instance
//	}
//	
//}

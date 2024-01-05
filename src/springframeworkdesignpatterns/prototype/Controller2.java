//package springframeworkdesignpatterns.prototype;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Controller2 {
//
//	@Autowired
//	private Cat cat;
//	
//	@GetMapping("/c2")
//	public String m() {
//		System.out.println(cat); // Will print out A DIFFERENT memory location
//		return cat.meow();
//	}
//	
//}

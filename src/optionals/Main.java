package optionals;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {

		Optional<Cat> optionalCat = findCatByName("Fred");

		// Better not this:
//		System.out.println(optionalCat.get().getAge()); 
		
//		// But this(if you use .get()):
//		if (optionalCat.isPresent()) {
//			System.out.println(optionalCat.get().getAge());
//		}
//		else {
//			System.out.println(0);
//		}

//		// But better this:
//		Cat myCat = optionalCat.orElse(new Cat("UNKNOWN", 0));
//		// Or this which can use Lambdar:
//		Cat myCat = optionalCat.orElseGet();
//		// Or you can also even throw:
//		Cat myCat = optionalCat.orElseThrow();// the same as .get()...
		
		// It used to be like this:
//		if (myCat != null) {
//		System.out.println(myCat.getAge());
//		} else {
//			System.out.println(0);
//		}
		
		// And here's one super useful thing:
		optionalCat.map(Cat::getAge) // Optional containing the result of calling the getAge cat on the original cat
				.orElse(0);
		// The .map() method allows us to take a Cat Optional and convert it into an Optional of another type
		
	}
	
	private static Optional<Cat> findCatByName (String name) {
		Cat cat = new Cat(name, 3);
		return Optional.ofNullable(cat);
		// if definitely not null: return Optional.of(cat);
		// If you want to create an empty optional return Optional.empty();
	}

}

package loggingslf4jandlogback;


public class CarServiceTest {

	public static void main(String[] args) {
		
		// SLF4J user manual
		// The Simple Logging Facade for Java (SLF4) serves as a simple facade
	
		// But now more people use Logback
	
	}

//	@Test
	public void shouldDemonstrateLogging() {
		CarService carService = new CarService();
		carService.process("BMW");
	}
	
}

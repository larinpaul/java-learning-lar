package enums;

public class Main {

	public static void main(String[] args) {

		DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
		
		if (day == DaysOfTheWeek.THURSDAY) {
			System.out.println("Yay it's almost Friday!");
		}
		
//		DaysOfTheWeek.values(); // Return an array
		for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
			System.out.println(myDay);
		}

		System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);
		System.out.println(Cereals.FROOT_LOOPS.price);
		
	}

}

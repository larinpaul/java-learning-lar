package enums;

public enum Cereals {
	
	CAPTAIN_CRUNCH(50, 0.4),
	FROOT_LOOPS(60, 1.1),
	REESES_PUFFS(100, 1.0),
	COCOA_PUFFS(75, 0.2);
	
	// recommended to make the fields final
	final int levelOfDeliciousness;
	final double price;
	
	Cereals(int levelOfDeliciousness, double price) {
		this.levelOfDeliciousness = levelOfDeliciousness;
		this.price = price;
	}

}

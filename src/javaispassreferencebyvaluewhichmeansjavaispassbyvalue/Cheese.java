package javaispassreferencebyvaluewhichmeansjavaispassbyvalue;

public class Cheese {
	
	private int levelOfTaste;
	
	// Java is always pass by value, a 100% of the time,
	// but deeply, java always passes references by value...
	
	public int getLevelOfTaste() {
		return levelOfTaste;
	}
	
	public void setLevelOfTaste(int levelOfTaste) {
		this.levelOfTaste = levelOfTaste;
	}

}

package tinkoftask3;

public class Main {
	
	public static double findHighwayHeight(int[] heights) {
	    double sumProduct = 0.0;
	    double sumDiff = 0.0;
	    for (int i = 0; i < heights.length - 1; i++) {
	        if (heights[i] > heights[i+1]) {
	            sumProduct += heights[i] * heights[i+1];
	            sumDiff += heights[i+1] - heights[i];
	        }
	    }
	    return sumProduct / sumDiff;
	}

	public static void main(String[] args) {
	    int[] heights = {1, 2, 3, 2, 1};
	    double highwayHeight = findHighwayHeight(heights);
	    System.out.printf("%.12f\n", highwayHeight);
	}

}

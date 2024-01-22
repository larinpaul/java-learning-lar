package tinkoftask1;

public class Main {
    public static int calculateScore(double[][] points) {
        int score = 0;
        for (double[] point : points) {
            double distance = Math.hypot(point[0], point[1]); // Расчет евклидова расстояния
            if (distance <= 0.1) {
                score += 3;
            } else if (distance <= 0.8) {
                score += 2;
            } else if (distance <= 1.0) {
                score += 1;
            }
        }
        return score;
    }

    public static void main(String[] args) {
      
    }
}




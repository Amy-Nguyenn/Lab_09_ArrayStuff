import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] dataPoints = new int[100];
        Random rand = new Random();


        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }


        System.out.print("The dataPoints array values are: ");
        for (int value : dataPoints) {
            System.out.print(value + " | ");
        }
        System.out.println();


        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[]) {
        double sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / values.length;
}

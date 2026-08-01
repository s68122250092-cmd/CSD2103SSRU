public class TemperatureProcessor {
    public static void main(String[] args) {
        int n = 3;
        double[][] tempArray = {
            {30.5, 31.0, 29.5},
            {32.0, 33.5, 31.0},
            {28.0, 29.0, 30.0}
        };
        double sum = 0;
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    sum += tempArray[i][j];
                }
            }
            double average = sum/(n * n);
            System.out.println("Average temperature = " + average);
    }
}

public class StatisticsHelper {
    public static double calculateAverage(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return (double) sum / values.length;
    }
}
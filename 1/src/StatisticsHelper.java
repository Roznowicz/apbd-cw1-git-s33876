public class StatisticsHelper {
    public static double calculateAverage(int[] values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return (double) sum / values.length;
    }
}
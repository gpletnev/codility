package codility.lessons.lesson5;

/**
 * Find the minimal average of any slice containing at least two elements.
 */
public class MinAvgTwoSlice {
    public static int solution(int[] A) {
        int result = 0;
        int[] sum = new int[A.length + 1];
        sum[0] = 0;
        for (int i = 0; i < A.length; i++) {
            sum[i + 1] = sum[i] + A[i];
        }

        double min = Double.MAX_VALUE;
        for (int i = 0; i < A.length - 2; i++) {
            double average = (sum[i + 2] - sum[i]) / 2d;
            if (average < min) {
                min = average;
                result = i;
            }

            average = (sum[i + 3] - sum[i]) / 3d;
            if (average < min) {
                min = average;
                result = i;
            }
        }

        double average = (sum[A.length] - sum[A.length - 2]) / 2d;
        if (average < min) {
            result = A.length - 2;
        }
        return result;
    }
}

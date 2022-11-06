package codility.lessons.lesson5;

import static codility.Util.prefixSums;
import static codility.Util.sliceSum;

/**
 * Problem: You are given a non-empty, zero-indexed array A of n (1 <= n <= 100 000) integers
 * a0, a1, . . . , an−1 (0 <= ai <= 1 000). This array represents number of mushrooms growing on the
 * consecutive spots along a road. You are also given integers k and m (0 <= k, m < n).
 * A mushroom picker is at spot number k on the road and should perform m moves. In
 * one move she moves to an adjacent spot. She collects all the mushrooms growing on spots
 * she visits. The goal is to calculate the maximum number of mushrooms that the mushroom
 * picker can collect in m moves.
 */
public class MushroomPicker {
    /** O(n + m)*/
    public static int solution(int[] A, int k, int m) {
        int result = 0;
        int last = A.length - 1;

        int[] P = prefixSums(A);

        for (int p = 0; p < Math.min(m, k) + 1; p++) {
            int start = k - p;
            int end = Math.min(last, Math.max(k, k + m - 2 * p));
            result = Math.max(result, sliceSum(P, start, end));
        }

        for (int p = 0; p < Math.min(m, last - k) + 1; p++) {
            int start = k + p;
            int end = Math.max(0, Math.min(k, k - (m - 2 * p)));
            result = Math.max(result, sliceSum(P, start, end));
        }
        return result;
    }
}

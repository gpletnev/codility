package codility.lessons.lesson6;

/**
 * Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
 */
public class MaxProductOfThree {
    public static int solution(int[] A) {
        int[] max = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int[] min = {Integer.MAX_VALUE, Integer.MAX_VALUE};

        for(int i : A) {
            if( i >= max[2] ) {
                max[0] = max[1];
                max[1] = max[2];
                max[2] = i;
            } else if( i >= max[1] ) {
                max[0] = max[1];
                max[1] = i;
            } else if( i > max[0] ) {
                max[0] = i;
            }

            if( i <= min[0] ) {
                // Found new min, shift down
                min[1] = min[0];
                min[0] = i;
            } else if( i < min[1] ) {
                min[1] = i;
            }
        }

        return Math.max(min[0]*min[1]*max[2], max[0]*max[1]*max[2]);
    }
}

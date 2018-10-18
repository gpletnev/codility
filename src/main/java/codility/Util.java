package codility;

public class Util {
    public static long sum (int[] A) {
        long sum = 0;
        for (int i : A) {
            sum += i;
        }
        return sum;
    }

    public static int[] prefixSums(int[] A) {
        int[] P = new int[A.length];
        P[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            P[i] = P[i - 1] + A[i];
        }
        return P;
    }

    public static int[] postfixSums(int[] A) {
        int[] P = new int[A.length];
        P[A.length - 1] = A[A.length -1];
        for (int i = A.length-2; i >= 0; i--) {
            P[i] = P[i + 1] + A[i];
        }
        return P;
    }

    public static int sliceSum(int[] P, int start, int end) {
        return start > 0 ? P[end] - P[start - 1] : P[end];
    }
}

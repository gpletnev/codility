package codility.interviews;
// Array of unique ints. Convert it to string of ranges
// A = [1, 4, 5, 2, 3, 9, 8, 11, 0]
// "0-5,8-9,11"

import java.util.Arrays;

public class ArrayToRangesString {
    public static String solution(int[] A) {
        StringBuilder result = new StringBuilder();
        if (A.length > 0) {
            Arrays.sort(A);

            int start = A[0];
            int end = A[0];
            result.append(start);
            for (int i = 1; i < A.length; ++i) {
                if ((end + 1) == A[i]) {
                    end = A[i];
                    if (i == A.length -1) {
                        result.append("-");
                        result.append(end);
                    }
                } else {
                    if (end > start) {
                        result.append("-");
                        result.append(end);
                    }
                    start = A[i];
                    end = start;
                    result.append(",");
                    result.append(start);
                }
            }
        }
        return result.toString();
    }
}

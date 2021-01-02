package codility.lessons.lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {
        List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
        Collections.rotate(list, K);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] solution2(int[] A, int K) {
        if (A.length < 2 || A.length == K) return A;

        int shift = K % A.length;
        int[] result = new int[A.length];
        System.arraycopy(A, A.length - shift, result, 0, shift);
        System.arraycopy(A, 0, result, shift, A.length - shift);
        return result;
    }
}

package codility.lessons.lesson3;

import java.util.Arrays;

public class PermMissingElem {
    public static int solution(int[] A) {
        long n = A.length + 1;
        long arithmeticSequenceSum = (n * (n + 1)) / 2;
        long sum = Arrays.stream(A).asLongStream().sum();
        for (int i : A) {
            sum += i;
        }
        return (int) (arithmeticSequenceSum - sum);
    }
}

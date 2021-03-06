package codility.lessons.lesson4;

// https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
public class MissingInteger {
    public static int solution(int A[]) {
        int[] counter = new int[A.length + 2];
        for (int i : A) {
            if (i > 0 && i <= A.length) {
                counter[i] = 1;
            }
        }
        for (int i = 1; i < counter.length; i++) {
            if (counter[i] != 1)
                return i;
        }
        return 1;
    }
}

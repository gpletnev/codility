package codility.lessons.lesson4;

public class PermCheck {
    public static int solution(int A[]) {
        int[] count = new int[A.length];
        for (int i : A) {
            try {
                count[i - 1] += 1;
            } catch (IndexOutOfBoundsException e) {
                return 0;
            }
        }
        for (int i : count) {
            if (i == 0) return 0;
        }
        return 1;
    }
}

package codility.lessons.lesson4;

public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        int[] path = new int[X];
        int pathSum = 0;
        for (int i = 0; i < A.length; i++) {
            if (path[A[i] - 1] == 0)
                pathSum += 1;
            if (pathSum == X) return i;
            path[A[i] -1] = 1;
        }
        return -1;
    }
}

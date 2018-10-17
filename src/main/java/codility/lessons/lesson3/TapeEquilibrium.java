package codility.lessons.lesson3;

public class TapeEquilibrium {
    public static int solution(int[] A) {
        int sum = 0;
        for (int i : A) {
            sum += i;
        }
        int firstPartSum = A[0];
        int secondPartSum = sum - A[0];
        int minDifference = Math.abs(firstPartSum - secondPartSum);
        for (int P = 1; P < A.length - 1; P++) {
            firstPartSum += A[P];
            secondPartSum -= A[P];
            int difference = Math.abs(firstPartSum - secondPartSum);
            if (difference < minDifference) {
                minDifference = difference;
            }
        }
        return minDifference;
    }
}

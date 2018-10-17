package codility.lessons.lesson4;

public class MaxCounters {
    public static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;
        int increase = 0;

        for (int K : A) {
            if (K > N) {
                increase = maxCounter;
            } else {
                counters[K - 1] = Math.max(counters[K - 1], increase);
                counters[K - 1] += 1;
                maxCounter = Math.max(counters[K - 1], maxCounter);
            }
        }
        for (int i = 0; i < N; i++) {
            counters[i] = Math.max(counters[i], increase);
        }
        return counters;
    }
}

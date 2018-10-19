package codility.lessons.lesson5;

public class GenomicRangeQuery {
    public static int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        int[][] prefixSums = new int[N + 1][4];

        for (int i = 0; i < N; i++) {
            System.arraycopy(prefixSums[i], 0, prefixSums[i + 1], 0, 4);
            switch (S.charAt(i)) {
                case 'A':
                    prefixSums[i + 1][0]++;
                    break;
                case 'C':
                    prefixSums[i + 1][1]++;
                    break;
                case 'G':
                    prefixSums[i + 1][2]++;
                    break;
                case 'T':
                    prefixSums[i + 1][3]++;
                    break;
            }
        }

        int M = P.length;
        int[] factors = new int[M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 4; j++) {
                if (prefixSums[Q[i] + 1][j] - prefixSums[P[i]][j] > 0) {
                    factors[i] = j + 1;
                    break;
                }
            }
        }
        return factors;
    }
}

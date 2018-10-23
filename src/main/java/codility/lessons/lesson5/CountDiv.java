package codility.lessons.lesson5;

public class CountDiv {
    public static int solution(int A, int B, int K) {
        return (A % K != 0) ? (B - (A - A % K)) / K : (B - A) / K + 1;
    }
}

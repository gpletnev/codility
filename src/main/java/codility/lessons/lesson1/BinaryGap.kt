package codility.lessons.lesson1;

public class BinaryGap {
    public static int solution(int N) {
        int current = 0, longest = 0;
        int number = N;
        while ((number & 1) == 0)
            number = number >>> 1;
        while (number > 0) {
            number = number >>> 1;
            int bit = number & 1;
            if (bit == 0) {
                current++;
            } else {
                longest = Math.max(longest, current);
                current = 0;
            }
        }
        return longest;
    }
}

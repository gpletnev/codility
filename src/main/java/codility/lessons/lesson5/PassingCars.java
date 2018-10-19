package codility.lessons.lesson5;

public class PassingCars {
    public static int solution(int[] A) {
        int pairs = 0, east = 0;
        for (int i : A) {
            if (i == 0) east++;
            if (i == 1) pairs += east;
            if (pairs > 1000000000 ) return -1;
        }
        return pairs;
    }
}

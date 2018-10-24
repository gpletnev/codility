package codility.lessons.lesson6;

import java.util.*;

public class Distinct {
    public static int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : A) {
            set.add(i);
        }
        return set.size();
    }
}

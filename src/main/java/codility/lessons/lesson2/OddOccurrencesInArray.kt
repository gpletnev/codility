package codility.lessons.lesson2;

import java.util.HashMap;

public class OddOccurrencesInArray {
    public static int solution(int[] A) {
        int result = 0;

        for (int i : A) {
            result ^= i;
        }
        return result;
    }

    public static <T> T solutionT(T[] A) {
        T result = null;
        HashMap<T, Boolean> map = new HashMap<>();
        for (T i : A) {
            if (map.containsKey(i)) {
                map.remove(i);
            } else {
                map.put(i, true);
            }
        }
        for (T key : map.keySet()) {
            System.out.println(key);
        }

        if (map.keySet().size() > 0) {
            result = map.keySet().iterator().next();
        }
        return result;
    }
}

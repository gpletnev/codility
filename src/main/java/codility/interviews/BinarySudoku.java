package codility.interviews;

public class BinarySudoku {
    public static String solution(int U, int L, int[] C){
        final String IMPOSSIBLE_RESULT = "IMPOSSIBLE";
        String result;
        char[] first_row = new char[C.length];
        char[] second_row = new char[C.length];
        for (int i = 0; i < C.length; i++) {
            if (C[i] == 2) {
                first_row[i] = '1';
                U--;
                second_row[i] = '1';
                L--;
            }
            if (C[i] == 0) {
                first_row[i] = '0';
                second_row[i] = '0';
            }
            if (U < 0 || L < 0) {
                return IMPOSSIBLE_RESULT;
            }
        }
        for (int i = 0; i < C.length; i++) {
            if (C[i] == 1) {
                if (U > 0) {
                    first_row[i] = '1';
                    second_row[i] = '0';
                    U--;
                } else if (L > 0) {
                    first_row[i] = '0';
                    second_row[i] = '1';
                    L--;
                }
                if (U < 0 || L < 0) {
                    return IMPOSSIBLE_RESULT;
                }
            }
        }
        if (U > 0 || L > 0) {
            return IMPOSSIBLE_RESULT;
        }
        return new String(first_row) + "," + new String(second_row);
    }
}

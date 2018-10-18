package codility;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class UtilTest {

    @Test
    public void testPrefixSums() {
        int[] in = new int[]{2, 3, 7, 5, 1, 3, 9};
        int[] out = new int[]{2, 5, 12, 17, 18, 21, 30};
        assertArrayEquals(out, Util.prefixSums(in));
    }

    @Test
    public void testPostfixSums() {
        int[] in = new int[]{2, 3, 7, 5, 1, 3, 9};
        int[] out = new int[]{30, 28, 25, 18, 13, 12, 9};
        assertArrayEquals(out, Util.postfixSums(in));
    }

    @Test
    public void testSliceSum() {
        int[] P = new int[]{2, 5, 12, 17, 18, 21, 30};
        assertEquals(5, Util.sliceSum(P, 0, 1));
        assertEquals(3, Util.sliceSum(P, 1, 1));
        assertEquals(30, Util.sliceSum(P, 0, 6));
        assertEquals(19, Util.sliceSum(P, 1, 5));
    }
}

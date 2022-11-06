package codility;

import codility.interviews.BinarySudoku;
import codility.interviews.PointsOnOneRay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    public void testPointsOnOneRay() {
        assertEquals(4, PointsOnOneRay.solution(new PointsOnOneRay.Point2D[]{new PointsOnOneRay.Point2D(-1, -2), new PointsOnOneRay.Point2D(1, 2), new PointsOnOneRay.Point2D(2, 4), new PointsOnOneRay.Point2D(-3, 2), new PointsOnOneRay.Point2D(2, -2)}));
        assertEquals(3, PointsOnOneRay.solution(new PointsOnOneRay.Point2D[]{new PointsOnOneRay.Point2D(-1, 0), new PointsOnOneRay.Point2D(-2, 0), new PointsOnOneRay.Point2D(2, 0), new PointsOnOneRay.Point2D(-3, 0), new PointsOnOneRay.Point2D(2, -2)}));
        assertEquals(3, PointsOnOneRay.solution(new PointsOnOneRay.Point2D[]{new PointsOnOneRay.Point2D(0, -2), new PointsOnOneRay.Point2D(1, 1), new PointsOnOneRay.Point2D(0, 4), new PointsOnOneRay.Point2D(0, 2), new PointsOnOneRay.Point2D(2, 2)}));
    }

    @Test
    public void testBinarySudoku() {
        assertEquals("11100,10001", BinarySudoku.solution(3, 2, new int[]{2,1,1,0,1}));
        assertEquals("IMPOSSIBLE", BinarySudoku.solution(2, 3, new int[]{0,0,1,1,2}));
        assertEquals("1010,1010", BinarySudoku.solution(2, 2, new int[]{2,0,2,0}));
    }
}

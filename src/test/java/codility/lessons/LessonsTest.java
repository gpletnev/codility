package codility.lessons;

import codility.interviews.PointsOnOneRay;
import codility.interviews.PointsOnOneRay.Point2D;
import codility.lessons.lesson5.MushroomPicker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LessonsTest {
    @Test
    public void testMushroomPicker() {
        int[] A = new int[]{2, 3, 7, 5, 1, 3, 9};
        assertEquals(25, MushroomPicker.solution(A, 4, 6));
        assertEquals(6, MushroomPicker.solution(A, 4, 1));
        assertEquals(30, MushroomPicker.solution(A, 0, 6));
        assertEquals(18, MushroomPicker.solution(A, 3, 6));
    }

    @Test
    public void testPointsOnOneRay() {
        assertEquals(4, PointsOnOneRay.solution(new Point2D[]{new Point2D(-1, -2), new Point2D(1, 2), new Point2D(2, 4), new Point2D(-3, 2), new Point2D(2, -2)}));
        assertEquals(3, PointsOnOneRay.solution(new Point2D[]{new Point2D(-1, 0), new Point2D(-2, 0), new Point2D(2, 0), new Point2D(-3, 0), new Point2D(2, -2)}));
        assertEquals(3, PointsOnOneRay.solution(new Point2D[]{new Point2D(0, -2), new Point2D(1, 1), new Point2D(0, 4), new Point2D(0, 2), new Point2D(2, 2)}));
    }
}

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
}

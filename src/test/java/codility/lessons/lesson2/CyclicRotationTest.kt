package codility.lessons.lesson2

import org.junit.Assert
import org.junit.Test

class CyclicRotationTest {

    @Test
    fun solution() {
        Assert.assertArrayEquals(intArrayOf(9, 7, 6, 3, 8), CyclicRotation.solution(intArrayOf(3, 8, 9, 7, 6), 3))
        Assert.assertArrayEquals(intArrayOf(0, 0, 0), CyclicRotation.solution(intArrayOf(0, 0, 0), 1))
        Assert.assertArrayEquals(intArrayOf(1, 2, 3, 4), CyclicRotation.solution(intArrayOf(1, 2, 3, 4), 4))
    }

    @Test
    fun solution2() {
        Assert.assertArrayEquals(intArrayOf(9, 7, 6, 3, 8), CyclicRotation.solution2(intArrayOf(3, 8, 9, 7, 6), 3))
        Assert.assertArrayEquals(intArrayOf(0, 0, 0), CyclicRotation.solution2(intArrayOf(0, 0, 0), 1))
        Assert.assertArrayEquals(intArrayOf(1, 2, 3, 4), CyclicRotation.solution2(intArrayOf(1, 2, 3, 4), 4))
    }
}
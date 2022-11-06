package codility.lessons.lesson2

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class CyclicRotationTest {

    @Test
    fun solution() {
        assertContentEquals(intArrayOf(9, 7, 6, 3, 8), CyclicRotation.solution(intArrayOf(3, 8, 9, 7, 6), 3))
        assertContentEquals(intArrayOf(0, 0, 0), CyclicRotation.solution(intArrayOf(0, 0, 0), 1))
        assertContentEquals(intArrayOf(1, 2, 3, 4), CyclicRotation.solution(intArrayOf(1, 2, 3, 4), 4))
    }

    @Test
    fun solution2() {
        assertContentEquals(intArrayOf(9, 7, 6, 3, 8), CyclicRotation.solution2(intArrayOf(3, 8, 9, 7, 6), 3))
        assertContentEquals(intArrayOf(0, 0, 0), CyclicRotation.solution2(intArrayOf(0, 0, 0), 1))
        assertContentEquals(intArrayOf(1, 2, 3, 4), CyclicRotation.solution2(intArrayOf(1, 2, 3, 4), 4))
    }
}
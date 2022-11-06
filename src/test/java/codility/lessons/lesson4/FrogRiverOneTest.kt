package codility.lessons.lesson4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FrogRiverOneTest {

    @Test
    fun solution() {
        assertEquals(6, FrogRiverOne.solution(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)))
    }
}
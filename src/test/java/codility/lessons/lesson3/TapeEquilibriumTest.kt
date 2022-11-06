package codility.lessons.lesson3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TapeEquilibriumTest {

    @Test
    fun solution() {
        assertEquals(1, TapeEquilibrium.solution(intArrayOf(3, 1, 2, 4, 3)))
    }
}
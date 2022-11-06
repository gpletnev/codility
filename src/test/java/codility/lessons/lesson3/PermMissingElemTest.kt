package codility.lessons.lesson3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PermMissingElemTest {

    @Test
    fun solution() {
        assertEquals(4, PermMissingElem.solution(intArrayOf(2, 3, 1, 5)))
    }
}
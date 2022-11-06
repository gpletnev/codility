package codility.lessons.lesson1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BinaryGapTest {

    @Test
    fun solution() {
        assertEquals(5, BinaryGap.solution(1041))
        assertEquals(0, BinaryGap.solution(15))
        assertEquals(0, BinaryGap.solution(32))
    }
}
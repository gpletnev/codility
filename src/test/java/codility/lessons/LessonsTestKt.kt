package codility.lessons

import codility.lessons.lesson4.MissingIntegerKt
import org.junit.Assert.assertEquals
import org.junit.Test

class LessonsTestKt {
    @Test
    fun testMissingIntegerKt() {
        assertEquals(5, MissingIntegerKt.solution(listOf(1, 3, 6, 4, 1, 2).toIntArray()))
        assertEquals(1, MissingIntegerKt.solution(listOf(4, 5, 6, 2).toIntArray()))
        assertEquals(4, MissingIntegerKt.solution(listOf(1, 2, 3).toIntArray()))
        assertEquals(1, MissingIntegerKt.solution(listOf(-1, -2, -3).toIntArray()))
        assertEquals(1, MissingIntegerKt.solution(listOf(0, 0, 2).toIntArray()))
        assertEquals(1, MissingIntegerKt.solution(listOf(10, 30, 60, 40, 10, 20).toIntArray()))
    }
}
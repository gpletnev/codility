package codility.lessons.lesson2

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OddOccurrencesInArrayTest {

    @Test
    fun solution() {
        assertEquals(7, OddOccurrencesInArray.solution(intArrayOf(9, 3, 9, 3, 9, 7, 9)))
    }
}
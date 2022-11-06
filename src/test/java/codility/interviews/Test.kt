package codility.interviews

import codility.challenge.Palladium2020
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {
    @Test
    fun testSmallestPositiveIntegerInArray() {
        assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf()))
        assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf(-1000000, 1000000)))
        assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf(-1, -2)))
        assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf(0)))
        assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf(2, 4, 5)))
        assertEquals(5, SmallestPositiveIntegerInArray.solution(intArrayOf(1, 2, 3, 4)))
        assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf(-2, -1, 0, 2, 3)))
    }

    @Test
    fun testPalladium2020() {
        assertEquals(1, Palladium2020.solution(intArrayOf(1)))
        assertEquals(3, Palladium2020.solution(intArrayOf(1, 2)))
        assertEquals(5, Palladium2020.solution(intArrayOf(1, 2, 1)))
        assertEquals(10, Palladium2020.solution(intArrayOf(3, 1, 4)))
        assertEquals(17, Palladium2020.solution(intArrayOf(5, 3, 2, 4)))
        assertEquals(19, Palladium2020.solution(intArrayOf(5, 3, 5, 2, 1)))
        assertEquals(35, Palladium2020.solution(intArrayOf(7, 7, 3, 7, 7)))
        assertEquals(30, Palladium2020.solution(intArrayOf(1, 1, 7, 6, 6, 6)))
    }
}
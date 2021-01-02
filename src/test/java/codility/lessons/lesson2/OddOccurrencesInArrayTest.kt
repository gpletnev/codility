package codility.lessons.lesson2

import org.junit.Assert
import org.junit.Test

class OddOccurrencesInArrayTest {

    @Test
    fun solution() {
        Assert.assertEquals(7, OddOccurrencesInArray.solution(intArrayOf(9, 3, 9, 3, 9, 7, 9)))
    }
}
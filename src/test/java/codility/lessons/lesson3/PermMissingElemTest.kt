package codility.lessons.lesson3

import org.junit.Assert
import org.junit.Test

class PermMissingElemTest {

    @Test
    fun solution() {
        Assert.assertEquals(4, PermMissingElem.solution(intArrayOf(2, 3, 1, 5)))
    }
}
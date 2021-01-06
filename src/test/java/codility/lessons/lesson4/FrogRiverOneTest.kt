package codility.lessons.lesson4

import org.junit.Assert
import org.junit.Test

class FrogRiverOneTest {

    @Test
    fun solution() {
        Assert.assertEquals(6, FrogRiverOne.solution(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)))
    }
}
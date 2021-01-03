package codility.lessons.lesson3

import org.junit.Assert
import org.junit.Test

class TapeEquilibriumTest {

    @Test
    fun solution() {
        Assert.assertEquals(1, TapeEquilibrium.solution(intArrayOf(3, 1, 2, 4, 3)))
    }
}
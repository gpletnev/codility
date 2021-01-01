package codility.lessons.lesson1

import org.junit.Assert
import org.junit.Test

class BinaryGapTest {

    @Test
    fun solution() {
        Assert.assertEquals(5, BinaryGap.solution(1041))
        Assert.assertEquals(0, BinaryGap.solution(15))
        Assert.assertEquals(0, BinaryGap.solution(32))
    }
}
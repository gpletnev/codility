package codility.interviews

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testSmallestPositiveIntegerInArray() {
        Assert.assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf()))
        Assert.assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf(-1000000, 1000000)))
        Assert.assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf(-1, -2)))
        Assert.assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf(0)))
        Assert.assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf(2, 4, 5)))
        Assert.assertEquals(5, SmallestPositiveIntegerInArray.solution(intArrayOf(1, 2, 3, 4)))
        Assert.assertEquals(1, SmallestPositiveIntegerInArray.solution(intArrayOf(-2, -1, 0, 2, 3)))
    }

}
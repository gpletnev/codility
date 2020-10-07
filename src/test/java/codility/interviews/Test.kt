package codility.interviews

import codility.challenge.Palladium2020
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

    @Test
    fun testPalladium2020() {
        Assert.assertEquals(1, Palladium2020.solution(intArrayOf(1)))
        Assert.assertEquals(3, Palladium2020.solution(intArrayOf(1, 2)))
        Assert.assertEquals(5, Palladium2020.solution(intArrayOf(1, 2, 1)))
        Assert.assertEquals(10, Palladium2020.solution(intArrayOf(3, 1, 4)))
        Assert.assertEquals(17, Palladium2020.solution(intArrayOf(5, 3, 2, 4)))
        Assert.assertEquals(19, Palladium2020.solution(intArrayOf(5, 3, 5, 2, 1)))
        Assert.assertEquals(35, Palladium2020.solution(intArrayOf(7, 7, 3, 7, 7)))
        Assert.assertEquals(30, Palladium2020.solution(intArrayOf(1, 1, 7, 6, 6, 6)))
    }
}
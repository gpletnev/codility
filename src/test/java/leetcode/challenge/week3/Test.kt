package leetcode.challenge.week3

import leetcode.challenge.week3.ProductOfArrayExceptSelf.productExceptSelf
import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testProductExceptSelf() {
        Assert.assertArrayEquals(listOf(24, 12, 8, 6).toIntArray(), productExceptSelf(listOf(1, 2, 3, 4).toIntArray()))
        Assert.assertArrayEquals(listOf(0, 0).toIntArray(), productExceptSelf(listOf(0, 0).toIntArray()))
    }
}
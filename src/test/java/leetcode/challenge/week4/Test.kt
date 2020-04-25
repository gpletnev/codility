package leetcode.challenge.week4

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testSubarraySumEqualsK() {
        Assert.assertEquals(2, SubarraySumEqualsK.subarraySum(intArrayOf(1, 1, 1), 2))
    }

    @Test
    fun testBitwiseANDOfNumbersRange() {
        Assert.assertEquals(4, BitwiseANDOfNumbersRange.rangeBitwiseAnd(5, 7))
        Assert.assertEquals(0, BitwiseANDOfNumbersRange.rangeBitwiseAnd(0, 1))
    }

    @Test
    fun testLRUCache() {
        val cache = LRUCache(2)
        cache.put(1, 1)
        cache.put(2, 2)
        Assert.assertEquals(1, cache.get(1))
        cache.put(3, 3)
        Assert.assertEquals(-1, cache.get(2))
        cache.put(4, 4)
        Assert.assertEquals(-1, cache.get(1))
        Assert.assertEquals(3, cache.get(3))
        Assert.assertEquals(4, cache.get(4))
    }

    @Test
    fun testJumpGame() {
        Assert.assertEquals(true, JumpGame.canJump(intArrayOf(2, 3, 1, 1, 4)))
        Assert.assertEquals(false, JumpGame.canJump(intArrayOf(3, 2, 1, 0, 4)))
        Assert.assertEquals(true, JumpGame.canJump(intArrayOf(2, 4, 2, 1, 0, 2, 0)))
    }
}
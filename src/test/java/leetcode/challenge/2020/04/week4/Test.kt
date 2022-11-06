package leetcode.challenge.`2020`.`04`.week4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun testSubarraySumEqualsK() {
        assertEquals(2, SubarraySumEqualsK.subarraySum(intArrayOf(1, 1, 1), 2))
    }

    @Test
    fun testBitwiseANDOfNumbersRange() {
        assertEquals(4, BitwiseANDOfNumbersRange.rangeBitwiseAnd(5, 7))
        assertEquals(0, BitwiseANDOfNumbersRange.rangeBitwiseAnd(0, 1))
    }

    @Test
    fun testLRUCache() {
        val cache = LRUCache(2)
        cache.put(1, 1)
        cache.put(2, 2)
        assertEquals(1, cache.get(1))
        cache.put(3, 3)
        assertEquals(-1, cache.get(2))
        cache.put(4, 4)
        assertEquals(-1, cache.get(1))
        assertEquals(3, cache.get(3))
        assertEquals(4, cache.get(4))
    }

    @Test
    fun testJumpGame() {
        assertEquals(true, JumpGame.canJump(intArrayOf(2, 3, 1, 1, 4)))
        assertEquals(false, JumpGame.canJump(intArrayOf(3, 2, 1, 0, 4)))
        assertEquals(true, JumpGame.canJump(intArrayOf(2, 4, 2, 1, 0, 2, 0)))
    }

    @Test
    fun testLongestCommonSubsequence() {
        assertEquals(3, LongestCommonSubsequence.longestCommonSubsequence("abcde", "ace"))
        assertEquals(3, LongestCommonSubsequence.longestCommonSubsequence("ace", "abcde"))
        assertEquals(3, LongestCommonSubsequence.longestCommonSubsequence("abc", "abc"))
        assertEquals(0, LongestCommonSubsequence.longestCommonSubsequence("abc", "def"))
    }

    @Test
    fun testMaximalSquare() {
        assertEquals(0, MaximalSquare.maximalSquare(emptyArray()))
        assertEquals(0, MaximalSquare.maximalSquare(listOf("".toCharArray()).toTypedArray()))
        assertEquals(4, MaximalSquare.maximalSquare(listOf("10100".toCharArray(), "10111".toCharArray(), "11111".toCharArray(), "10010".toCharArray()).toTypedArray()))
    }

    @Test
    fun testFirstUniqueNumber() {
        var firstUnique = FirstUnique(intArrayOf(2, 3, 5))
        assertEquals(2, firstUnique.showFirstUnique())
        firstUnique.add(5)
        assertEquals(2, firstUnique.showFirstUnique())
        firstUnique.add(2)
        assertEquals(3, firstUnique.showFirstUnique())
        firstUnique.add(3)
        assertEquals(-1, firstUnique.showFirstUnique())

        firstUnique = FirstUnique(intArrayOf(7, 7, 7, 7, 7, 7))
        assertEquals(-1, firstUnique.showFirstUnique())
        firstUnique.add(7)
        firstUnique.add(3)
        firstUnique.add(3)
        firstUnique.add(7)
        firstUnique.add(17)
        assertEquals(17, firstUnique.showFirstUnique())

        firstUnique = FirstUnique(intArrayOf(809))
        assertEquals(809, firstUnique.showFirstUnique())
        firstUnique.add(809)
        assertEquals(-1, firstUnique.showFirstUnique())
    }
}
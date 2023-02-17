package leetcode.easy

import leetcode.*
import leetcode.easy.array.*
import leetcode.easy.list.reverseList
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.*

class Test {
    @Test
    fun testRemoveDuplicatesFromSortedArray() {
        assertEquals(2, removeDuplicates(listOf(1, 1, 2).toIntArray()))
        assertEquals(5, removeDuplicates(listOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4).toIntArray()))
    }

    @Test
    fun testBestTimeToBuyAndSellStock() {
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(listOf(7, 1, 5, 3, 6, 4).toIntArray()))
        assertEquals(4, BestTimeToBuyAndSellStock.maxProfit(listOf(1, 2, 3, 4, 5).toIntArray()))
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(listOf(7, 6, 4, 3, 1).toIntArray()))
        assertEquals(0, BestTimeToBuyAndSellStock.maxProfit(IntArray(0)))
    }

    @Test
    fun testBestTimeToBuyAndSellStockII() {
        assertEquals(7, BestTimeToBuyAndSellStockII.maxProfit(listOf(7, 1, 5, 3, 6, 4).toIntArray()))
        assertEquals(4, BestTimeToBuyAndSellStockII.maxProfit(listOf(1, 2, 3, 4, 5).toIntArray()))
        assertEquals(0, BestTimeToBuyAndSellStockII.maxProfit(listOf(7, 6, 4, 3, 1).toIntArray()))
    }

    @Test
    fun testValidPalindrome() {
        assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"))
        assertFalse(ValidPalindrome.isPalindrome("race a car"))
    }

    @Test
    fun testUglyNumber() {
        assertEquals(true, UglyNumber.isUgly(6))
        assertEquals(true, UglyNumber.isUgly(8))
        assertEquals(false, UglyNumber.isUgly(14))
        assertEquals(true, UglyNumber.isUgly(1))
    }

    @Test
    fun testTwoSum() {
        assertContentEquals(intArrayOf(0, 1), twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun testHeightChecker() {
        assertEquals(3, heightChecker(intArrayOf(1, 1, 4, 2, 1, 3)))
        assertEquals(5, heightChecker(intArrayOf(5, 1, 2, 3, 4)))
        assertEquals(0, heightChecker(intArrayOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun testIsLongPressedName() {
        assertEquals(false, isLongPressedName("alex", "alexxr"))
        assertEquals(true, isLongPressedName("alex", "aaleex"))
        assertEquals(false, isLongPressedName("saeed", "ssaaedd"))
        assertEquals(true, isLongPressedName("leelee", "lleeelee"))
        assertEquals(true, isLongPressedName("laiden", "laiden"))
    }

    @Test
    fun longestPalindromeTest() {
        assertEquals(7, longestPalindrome("abccccdd"))
        assertEquals(1, longestPalindrome("a"))
    }

    @Test
    fun testIsOneBitCharacter() {
        assertEquals(true, isOneBitCharacter(intArrayOf(1, 1, 0)))
        assertEquals(false, isOneBitCharacter(intArrayOf(1, 1, 1, 0)))
    }

    @Test
    fun testKthLargest() {
        val kthLargest = KthLargest(3, intArrayOf(4, 5, 8, 2))
        assertEquals(4, kthLargest.add(3))
        assertEquals(5, kthLargest.add(5))
        assertEquals(5, kthLargest.add(10))
        assertEquals(8, kthLargest.add(9))
        assertEquals(8, kthLargest.add(4))
    }

    @Test
    fun testArrayQuickSort() {
        val array = intArrayOf(2, 4, 7, 3, 6, 6, 5, 1, 0)
        ArrayQuickSort.quickSort(array)
        assertContentEquals(intArrayOf(0, 1, 2, 3, 4, 5, 6, 6, 7), array)
    }

    @Test
    fun testFloodFill() {
        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1)),
            floodFill(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1)), 0, 0, 2)
        )
        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 2, 2)),
            floodFill(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0)), 0, 0, 2)
        )
    }

    @Test
    fun testMergeTrees() {
        var root1: TreeNode? = TreeNode(1)
        var root2 = BinaryTree(listOf(1, 2)).head
        assertEquals("2, 2", mergeTrees(root1, root2).joinToString())

        root1 = BinaryTree(listOf(1, 3, 2, 5)).head
        root2 = BinaryTree(listOf(2, 1, 3, null, 4, null, 7)).head
        assertEquals("3, 4, 5, 5, 4, null, 7", mergeTrees(root1, root2).joinToString())
    }

    @Test
    fun reverseListTest() {
        assertNull(reverseList(null))
        assertContentEquals(intArrayOf(2, 1), reverseList(intArrayOf(1, 2).toList())!!.toIntArray())
        assertContentEquals(
            intArrayOf(5, 4, 3, 2, 1),
            reverseList(intArrayOf(1, 2, 3, 4, 5).toList())!!.toIntArray()
        )
    }

    @Test
    fun climbStairsTest() {
        assertEquals(3, climbStairs(3))
        assertEquals(5, climbStairs(4))
    }

    @Test
    fun reverseBitsTest() {
        assertEquals(1, reverseBits(2147483648.toInt()))
        assertEquals(964176192, reverseBits(43261596))
        assertEquals(-1073741825, reverseBits(4294967293.toInt()))
    }

    @Test
    fun searchRange() {
        assertContentEquals(intArrayOf(-1, -1), searchRange(intArrayOf(), 0))
        assertContentEquals(intArrayOf(-1, -1), searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6))
        assertContentEquals(intArrayOf(3, 4), searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8))
    }

    @Test
    fun minCostClimbingStairs() {
        assertEquals(15, minCostClimbingStairs(intArrayOf(10, 15, 20)))
        assertEquals(6, minCostClimbingStairs(intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)))
    }

    @Test
    fun matrixReshapeTest() {
        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(1, 2, 3, 4)),
            matrixReshape(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 1, 4)
        )
        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)),
            matrixReshape(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)), 2, 4)
        )
    }

    @Test
    fun generatePascalTriangleTest() {
        Assertions.assertArrayEquals(
            arrayOf(
                intArrayOf(1),
                intArrayOf(1, 1),
                intArrayOf(1, 2, 1),
                intArrayOf(1, 3, 3, 1),
                intArrayOf(1, 4, 6, 4, 1)
            ), generatePascalTriangle(5).map { it.toIntArray() }.toTypedArray()
        )
    }

    @Test
    fun deleteDuplicatesTest() {
        assertEquals(null, deleteDuplicates(null))
        assertContentEquals(intArrayOf(1), deleteDuplicates(intArrayOf(1).toList())!!.toIntArray())
        assertContentEquals(intArrayOf(1, 2), deleteDuplicates(intArrayOf(1, 1, 2).toList())!!.toIntArray())
        assertContentEquals(intArrayOf(1), deleteDuplicates(intArrayOf(1, 1, 1).toList())!!.toIntArray())
    }

    @Test
    fun longestCommonPrefix() {
        assertEquals("a", longestCommonPrefix(arrayOf("a","a")))
        assertEquals("", longestCommonPrefix(arrayOf("a","b")))
        assertEquals("a", longestCommonPrefix(arrayOf("a","aa")))
        assertEquals("a", longestCommonPrefix(arrayOf("ab","aa")))
        assertEquals("fl", longestCommonPrefix(arrayOf("flower","flow","flight")))
        assertEquals("", longestCommonPrefix(arrayOf("dog","racecar","car")))
    }

    @Test
    fun testMyQueue() {
        val myQueue = MyQueue()
        myQueue.push(1)
        myQueue.push(2)
        assertEquals(1, myQueue.peek())
        assertEquals(1, myQueue.pop())
        assertFalse(myQueue.empty())
    }


}
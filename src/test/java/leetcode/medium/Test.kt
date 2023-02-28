package leetcode.medium

import leetcode.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {

    @Test
    fun testSearchInRotatedSortedArrayII() {
        assertEquals(true, SearchInRotatedSortedArrayII.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 0))
        assertEquals(false, SearchInRotatedSortedArrayII.search(intArrayOf(2, 5, 6, 0, 0, 1, 2), 3))
    }

    @Test
    fun getHint() {
        assertEquals("1A3B", getHint("1807", "7810"))
        assertEquals("1A1B", getHint("1123", "0111"))
    }

    @Test
    fun testWordLadder() {
        assertEquals(5, WordLadder.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log", "cog")))
        assertEquals(0, WordLadder.ladderLength("hit", "cog", listOf("hot", "dot", "dog", "lot", "log")))
    }

    @Test
    fun testLinkedListCycleII() {
        var head = ListNode(3)
        head.next = ListNode(2)
        var next = head.next
        next!!.next = ListNode(0)
        next = head.next
        next!!.next = ListNode(-4)
        next = head.next
        next!!.next = head.next
        assertEquals(head.next, LinkedListCycleII.detectCycle(head))

        head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = head
        assertEquals(head, LinkedListCycleII.detectCycle(head))

        head.next = null
        assertEquals(null, LinkedListCycleII.detectCycle(head))
    }

    @Test
    fun characterReplacement() {
        assertEquals(4, characterReplacement("ABAB", 2))
        assertEquals(4, characterReplacement("AABABBA", 1))
    }

    @Test
    fun findOrder() {
        assertContentEquals(intArrayOf(0), findOrder(1, arrayOf()))
        assertContentEquals(intArrayOf(0, 1), findOrder(2, arrayOf(intArrayOf(1, 0))))
        assertContentEquals(
            intArrayOf(0, 1, 2, 3),
            findOrder(
                4,
                arrayOf(intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 1), intArrayOf(3, 2))
            )
        )
    }

    @Test
    fun maxProduct() {
        assertEquals(6, maxProduct(intArrayOf(2, 3, -2, 4)))
        assertEquals(0, maxProduct(intArrayOf(-2, 0, -1)))
    }

    @Test
    fun testBinaryTreeLevelOrderTraversal() {
        val root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right!!.left = TreeNode(15)
        root.right!!.right = TreeNode(7)

        assertEquals(
            "[3], [9, 20], [15, 7]",
            BinaryTreeLevelOrderTraversal.levelOrder(root).joinToString()
        )
    }

    @Test
    fun testProductOfNumbers() {
        val pon = ProductOfNumbers()
        pon.add(3)
        assertEquals(3, pon.getProduct(1))
        pon.add(0)
        pon.add(2)
        pon.add(5)
        pon.add(4)
        assertEquals(20, pon.getProduct(2))
        assertEquals(40, pon.getProduct(3))
        assertEquals(0, pon.getProduct(4))
        pon.add(8)
        assertEquals(32, pon.getProduct(2))
    }

    @Test
    fun testNetworkDelayTime() {
        assertEquals(
            2,
            networkDelayTime(arrayOf(intArrayOf(2, 1, 1), intArrayOf(2, 3, 1), intArrayOf(3, 4, 1)), 4, 2)
        )
    }

    @Test
    fun testTwoSumII() {
        assertContentEquals(intArrayOf(1, 2), twoSumII(intArrayOf(2, 7, 11, 15), 9))
        assertContentEquals(intArrayOf(1, 3), twoSumII(intArrayOf(2, 3, 4), 6))
        assertContentEquals(intArrayOf(1, 2), twoSumII(intArrayOf(-1, 0), -1))
    }

    @Test
    fun testRemoveNthFromEnd() {
        assertContentEquals(
            intArrayOf(1, 2, 3, 5),
            removeNthFromEnd(intArrayOf(1, 2, 3, 4, 5).toList(), 2)!!.toIntArray()
        )
        assertContentEquals(intArrayOf(1), removeNthFromEnd(intArrayOf(1, 2).toList(), 1)!!.toIntArray())
        assertEquals(null, removeNthFromEnd(intArrayOf(1).toList(), 1))
    }

    @Test
    fun testMaxAreaOfIsland() {
        assertEquals(0, maxAreaOfIsland(arrayOf(intArrayOf(0, 0, 0, 0))))
        assertEquals(
            6, maxAreaOfIsland(
                arrayOf(
                    intArrayOf(0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
                    intArrayOf(0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0),
                    intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0),
                    intArrayOf(0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0)
                )
            )
        )
    }

    @Test
    fun testUpdateMatrix() {
        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0)),
            updateMatrix(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0)))
        )

        Assertions.assertArrayEquals(
            arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 2, 1)),
            updateMatrix(arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1)))
        )
    }

    @Test
    fun testOrangesRotting() {
        assertEquals(0, orangesRotting(arrayOf(intArrayOf(0, 2))))
        assertEquals(
            -1, orangesRotting(
                arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(0, 1, 1),
                    intArrayOf(1, 0, 1)
                )
            )
        )
        assertEquals(
            4, orangesRotting(
                arrayOf(
                    intArrayOf(2, 1, 1),
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 1, 1)
                )
            )
        )
    }

    @Test
    fun combineTest() {
        assertEquals(listOf(listOf(1)), combine(1, 1))
        assertEquals(listOf(listOf(1, 2)), combine(2, 2))
        assertEquals(listOf(listOf(1, 2), listOf(1, 3), listOf(2, 3)), combine(3, 2))
    }

    @Test
    fun permutateTest() {
        assertEquals(listOf(listOf(1)), permute(intArrayOf(1)))
        assertEquals(listOf(listOf(0, 1), listOf(1, 0)), permute(intArrayOf(0, 1)))
        assertEquals(
            "[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]",
            permute(intArrayOf(1, 2, 3)).joinToString(separator = ",", prefix = "[", postfix = "]") {
                it.joinToString(
                    separator = ",",
                    prefix = "[",
                    postfix = "]"
                )
            }
        )
    }

    @Test
    fun robTest() {
        assertEquals(4, rob(intArrayOf(1, 2, 3, 1)))
        assertEquals(12, rob(intArrayOf(2, 7, 9, 3, 1)))
    }

    @Test
    fun minimumTotalTest() {
        assertEquals(11, minimumTotal(listOf(listOf(2), listOf(3, 4), listOf(6, 5, 7), listOf(4, 1, 8, 3))))
        assertEquals(-1, minimumTotal(listOf(listOf(-1))))
    }

    @Test
    fun findMinTest() {
        assertEquals(1, findMin(intArrayOf(3, 4, 5, 1, 2)))
        assertEquals(0, findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2)))
        assertEquals(11, findMin(intArrayOf(11, 13, 15, 17)))
    }

    @Test
    fun findPeakElementTest() {
        assertEquals(2, findPeakElement(intArrayOf(1, 2, 3, 1)))
        assertEquals(5, findPeakElement(intArrayOf(1, 2, 1, 3, 5, 6, 4)))
    }

    @Test
    fun intervalIntersectionTest() {
        assertEquals(
            "[[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]",
            intervalIntersection(
                arrayOf(intArrayOf(0, 2), intArrayOf(5, 10), intArrayOf(13, 23), intArrayOf(24, 25)),
                arrayOf(intArrayOf(1, 5), intArrayOf(8, 12), intArrayOf(15, 24), intArrayOf(25, 26))
            ).joinToString(separator = ",", prefix = "[", postfix = "]") {
                it.joinToString(
                    separator = ",",
                    prefix = "[",
                    postfix = "]"
                )
            }
        )
        assertEquals(
            "[]",
            intervalIntersection(
                arrayOf(intArrayOf(1, 3), intArrayOf(5, 9)),
                arrayOf()
            ).joinToString(separator = ",", prefix = "[", postfix = "]") {
                it.joinToString(
                    separator = ",",
                    prefix = "[",
                    postfix = "]"
                )
            }
        )
    }

    @Test
    fun findAnagramsTest() {
        assertContentEquals(intArrayOf(1, 2, 3, 5), findAnagrams("abacbabc", "abc").toIntArray())
        assertContentEquals(intArrayOf(0, 6), findAnagrams("cbaebabacd", "abc").toIntArray())
        assertContentEquals(intArrayOf(0, 1, 2), findAnagrams("abab", "ab").toIntArray())
    }

    @Test
    fun numSubarrayProductLessThanKTest() {
        assertEquals(8, numSubarrayProductLessThanK(intArrayOf(10, 5, 2, 6), 100))
        assertEquals(0, numSubarrayProductLessThanK(intArrayOf(1, 2, 3), 0))
    }

    @Test
    fun minSubArrayLenTest() {
        assertEquals(2, minSubArrayLen(7, intArrayOf(2, 3, 1, 2, 4, 3)))
        assertEquals(1, minSubArrayLen(4, intArrayOf(1, 4, 4)))
        assertEquals(0, minSubArrayLen(11, intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)))
    }

    @Test
    fun findBall() {
        assertContentEquals(intArrayOf(-1), findBall(arrayOf(intArrayOf(-1))))
        assertContentEquals(
            intArrayOf(1, -1, -1, -1, -1),
            findBall(
                arrayOf(
                    intArrayOf(1, 1, 1, -1, -1),
                    intArrayOf(1, 1, 1, -1, -1),
                    intArrayOf(-1, -1, -1, 1, 1),
                    intArrayOf(1, 1, 1, 1, -1),
                    intArrayOf(-1, -1, -1, -1, -1)
                )
            )
        )
    }

    @Test
    fun findCircleNumTest() {
        assertEquals(
            2, findCircleNum(
                arrayOf(
                    intArrayOf(1, 1, 0),
                    intArrayOf(1, 1, 0),
                    intArrayOf(0, 0, 1)
                )
            )
        )
        assertEquals(
            3, findCircleNum(
                arrayOf(
                    intArrayOf(1, 0, 0),
                    intArrayOf(0, 1, 0),
                    intArrayOf(0, 0, 1)
                )
            )
        )
    }

    @Test
    fun leastInterval() {
        assertEquals(8, leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 2))
        assertEquals(6, leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 0))
        assertEquals(
            16,
            leastInterval(charArrayOf('A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'), 2)
        )

    }

    @Test
    fun longestPalindrome() {
        assertEquals(
            14,
            longestPalindrome(
                arrayOf(
                    "qo",
                    "fo",
                    "fq",
                    "qf",
                    "fo",
                    "ff",
                    "qq",
                    "qf",
                    "of",
                    "of",
                    "oo",
                    "of",
                    "of",
                    "qf",
                    "qf",
                    "of"
                )
            )
        )
        assertEquals(2, longestPalindrome(arrayOf("gg")))
        assertEquals(2, longestPalindrome(arrayOf("ll", "gg")))
        assertEquals(6, longestPalindrome(arrayOf("lc", "cl", "gg")))
        assertEquals(8, longestPalindrome(arrayOf("ab", "ty", "yt", "lc", "cl", "ab")))
    }

    @Test
    fun multiplyStrings() {
        assertEquals("6", multiply("2", "3"))
        assertEquals("56088", multiply("123", "456"))
    }

    @Test
    fun pathSumIII() {
        assertEquals(
            3,
            PathSumIII.pathSum(BinaryTree(listOf(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1)).head, 8)
        )
        assertEquals(
            3,
            PathSumIII.pathSum(BinaryTree(listOf(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1)).head, 22)
        )
    }

    @Test
    fun spiralOrder() {
        assertContentEquals(
            listOf(1, 2),
            spiralOrder(arrayOf(intArrayOf(1, 2)))
        )
        assertContentEquals(
            listOf(1, 2, 3, 6, 9, 8, 7, 4, 5),
            spiralOrder(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)))
        )
    }

    @Test
    fun topKFrequent() {
        assertContentEquals(
            listOf("i", "love"),
            topKFrequent(arrayOf("i", "love", "leetcode", "i", "love", "coding"), 2)
        )
        assertContentEquals(
            listOf("the", "is", "sunny", "day"),
            topKFrequent(arrayOf("the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"), 4)
        )

    }

    @Test
    fun testReverseInteger() {
        assertEquals(123, reverse(321))
        assertEquals(0, reverse(0))
        assertEquals(0, reverse(Int.MAX_VALUE))
        assertEquals(0, reverse(Int.MIN_VALUE))
    }
}
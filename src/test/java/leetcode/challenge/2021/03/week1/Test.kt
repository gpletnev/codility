package leetcode.challenge.`2021`.`03`.week1

import leetcode.BinaryTree
import leetcode.ListNode
import leetcode.toList
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun distributeCandiesTest() {
        Assert.assertEquals(3, distributeCandies(intArrayOf(1, 1, 2, 2, 3, 3)))
        Assert.assertEquals(2, distributeCandies(intArrayOf(1, 1, 2, 3)))
        Assert.assertEquals(1, distributeCandies(intArrayOf(1, 1, 1, 1)))
    }

    @Test
    fun findErrorNumsTest() {
        Assert.assertArrayEquals(intArrayOf(2, 3), findErrorNums(intArrayOf(1, 2, 2, 4)))
        Assert.assertArrayEquals(intArrayOf(1, 2), findErrorNums(intArrayOf(1, 1)))
    }

    @Test
    fun missingNumberTest() {
        Assert.assertEquals(2, missingNumber(intArrayOf(3, 0, 1)))
        Assert.assertEquals(2, missingNumber(intArrayOf(0, 1)))
        Assert.assertEquals(8, missingNumber(intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)))
        Assert.assertEquals(1, missingNumber(intArrayOf(0)))
    }

    @Test
    fun getIntersectionNodeTest() {
        let {
            val intersect = intArrayOf(8, 4, 5).toList()

            val headA = ListNode(4)
            headA.next = ListNode(1)
            headA.next!!.next = intersect

            val headB = ListNode(5)
            headB.next = ListNode(6)
            headB.next!!.next = ListNode(1)
            headB.next!!.next!!.next = intersect

            Assert.assertEquals(intersect, getIntersectionNode(headA, headB))
        }

        let {
            val intersect = intArrayOf(2, 4).toList()

            val headA = ListNode(1)
            headA.next = ListNode(9)
            headA.next!!.next = intersect

            val headB = ListNode(3)
            headB.next = intersect

            Assert.assertEquals(intersect, getIntersectionNode(headA, headB))
        }

        let {
            val headA = intArrayOf(2, 6, 4).toList()

            val headB = intArrayOf(1, 5).toList()

            Assert.assertEquals(null, getIntersectionNode(headA, headB))
        }
    }

    @Test
    fun averageOfLevelsTest() {
        Assert.assertEquals(
            doubleArrayOf(3.0, 14.5, 11.0).joinToString(),
            averageOfLevels(BinaryTree(listOf(3, 9, 20, null, null, 15, 7)).head).joinToString()
        )
    }

    @Test
    fun minimumLengthEncodingTest() {
        Assert.assertEquals(10, minimumLengthEncoding(arrayOf("time", "me", "bell")))
        Assert.assertEquals(2, minimumLengthEncoding(arrayOf("t")))
    }
}
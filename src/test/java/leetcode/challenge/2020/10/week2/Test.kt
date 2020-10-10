package leetcode.challenge.`2020`.`10`.week2

import leetcode.TreeNode
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun testBinarySearch() {
        Assert.assertEquals(4, search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
        Assert.assertEquals(-1, search(intArrayOf(-1, 0, 3, 5, 9, 12), 2))
    }

    @Test
    fun testSerializeDeserializeBST() {
        val root = TreeNode(2)
        root.left = TreeNode(1)
        root.left!!.left = TreeNode(0)
        root.right = TreeNode(3)
        root.right!!.right = TreeNode(4)

        val serializer = Codec()
        val deserializer = Codec()
        val serialized = serializer.serialize(root)
        val deserialized = deserializer.deserialize(serialized)
        Assert.assertEquals(serialized, serializer.serialize(deserialized))
    }

    @Test
    fun testFindMinArrowShots() {
        Assert.assertEquals(2, findMinArrowShots(arrayOf(intArrayOf(3, 9), intArrayOf(7, 12), intArrayOf(3, 8), intArrayOf(6, 8), intArrayOf(9, 10), intArrayOf(2, 9), intArrayOf(0, 9), intArrayOf(3, 9), intArrayOf(0, 6), intArrayOf(2, 8))))
        Assert.assertEquals(1, findMinArrowShots(arrayOf(intArrayOf(1, 2))))
        Assert.assertEquals(1, findMinArrowShots(arrayOf(intArrayOf(2, 3), intArrayOf(2, 3))))
        Assert.assertEquals(2, findMinArrowShots(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 4), intArrayOf(4, 5))))
        Assert.assertEquals(4, findMinArrowShots(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6), intArrayOf(7, 8))))
        Assert.assertEquals(2, findMinArrowShots(arrayOf(intArrayOf(10, 16), intArrayOf(2, 8), intArrayOf(1, 6), intArrayOf(7, 12))))
        Assert.assertEquals(2, findMinArrowShots(arrayOf(intArrayOf(-2147483646, -2147483645), intArrayOf(2147483646, 2147483647))))
    }
}
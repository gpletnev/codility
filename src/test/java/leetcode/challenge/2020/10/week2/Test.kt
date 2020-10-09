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
}
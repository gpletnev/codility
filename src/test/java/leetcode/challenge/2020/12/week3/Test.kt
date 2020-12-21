package leetcode.challenge.`2020`.`12`.week3

import leetcode.BinaryTree
import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun sortedSquaresTest() {
        Assert.assertArrayEquals(intArrayOf(0, 1, 4), sortedSquares(intArrayOf(-1, 0, 2)))
        Assert.assertArrayEquals(intArrayOf(0, 1, 9, 16, 100), sortedSquares(intArrayOf(-4, -1, 0, 3, 10)))
    }

    @Test
    fun isValidBSTTest() {
        Assert.assertFalse(isValidBST(BinaryTree(listOf(5, 4, 6, null, null, 3, 7)).head))
        Assert.assertTrue(isValidBST(BinaryTree(listOf(2, 1)).head))
        Assert.assertFalse(isValidBST(BinaryTree(listOf(2, null, 1)).head))
        Assert.assertTrue(isValidBST(BinaryTree(listOf(2, 1, 3)).head))
        Assert.assertFalse(isValidBST(BinaryTree(listOf(5, 1, 4, null, null, 3, 6)).head))
    }

    @Test
    fun fourSumCountTest() {
        Assert.assertEquals(2, fourSumCount(intArrayOf(1, 2), intArrayOf(-2, -1), intArrayOf(-1, 2), intArrayOf(0, 2)))
    }

    @Test
    fun increasingTripletTest() {
        Assert.assertTrue(increasingTriplet(intArrayOf(1, 2, -1, 0, 1)))
        Assert.assertTrue(increasingTriplet(intArrayOf(1, 2, 3, 4, 5)))
        Assert.assertFalse(increasingTriplet(intArrayOf(5, 4, 3, 2, 1)))
        Assert.assertTrue(increasingTriplet(intArrayOf(2, 1, 5, 0, 4, 6)))
    }

    @Test
    fun cherryPickupTest() {

        Assert.assertEquals(
            4, cherryPickup(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1)
                )
            )
        )

        Assert.assertEquals(
            24, cherryPickup(
                arrayOf(
                    intArrayOf(3, 1, 1),
                    intArrayOf(2, 5, 1),
                    intArrayOf(1, 5, 5),
                    intArrayOf(2, 1, 1)
                )
            )
        )

        Assert.assertEquals(
            28, cherryPickup(
                arrayOf(
                    intArrayOf(1, 0, 0, 0, 0, 0, 1),
                    intArrayOf(2, 0, 0, 0, 0, 3, 0),
                    intArrayOf(2, 0, 9, 0, 0, 0, 0),
                    intArrayOf(0, 3, 0, 5, 4, 0, 0),
                    intArrayOf(1, 0, 2, 3, 0, 0, 6)
                )
            )
        )

        Assert.assertEquals(
            22, cherryPickup(
                arrayOf(
                    intArrayOf(1, 0, 0, 3),
                    intArrayOf(0, 0, 0, 3),
                    intArrayOf(0, 0, 3, 3),
                    intArrayOf(9, 0, 3, 3)
                )
            )
        )
    }

    @Test
    fun decodeAtIndexTest() {
        Assert.assertEquals(
            "l", decodeAtIndex(
                "yyuele72uthzyoeut7oyku2yqmghy5luy9qguc28ukav7an6a2bvizhph35t86qicv4gyeo6av7gerovv5lnw47954bsv2xruaej",
                123365626
            )
        )
        Assert.assertEquals("o", decodeAtIndex("leet2code3", 10))
        Assert.assertEquals("h", decodeAtIndex("ha22", 5))
        Assert.assertEquals("a", decodeAtIndex("a2345678999999999999999", 1))
    }
}
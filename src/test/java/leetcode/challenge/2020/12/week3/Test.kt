package leetcode.challenge.`2020`.`12`.week3

import leetcode.BinaryTree
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun sortedSquaresTest() {
        assertContentEquals(intArrayOf(0, 1, 4), sortedSquares(intArrayOf(-1, 0, 2)))
        assertContentEquals(intArrayOf(0, 1, 9, 16, 100), sortedSquares(intArrayOf(-4, -1, 0, 3, 10)))
    }

    @Test
    fun isValidBSTTest() {
        assertFalse(isValidBST(BinaryTree(listOf(5, 4, 6, null, null, 3, 7)).head))
        assertTrue(isValidBST(BinaryTree(listOf(2, 1)).head))
        assertFalse(isValidBST(BinaryTree(listOf(2, null, 1)).head))
        assertTrue(isValidBST(BinaryTree(listOf(2, 1, 3)).head))
        assertFalse(isValidBST(BinaryTree(listOf(5, 1, 4, null, null, 3, 6)).head))
    }

    @Test
    fun fourSumCountTest() {
        assertEquals(2, fourSumCount(intArrayOf(1, 2), intArrayOf(-2, -1), intArrayOf(-1, 2), intArrayOf(0, 2)))
    }

    @Test
    fun increasingTripletTest() {
        assertTrue(increasingTriplet(intArrayOf(1, 2, -1, 0, 1)))
        assertTrue(increasingTriplet(intArrayOf(1, 2, 3, 4, 5)))
        assertFalse(increasingTriplet(intArrayOf(5, 4, 3, 2, 1)))
        assertTrue(increasingTriplet(intArrayOf(2, 1, 5, 0, 4, 6)))
    }

    @Test
    fun cherryPickupTest() {

        assertEquals(
            4, cherryPickup(
                arrayOf(
                    intArrayOf(1, 1),
                    intArrayOf(1, 1)
                )
            )
        )

        assertEquals(
            24, cherryPickup(
                arrayOf(
                    intArrayOf(3, 1, 1),
                    intArrayOf(2, 5, 1),
                    intArrayOf(1, 5, 5),
                    intArrayOf(2, 1, 1)
                )
            )
        )

        assertEquals(
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

        assertEquals(
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
        assertEquals(
            "l", decodeAtIndex(
                "yyuele72uthzyoeut7oyku2yqmghy5luy9qguc28ukav7an6a2bvizhph35t86qicv4gyeo6av7gerovv5lnw47954bsv2xruaej",
                123365626
            )
        )
        assertEquals("o", decodeAtIndex("leet2code3", 10))
        assertEquals("h", decodeAtIndex("ha22", 5))
        assertEquals("a", decodeAtIndex("a2345678999999999999999", 1))
    }

    @Test
    fun smallestRangeIITest() {
        assertEquals(0, smallestRangeII(intArrayOf(1), 0))
        assertEquals(6, smallestRangeII(intArrayOf(0, 10), 2))
        assertEquals(3, smallestRangeII(intArrayOf(1, 3, 6), 3))
    }
}
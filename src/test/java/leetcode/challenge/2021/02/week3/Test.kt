package leetcode.challenge.`2021`.`02`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun kWeakestRowsTest() {
        Assert.assertArrayEquals(
            intArrayOf(0, 2),
            kWeakestRows(
                arrayOf(
                    intArrayOf(1, 0, 0, 0),
                    intArrayOf(1, 1, 1, 1),
                    intArrayOf(1, 0, 0, 0),
                    intArrayOf(1, 0, 0, 0)
                ),
                2
            )
        )

        Assert.assertArrayEquals(
            intArrayOf(2, 0, 3, 1),
            kWeakestRows(
                arrayOf(
                    intArrayOf(1, 1, 1, 0, 0, 0, 0),
                    intArrayOf(1, 1, 1, 1, 1, 1, 0),
                    intArrayOf(0, 0, 0, 0, 0, 0, 0),
                    intArrayOf(1, 1, 1, 0, 0, 0, 0),
                    intArrayOf(1, 1, 1, 1, 1, 1, 1)
                ),
                4
            )
        )
    }

    @Test
    fun letterCasePermutationTest() {
        Assert.assertEquals(listOf("a1b2", "A1b2", "a1B2", "A1B2"), letterCasePermutation("a1b2"))
        Assert.assertEquals(listOf("3z4", "3Z4"), letterCasePermutation("3z4"))
        Assert.assertEquals(listOf("12345"), letterCasePermutation("12345"))
        Assert.assertEquals(listOf("0"), letterCasePermutation("0"))
    }
}
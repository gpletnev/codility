package leetcode.challenge.`2021`.`02`.week3

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun kWeakestRowsTest() {
/*        Assert.assertArrayEquals(
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
        )*/

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
}
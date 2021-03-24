package leetcode.challenge.`2021`.`03`.week4

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun spellcheckerTest() {
        Assert.assertArrayEquals(
            arrayOf("kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"),
            spellchecker(
                arrayOf("KiTe", "kite", "hare", "Hare"),
                arrayOf("kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto")
            )
        )
    }

    @Test
    fun threeSumMultiTest() {
        Assert.assertEquals(20, threeSumMulti(intArrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5), 8))
        Assert.assertEquals(12, threeSumMulti(intArrayOf(1, 1, 2, 2, 2, 2), 5))
    }

    @Test
    fun advantageCountTest() {
        Assert.assertArrayEquals(
            intArrayOf(2, 11, 7, 15),
            advantageCount(intArrayOf(2, 7, 11, 15), intArrayOf(1, 10, 4, 11))
        )
        Assert.assertArrayEquals(
            intArrayOf(24, 32, 8, 12),
            advantageCount(intArrayOf(12, 24, 8, 32), intArrayOf(13, 25, 32, 1))
        )
    }
}
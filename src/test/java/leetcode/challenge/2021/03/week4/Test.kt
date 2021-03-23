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
}
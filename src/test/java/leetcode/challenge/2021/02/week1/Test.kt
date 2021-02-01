package leetcode.challenge.`2021`.`02`.week1

import org.junit.Assert
import org.junit.Test

class Test {
    @Test
    fun hammingWeightTest() {
        Assert.assertEquals(3, hammingWeight(0b00000000000000000000000000001011))
        Assert.assertEquals(1, hammingWeight(0b00000000000000000000000010000000))
        Assert.assertEquals(31, hammingWeight(-3/*0b11111111_11111111_11111111_11111101*/))
    }
}
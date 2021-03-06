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

    @Test
    fun maxAreaTest() {
        Assert.assertEquals(49, maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
        Assert.assertEquals(1, maxArea(intArrayOf(1, 1)))
        Assert.assertEquals(16, maxArea(intArrayOf(4, 3, 2, 1, 4)))
        Assert.assertEquals(0, maxArea(intArrayOf(0, 0, 0)))
    }

    @Test
    fun numberOfArithmeticSlicesTest() {
        Assert.assertEquals(8, numberOfArithmeticSlices(intArrayOf(1, 3, 5, 7, 9, 15, 20, 25, 28, 31)))
    }

    @Test
    fun minRemoveToMakeValidTest() {
        Assert.assertEquals("lee(t(c)o)de", minRemoveToMakeValid("lee(t(c)o)de)"))
        Assert.assertEquals("ab(c)d", minRemoveToMakeValid("a)b(c)d"))
        Assert.assertEquals("", minRemoveToMakeValid("))(("))
        Assert.assertEquals("(a(bc)d)", minRemoveToMakeValid("(a(b(c)d)"))
    }

    @Test
    fun romanToIntTest() {
        Assert.assertEquals(3, romanToInt("III"))
        Assert.assertEquals(4, romanToInt("IV"))
        Assert.assertEquals(9, romanToInt("IX"))
        Assert.assertEquals(58, romanToInt("LVIII"))
        Assert.assertEquals(1994, romanToInt("MCMXCIV"))
    }

    @Test
    fun brokenCalcTest() {
        Assert.assertEquals(2, brokenCalc(2, 3))
        Assert.assertEquals(2, brokenCalc(5, 8))
        Assert.assertEquals(3, brokenCalc(3, 10))
        Assert.assertEquals(1023, brokenCalc(1024, 1))
    }
}
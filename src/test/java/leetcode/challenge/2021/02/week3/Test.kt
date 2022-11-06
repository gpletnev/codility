package leetcode.challenge.`2021`.`02`.week3

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun kWeakestRowsTest() {
        assertContentEquals(
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

        assertContentEquals(
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
        assertEquals(listOf("a1b2", "A1b2", "a1B2", "A1B2"), letterCasePermutation("a1b2"))
        assertEquals(listOf("3z4", "3Z4"), letterCasePermutation("3z4"))
        assertEquals(listOf("12345"), letterCasePermutation("12345"))
        assertEquals(listOf("0"), letterCasePermutation("0"))
    }

    @Test
    fun maxAreaTest() {
        assertEquals(49, maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
        assertEquals(1, maxArea(intArrayOf(1, 1)))
        assertEquals(16, maxArea(intArrayOf(4, 3, 2, 1, 4)))
        assertEquals(0, maxArea(intArrayOf(0, 0, 0)))
    }

    @Test
    fun numberOfArithmeticSlicesTest() {
        assertEquals(8, numberOfArithmeticSlices(intArrayOf(1, 3, 5, 7, 9, 15, 20, 25, 28, 31)))
    }

    @Test
    fun minRemoveToMakeValidTest() {
        assertEquals("lee(t(c)o)de", minRemoveToMakeValid("lee(t(c)o)de)"))
        assertEquals("ab(c)d", minRemoveToMakeValid("a)b(c)d"))
        assertEquals("", minRemoveToMakeValid("))(("))
        assertEquals("(a(bc)d)", minRemoveToMakeValid("(a(b(c)d)"))
    }

    @Test
    fun romanToIntTest() {
        assertEquals(3, romanToInt("III"))
        assertEquals(4, romanToInt("IV"))
        assertEquals(9, romanToInt("IX"))
        assertEquals(58, romanToInt("LVIII"))
        assertEquals(1994, romanToInt("MCMXCIV"))
    }

    @Test
    fun brokenCalcTest() {
        assertEquals(2, brokenCalc(2, 3))
        assertEquals(2, brokenCalc(5, 8))
        assertEquals(3, brokenCalc(3, 10))
        assertEquals(1023, brokenCalc(1024, 1))
    }
}
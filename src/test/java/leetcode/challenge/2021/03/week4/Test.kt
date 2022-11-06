package leetcode.challenge.`2021`.`03`.week4

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class Test {
    @Test
    fun spellcheckerTest() {
        assertContentEquals(
            arrayOf("kite", "KiTe", "KiTe", "Hare", "hare", "", "", "KiTe", "", "KiTe"),
            spellchecker(
                arrayOf("KiTe", "kite", "hare", "Hare"),
                arrayOf("kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto")
            )
        )
    }

    @Test
    fun threeSumMultiTest() {
        assertEquals(20, threeSumMulti(intArrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5), 8))
        assertEquals(12, threeSumMulti(intArrayOf(1, 1, 2, 2, 2, 2), 5))
    }

    @Test
    fun advantageCountTest() {
        assertContentEquals(
            intArrayOf(2, 11, 7, 15),
            advantageCount(intArrayOf(2, 7, 11, 15), intArrayOf(1, 10, 4, 11))
        )
        assertContentEquals(
            intArrayOf(24, 32, 8, 12),
            advantageCount(intArrayOf(12, 24, 8, 32), intArrayOf(13, 25, 32, 1))
        )
    }

    @Test
    fun pacificAtlanticTest() {
        assertEquals(
            listOf(
                listOf(0, 4),
                listOf(1, 3),
                listOf(1, 4),
                listOf(2, 2),
                listOf(3, 0),
                listOf(3, 1),
                listOf(4, 0)
            ).joinToString(),
            pacificAtlantic(
                arrayOf(
                    intArrayOf(1, 2, 2, 3, 5),
                    intArrayOf(3, 2, 3, 4, 4),
                    intArrayOf(2, 4, 5, 3, 1),
                    intArrayOf(6, 7, 1, 4, 5),
                    intArrayOf(5, 1, 1, 2, 4)
                )
            ).joinToString()
        )
    }

    @Test
    fun wordSubsetsTest() {
        assertContentEquals(
            arrayOf("facebook", "google", "leetcode"),
            wordSubsets(arrayOf("amazon", "apple", "facebook", "google", "leetcode"), arrayOf("e", "o")).toTypedArray()
        )
        assertContentEquals(
            arrayOf("apple", "google", "leetcode"),
            wordSubsets(arrayOf("amazon", "apple", "facebook", "google", "leetcode"), arrayOf("l", "e")).toTypedArray()
        )
        assertContentEquals(
            arrayOf("facebook", "google"),
            wordSubsets(arrayOf("amazon", "apple", "facebook", "google", "leetcode"), arrayOf("e", "oo")).toTypedArray()
        )
        assertContentEquals(
            arrayOf("google", "leetcode"),
            wordSubsets(
                arrayOf("amazon", "apple", "facebook", "google", "leetcode"),
                arrayOf("eo", "lo")
            ).toTypedArray()
        )
        assertContentEquals(
            arrayOf("facebook", "leetcode"),
            wordSubsets(
                arrayOf("amazon", "apple", "facebook", "google", "leetcode"),
                arrayOf("ec", "oc", "ceo")
            ).toTypedArray()
        )
    }

    @Test
    fun countSubstringsTest() {
        assertEquals(3, countSubstrings("abc"))
        assertEquals(6, countSubstrings("aaa"))
    }

    @Test
    fun originalDigitsTest() {
        assertEquals("012", originalDigits("owoztneoer"))
        assertEquals("45", originalDigits("fviefuro"))
    }
}
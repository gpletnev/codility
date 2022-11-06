package leetcode.challenge.`2020`.`08`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun testDetectCapitalUse() {
        assertEquals(true, detectCapitalUse("USA"))
        assertEquals(false, detectCapitalUse("FlaG"))
        assertEquals(false, detectCapitalUse("?---"))
    }
}
package leetcode.challenge.august2020.week1

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testDetectCapitalUse() {
        Assert.assertEquals(true, detectCapitalUse("USA"))
        Assert.assertEquals(false, detectCapitalUse("FlaG"))
        Assert.assertEquals(true, detectCapitalUse("?---"))
    }
}
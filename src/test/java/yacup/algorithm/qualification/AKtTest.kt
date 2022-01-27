package yacup.algorithm.qualification

import org.junit.Assert
import org.junit.Test

class AKtTest {
    @Test
    fun testZeroOne() {
        Assert.assertEquals("<", zeroOne("oneone", "onezerozero"))
        Assert.assertEquals("=", zeroOne("zero", "zero"))
        Assert.assertEquals("<", zeroOne("onezero", "oneone"))
        Assert.assertEquals(">", zeroOne("oneonezerozero", "onezeroonezero"))
        Assert.assertEquals(">", zeroOne("one", "zero"))
        Assert.assertEquals("=", zeroOne("one", "one"))
    }
}
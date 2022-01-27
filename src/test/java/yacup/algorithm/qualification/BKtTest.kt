package yacup.algorithm.qualification

import org.junit.Assert
import org.junit.Test

class BKtTest {

    @Test
    fun pow2matrix() {
        Assert.assertEquals(1, pow2matrix(1, 1))
        Assert.assertEquals(3, pow2matrix(1, 2))
        Assert.assertEquals(6, pow2matrix(2, 2))
        Assert.assertEquals(11, pow2matrix(1, 8))
        Assert.assertEquals(11, pow2matrix(2, 4))
//        Assert.assertEquals(21, pow2matrix(4, 4))
    }
}
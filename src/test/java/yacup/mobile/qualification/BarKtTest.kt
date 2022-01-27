package yacup.mobile.qualification

import org.junit.Assert
import org.junit.Test

class BarKtTest {

    @Test
    fun covidBar() {
        Assert.assertArrayEquals(
            booleanArrayOf(true, true, true, false, true, false, true, true),
            covidBar(2, 3, intArrayOf(1, 3, 5, 1, 8, 5, 0, 6))
        )

        Assert.assertArrayEquals(
            booleanArrayOf(true, true, true, true, true, true, false, true, false, false),
            covidBar(3, 4, intArrayOf(1, 9, 0, 7, 2, 7, 6, 4, 10, 5))
        )
    }
}
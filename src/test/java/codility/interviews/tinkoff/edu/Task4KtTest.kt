package codility.interviews.tinkoff.edu

import org.junit.Assert
import org.junit.Test

class Task4KtTest {

    @Test
    fun task4() {
        Assert.assertArrayEquals(intArrayOf(1, 2), task4(intArrayOf(1, 1)).toIntArray())
        Assert.assertArrayEquals(intArrayOf(-1, -1), task4(intArrayOf(1, 2, 3)).toIntArray())
        Assert.assertArrayEquals(intArrayOf(1, 2), task4(intArrayOf(1, 3, 1)).toIntArray())
        Assert.assertArrayEquals(intArrayOf(-1, -1), task4(intArrayOf(1, 3, 2)).toIntArray())
        Assert.assertArrayEquals(intArrayOf(-1, -1), task4(intArrayOf(2, 1)).toIntArray())
    }
}
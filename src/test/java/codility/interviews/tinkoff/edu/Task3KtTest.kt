package codility.interviews.tinkoff.edu

import org.junit.Assert
import org.junit.Test

class Task3KtTest {

    @Test
    fun task3() {
        Assert.assertArrayEquals(intArrayOf(1, 2), task3(listOf(2, 1)).toIntArray())
        Assert.assertArrayEquals(intArrayOf(-1, -1), task3(listOf(1, 2)).toIntArray())
        Assert.assertArrayEquals(intArrayOf(-1, -1), task3(listOf(2, 1, 4, 6)).toIntArray())
    }
}
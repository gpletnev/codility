package codility.interviews.tinkoff.edu

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Task4KtTest {

    @Test
    fun task4() {
        assertContentEquals(intArrayOf(1, 2), task4(intArrayOf(1, 1)).toIntArray())
        assertContentEquals(intArrayOf(-1, -1), task4(intArrayOf(1, 2, 3)).toIntArray())
        assertContentEquals(intArrayOf(1, 2), task4(intArrayOf(1, 3, 1)).toIntArray())
        assertContentEquals(intArrayOf(-1, -1), task4(intArrayOf(1, 3, 2)).toIntArray())
        assertContentEquals(intArrayOf(-1, -1), task4(intArrayOf(2, 1)).toIntArray())
    }
}
package codility.interviews.tinkoff.edu

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Task3KtTest {

    @Test
    fun task3() {
        assertContentEquals(intArrayOf(1, 2), task3(listOf(2, 1)).toIntArray())
        assertContentEquals(intArrayOf(-1, -1), task3(listOf(1, 2)).toIntArray())
        assertContentEquals(intArrayOf(-1, -1), task3(listOf(2, 1, 4, 6)).toIntArray())
    }
}
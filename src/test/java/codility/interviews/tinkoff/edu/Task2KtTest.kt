package codility.interviews.tinkoff.edu

import org.junit.Assert
import org.junit.Test

class Task2KtTest {

    @Test
    fun task2() {
        Assert.assertEquals(4, task2(4, 7))
        Assert.assertEquals(9, task2(100, 1000))
    }
}
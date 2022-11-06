package interview.yandex

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Yandex220127Test {

    @Test
    fun removeSmiles() {
        assertEquals("", Yandex220127.removeSmiles(":-)"))
        assertEquals("", Yandex220127.removeSmiles(":-("))
        assertEquals(")", Yandex220127.removeSmiles(":-()"))
        assertEquals("", Yandex220127.removeSmiles(":-)))"))
        assertEquals("b", Yandex220127.removeSmiles(":-)b"))
        assertEquals("ab", Yandex220127.removeSmiles("a:-((b"))
    }

    @Test
    fun isOneChangeTest() {
        assertTrue(Yandex220127.isOneChange("", ""))
        assertTrue(Yandex220127.isOneChange("a", "ab"))
        assertTrue(Yandex220127.isOneChange("ab", "a"))
        assertTrue(Yandex220127.isOneChange("cat", "bat"))
        assertTrue(Yandex220127.isOneChange("cat", "cab"))
        assertTrue(Yandex220127.isOneChange("cat", "crat"))

        assertFalse(Yandex220127.isOneChange("ab", "ba"))
        assertFalse(Yandex220127.isOneChange("aba", "bad"))
        assertTrue(Yandex220127.isOneChange("cat", "acata"))
    }
}
package interview.yandex

import org.junit.Assert
import org.junit.Test

class Yandex220127Test {

    @Test
    fun removeSmiles() {
        Assert.assertEquals("", Yandex220127.removeSmiles(":-)"))
        Assert.assertEquals("", Yandex220127.removeSmiles(":-("))
        Assert.assertEquals(")", Yandex220127.removeSmiles(":-()"))
        Assert.assertEquals("", Yandex220127.removeSmiles(":-)))"))
        Assert.assertEquals("b", Yandex220127.removeSmiles(":-)b"))
        Assert.assertEquals("ab", Yandex220127.removeSmiles("a:-((b"))
    }

    @Test
    fun isOneChangeTest() {
        Assert.assertTrue(Yandex220127.isOneChange("", ""))
        Assert.assertTrue(Yandex220127.isOneChange("a", "ab"))
        Assert.assertTrue(Yandex220127.isOneChange("ab", "a"))
        Assert.assertTrue(Yandex220127.isOneChange("cat", "bat"))
        Assert.assertTrue(Yandex220127.isOneChange("cat", "cab"))
        Assert.assertTrue(Yandex220127.isOneChange("cat", "crat"))

        Assert.assertFalse(Yandex220127.isOneChange("ab", "ba"))
        Assert.assertFalse(Yandex220127.isOneChange("aba", "bad"))
        Assert.assertTrue(Yandex220127.isOneChange("cat", "acata"))
    }
}
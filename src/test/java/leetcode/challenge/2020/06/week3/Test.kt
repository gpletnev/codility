package leetcode.challenge.`2020`.`06`.week3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Test {

    @Test
    fun testSurroundedRegions() {
        var board = "XXXXXOOXXXOXXOXX".toBoard(4)
        var expected = "XXXXXXXXXXXXXOXX"
        SurroundedRegions.solve(board)

        assertEquals(expected, BoardToString(board))

        board = "XOXOXOXOX".toBoard(3)
        expected = "XOXOXOXOX"
        SurroundedRegions.solve(board)
        assertEquals(expected, BoardToString(board))
    }

    fun String.toBoard(columns: Int) = this.chunked(columns).map { it.toCharArray() }.toTypedArray()
    fun BoardToString(board: Array<CharArray>): String = board.joinToString("") { it.joinToString("") }

    @Test
    fun testH_IndexII() {
        assertEquals(3, H_IndexII.hIndex(intArrayOf(0, 1, 3, 5, 6)))
    }
}
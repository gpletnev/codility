package leetcode.challenge.june2020.week3

import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun testSurroundedRegions() {
        var board = "XXXXXOOXXXOXXOXX".toBoard(4)
        var expected = "XXXXXXXXXXXXXOXX"
        SurroundedRegions.solve(board)

        Assert.assertEquals(expected, BoardToString(board))

        board = "XOXOXOXOX".toBoard(3)
        expected = "XOXOXOXOX"
        SurroundedRegions.solve(board)
        Assert.assertEquals(expected, BoardToString(board))
    }

    fun String.toBoard(columns: Int) = this.chunked(columns).map { it.toCharArray() }.toTypedArray()
    fun BoardToString(board: Array<CharArray>): String = board.joinToString("") { it.joinToString("") }
}
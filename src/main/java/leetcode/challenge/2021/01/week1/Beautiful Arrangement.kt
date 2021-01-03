package leetcode.challenge.`2021`.`01`.week1

// https://leetcode.com/problems/beautiful-arrangement/
fun countArrangement(n: Int): Int {
    var count = 0
    val visited = BooleanArray(n + 1)

    fun calculate(N: Int, pos: Int, visited: BooleanArray) {
        if (pos > N) count++
        for (i in 1..N) {
            if (!visited[i] && (pos % i == 0 || i % pos == 0)) {
                visited[i] = true
                calculate(N, pos + 1, visited)
                visited[i] = false
            }
        }
    }
    calculate(n, 1, visited)
    return count
}
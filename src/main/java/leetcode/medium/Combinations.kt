package leetcode.medium

// https://leetcode.com/problems/combinations/
fun combine(n: Int, k: Int): List<List<Int>> {
    val combinations = mutableListOf<List<Int>>()
    backtrack(combinations, mutableListOf<Int>(), n, k, 1)
    return combinations
}

private fun backtrack(combinations: MutableList<List<Int>>, combination: MutableList<Int>, n: Int, k: Int, num: Int) {
    if (combination.size == k) {
        combinations.add(combination.toList())
        return
    }
    for (i in num..n) {
        combination.add(i)
        backtrack(combinations, combination, n, k, i + 1)
        combination.removeLast()
    }
}
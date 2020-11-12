package leetcode.challenge.`2020`.`11`.week2

import java.util.*

// https://leetcode.com/problems/permutations-ii/
fun permuteUnique(nums: IntArray): List<List<Int>>? {
    val results: MutableList<List<Int>> = mutableListOf()

    // count the occurrence of each number
    val counter = HashMap<Int, Int>()
    for (num in nums) {
        if (!counter.containsKey(num)) counter[num] = 0
        counter[num] = counter[num]!! + 1
    }
    val comb = LinkedList<Int>()
    backtrack(comb, nums.size, counter, results)
    return results
}

fun backtrack(
        comb: LinkedList<Int>,
        N: Int,
        counter: HashMap<Int, Int>,
        results: MutableList<List<Int>>) {
    if (comb.size == N) {
        // make a deep copy of the resulting permutation,
        // since the permutation would be backtracked later.
        results.add(ArrayList(comb))
        return
    }
    for ((num, count) in counter) {
        if (count == 0) continue
        // add this number into the current combination
        comb.addLast(num)
        counter[num] = count - 1

        // continue the exploration
        backtrack(comb, N, counter, results)

        // revert the choice for the next exploration
        comb.removeLast()
        counter[num] = count
    }
}
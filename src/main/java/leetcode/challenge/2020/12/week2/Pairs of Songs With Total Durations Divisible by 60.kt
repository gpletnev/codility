package leetcode.challenge.`2020`.`12`.week2

// https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
fun numPairsDivisibleBy60(time: IntArray): Int {
    val remainders = IntArray(60)
    var count = 0
    for (t in time) {
        count += if (t % 60 == 0) {
            remainders[0]
        } else {
            remainders[60 - t % 60]
        }
        remainders[t % 60]++
    }
    return count
}
package leetcode.challenge.`2021`.`03`.week1

// https://leetcode.com/problems/distribute-candies/
fun distributeCandies(candyType: IntArray): Int {
    return minOf(candyType.distinct().size, candyType.size / 2)
}
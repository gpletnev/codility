package leetcode.challenge.`2020`.`11`.week2

// https://leetcode.com/problems/poor-pigs/
fun poorPigs(buckets: Int, minutesToDie: Int, minutesToTest: Int): Int {
    val status = minutesToTest / minutesToDie + 1
    var pigs = 0
    while (Math.pow(status.toDouble(), pigs.toDouble()) < buckets) {
        pigs++
    }
    return pigs

    //return Math.ceil(Math.log(buckets.toDouble())/Math.log((minutesToTest/minutesToDie+1).toDouble())).toInt()
}
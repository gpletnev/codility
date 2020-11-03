package leetcode.challenge.`2020`.`11`.week1

import kotlin.math.max

// https://leetcode.com/problems/consecutive-characters/
fun maxPower(s: String): Int {
    var maxPower = 1
    var power = 1
    for (i in 0 until s.lastIndex) {
        if (s[i] == s[i + 1]) {
            power++
        } else {
            maxPower = max(maxPower, power)
            power = 1
        }
    }
    return max(maxPower, power)
}
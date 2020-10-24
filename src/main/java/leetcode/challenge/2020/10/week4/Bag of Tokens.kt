package leetcode.challenge.`2020`.`10`.week4

// https://leetcode.com/problems/bag-of-tokens/
fun bagOfTokensScore(tokens: IntArray, P: Int): Int {
    tokens.sort()
    var lo = 0
    var hi = tokens.lastIndex
    var points = 0
    var score = 0
    var power = P
    while (lo <= hi && (power >= tokens[lo] || points > 0)) {
        while (lo <= hi && power >= tokens[lo]) {
            power -= tokens[lo++]
            points++
        }
        score = Math.max(score, points)
        if (lo <= hi && points > 0) {
            power += tokens[hi--]
            points--
        }
    }

    return score
}
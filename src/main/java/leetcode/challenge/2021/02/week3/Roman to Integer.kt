package leetcode.challenge.`2021`.`02`.week3

// https://leetcode.com/problems/roman-to-integer/
fun romanToInt(s: String): Int {
    val map = mutableMapOf(
        'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
    )

    var result = map[s.last()]!!
    for (i in s.length - 2 downTo 0) {
        val value = map[s[i]]!!
        if (value >= map[s[i + 1]]!!)
            result += value
        else
            result -= value
    }
    return result
}
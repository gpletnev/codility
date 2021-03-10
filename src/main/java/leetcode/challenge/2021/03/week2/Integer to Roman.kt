package leetcode.challenge.`2021`.`03`.week2

// https://leetcode.com/problems/integer-to-roman/
fun intToRoman(num: Int): String {
    var num = num
    val values = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    val roman = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")

    var i = 0
    return buildString {
        while (num > 0) {
            while (num >= values[i]) {
                num -= values[i]
                append(roman[i])
            }
            i++
        }
    }
}
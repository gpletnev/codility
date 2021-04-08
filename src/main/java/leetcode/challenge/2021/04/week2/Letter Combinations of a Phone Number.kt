package leetcode.challenge.`2021`.`04`.week2

import java.util.*

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
fun letterCombinations(digits: String): List<String> {
    val mapping = arrayOf("0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
    val ans = LinkedList<String>()
    if (digits.isEmpty()) return ans
    ans.add("")
    while (ans.peek().length != digits.length) {
        val remove = ans.remove()
        val map = mapping[digits[remove.length] - '0']
        for (c in map.toCharArray()) {
            ans.addLast(remove + c)
        }
    }
    return ans
}
package leetcode.medium

// https://leetcode.com/problems/longest-repeating-character-replacement/
fun characterReplacement(s: String, k: Int): Int {
    var start = 0
    val frequencyMap = IntArray(26)
    var maxFrequency = 0
    var longestSubstringLength = 0
    var end = 0
    while (end < s.length) {

        // if 'A' is 0, then what is the relative order
        // or offset of the current character entering the window
        // 0 is 'A', 1 is 'B' and so on
        val currentChar = s[end] - 'A'
        frequencyMap[currentChar] += 1

        // the maximum frequency we have seen in any window yet
        maxFrequency = maxOf(maxFrequency, frequencyMap[currentChar])

        // move the start pointer towards right if the current
        // window is invalid
        val isValid = end + 1 - start - maxFrequency <= k
        if (!isValid) {
            // offset of the character moving out of the window
            val outgoingChar = s[start] - 'A'

            // decrease its frequency
            frequencyMap[outgoingChar] -= 1

            // move the start pointer forward
            start += 1
        }

        // the window is valid at this point, note down the length
        // size of the window never decreases
        longestSubstringLength = end + 1 - start
        end += 1
    }
    return longestSubstringLength
}

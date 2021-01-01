package leetcode.challenge.`2020`.`05`.week3

// https://leetcode.com/problems/permutation-in-string/
object PermutationInString {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false

        val s1map = IntArray(26)
        val s2map = IntArray(26)
        for (i in 0..s1.lastIndex) {
            s1map[s1[i] - 'a']++
            s2map[s2[i] - 'a']++
        }

        var count = 0

        for (i in 0..25) if (s1map[i] == s2map[i]) count++

        for (i in 0 until s2.length - s1.length) {
            if (count == 26) return true

            val right: Int = s2[i + s1.length] - 'a'
            val left: Int = s2[i] - 'a'

            s2map[right]++
            if (s2map[right] == s1map[right]) {
                count++
            } else if (s2map[right] == s1map[right] + 1) {
                count--
            }

            s2map[left]--
            if (s2map[left] == s1map[left]) {
                count++
            } else if (s2map[left] == s1map[left] - 1) {
                count--
            }
        }
        return count == 26
    }
}
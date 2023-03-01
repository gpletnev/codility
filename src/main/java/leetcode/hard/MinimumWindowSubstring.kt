package leetcode.hard

// https://leetcode.com/problems/minimum-window-substring/
fun minWindow(s: String, t: String): String {
    val freq = IntArray(128)
    t.forEach { freq[it.code]++ }

    var minWindow = ""
    var count = t.length
    var left = 0
    var right = 0

    while (right < s.length) {
        if (freq[s[right].code]-- > 0) count--

        while (count == 0) {
            if (minWindow.isEmpty() || minWindow.length > right - left + 1) {
                minWindow = s.substring(left, right + 1)
            }
            if (++freq[s[left++].code] > 0) count++
        }
        right++
    }
    return minWindow
}
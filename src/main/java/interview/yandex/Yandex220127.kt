package interview.yandex

object Yandex220127 {

    //    ":-)" -> ""
    //    ":-(" -> ""
    //    ":-)))" -> ""
    //    ":-((" -> ""
    //
    //    "a:-)b" -> "ab"
    //    ":-)(" -> "("
    fun removeSmiles(s: String): String {
        var i = 0
        val sb = StringBuilder()

        while (i < s.length) {
            if (i + 2 < s.length && s[i] == ':' && s[i + 1] == '-' && s[i + 2] in listOf('(', ')')) {
                val p = s[i + 2]
                i += 3
                while (i < s.length && s[i] == p) {
                    i++
                }
            } else {
                sb.append(s[i])
                i++
            }
        }
        return sb.toString()
    }

    // is it possible to get s2 from s1 with only one change (replace, delete, add one symbol)
    fun isOneChange(s1: String, s2: String): Boolean {
        var count = 0
        if (s1.length == s2.length) {
            for (i in s1.indices) {
                if (s1[i] != s2[i]) {
                    if (count > 0) return false else count++
                }
            }
        }

        if (s1.length < s2.length) {
            var i = 0
            var j = 0

            while (i < s1.length) {
                if (s1[i] != s2[j]) {
                    count++
                    j++
                }
                if (count > 1) return false
                i++
                j++
            }
        }

        if (s1.length > s2.length) {
            var i = 0
            var j = 0

            while (j < s2.length) {
                if (s1[i] != s2[j]) {
                    count++
                    i++
                }
                if (count > 1) return false
                i++
                j++
            }
        }

        return true
    }
}
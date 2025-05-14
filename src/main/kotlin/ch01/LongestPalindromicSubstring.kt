package ch01

object LongestPalindromicSubstring {

    fun longestPalindrome(s: String): String {
        if (s.length == 1) {
            return s
        }
        if (s.length == 2) {
            if (s[0] == s[1]) {
                return s
            } else {
                return s[0].toString()
            }
        }

        val oneRes = findStr(s, 1)
        val twoRes = findStr(s, 2)

        return if (oneRes.length > twoRes.length) oneRes else twoRes
    }

    private fun findStr(s: String, window: Int): String {
        var p1 = 0
        var p2 = window
        var res = ""
        while (p2 < s.length) {
            if (s[p1] == s[p2]) {
                val str = s.substring(p1, p2 + 1)
                if (res.length < str.length) {
                    res = str
                }
                if (p1 == 0) {
                    if (p2 == s.length - 1) {
                        break
                    }
                    p1 = p2 / 2
                    if(p1 == 0) {
                        p1++
                    }
                    p2 = p1 + window
                } else {
                    p1--
                    p2++
                }
            } else {
                if (p2 - p1 != window) {
                    p1 = (p1 + p2) / 2 + 1
                    p2 = p1 + window
                }
                p1++
                p2++
            }

        }
        return res
    }

}

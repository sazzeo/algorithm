package ch01

object LongestPalindromicSubstring {


    //https://leetcode.com/problems/longest-palindromic-substring/
    //66ms
    fun longestPalindrome(s: String): String {
        if (s.length == 1) {
            return s
        }
        if (s.length == 2) {
            return if (s[0] == s[1]) {
                s
            } else {
                s[0].toString()
            }
        }

        val oneRes = findStr(s, 1)
        val twoRes = findStr(s, 2)
        if (oneRes.isEmpty() && twoRes.isEmpty()) {
            return s[0].toString()
        }
        return if (oneRes.length > twoRes.length) oneRes else twoRes
    }

    private fun findStr(s: String, window: Int): String {
        var p1 = 0
        var p2 = window
        var res = ""
        var firstP1 = 0
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
                    p1 = firstP1++ + 1
                    p2 = p1 + window
                } else {
                    p1--
                    p2++
                }
            } else {
                if (p2 - p1 != window) {
                    p1 = firstP1++ + 1
                    p2 = p1 + window
                }
                p1++
                p2++
            }

        }
        return res
    }

}

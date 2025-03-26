package ch01

// https://leetcode.com/problems/valid-palindrome/description/
class ValidPalindrome {

    // 39ms
    fun isPalindrome1(str: String): Boolean {
        val newStr = str.replace(Regex("[^0-9A-Za-z]"), "")
            .uppercase()
        val reverse = newStr.reversed()

        return newStr == reverse
    }


    // 32ms
    fun isPalindrome2(str: String): Boolean {
        val newStr = str.replace(Regex("[^0-9A-Za-z]"), "")
            .uppercase()
        val lastIndex = newStr.length - 1
        newStr.forEachIndexed { index, it ->
            if (it != newStr[lastIndex - index]) {
                return false
            }
        }
        return true
    }


    // 4ms
    fun isPalindrome3(str: String): Boolean {
        if (str.isEmpty()) return true
        var l = 0
        var r = str.length - 1

        while (l < r) {
            while (!str[l].isLetterOrDigit() && l < r) l++
            while (!str[r].isLetterOrDigit() && l < r) r--

            if (str[l].lowercaseChar() != str[r].lowercaseChar()) return false
            l++
            r--
        }
        return true
    }


}

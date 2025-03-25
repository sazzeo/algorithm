package ch01

//https://leetcode.com/problems/valid-palindrome/description/
class ValidPalindrome {
    fun isPalindrome(str: String): Boolean {
        val uppercase = str.uppercase()
        val reverse = uppercase.reversed()
        return uppercase == reverse
    }
}

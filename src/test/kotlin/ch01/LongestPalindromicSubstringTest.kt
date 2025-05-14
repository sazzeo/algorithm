package ch01

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LongestPalindromicSubstringTest : StringSpec({

    "test" {
        val res =LongestPalindromicSubstring.longestPalindrome("aaaaa")
        res shouldBe "aaaaa"
    }

})
